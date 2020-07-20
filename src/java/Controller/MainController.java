/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UserDetModel;
import Model.UserModel;
import Query.MainQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bia
 */
public class MainController extends BaseController{
    MainQuery query = new MainQuery();
    ArrayList arraylist = new ArrayList();

    public ArrayList getUser() throws SQLException {
        String query = this.query.showuser;
        ResultSet rs = this.get(query);
        
        while (rs.next()) {
            UserModel model = new UserModel();
            model.setUsername(rs.getString("user_username"));
            model.setPassword(rs.getString("user_password"));
            model.setEmail(rs.getString("user_email"));
            
            arraylist.add(model);
        }
        
        return arraylist;
    }
    
    public ArrayList getUserDet() throws SQLException {
        String query = this.query.showuserdet;
        ResultSet rs = this.get(query);
        
        while (rs.next()) {
            UserDetModel model = new UserDetModel();
            model.setFullname(rs.getString("userdet_fullname"));
            model.setNickname(rs.getString("userdet_nickname"));
            model.setEmail(rs.getString("user_email"));
            model.setBday(rs.getDate("userdet_bday"));
            model.setPhoneNum(rs.getString("userdet_phone"));
            model.setPack(rs.getString("userdet_package"));
            
            arraylist.add(model);
        }
        
        return arraylist;
    }
    
    public boolean create (UserModel model) throws SQLException{
        Map<Integer, Object> map = new HashMap();
        map.put(1, model.getEmail());
        map.put(2, model.getUsername());
        map.put(3, model.getPassword());
        
        String sql = this.query.create;
        return this.preparedStatement(map, sql);
    }
    
    public UserModel show(String id) throws SQLException{
        UserModel model = new UserModel();
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        String sql = this.query.show;
        ResultSet rs = this.getWithParameter(map, sql);
        
        if (rs.next()) {
            model.setId(rs.getString("id"));
            model.setName(rs.getString("name"));
            model.setCategory(rs.getString("category"));
            model.setExpired_at(rs.getString("expired_at"));
            model.setQty(rs.getInt("qty"));
        }
        
        return model;
    }
    
    public boolean update (MainModel model) throws SQLException{
        Map<Integer, Object> map = new HashMap();
        map.put(1, model.getName());
        map.put(2, model.getCategory());
        map.put(3, model.getQty());
        map.put(4, model.getExpired_at());
        map.put(5, model.getId());
        
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }
    
    public boolean delete (MainModel model) throws SQLException{
        Map<Integer, Object> map = new HashMap();
        map.put(1, model.getId());
        
        String sql = this.query.delete;
        
        return this.preparedStatement(map, sql);
    }
}
