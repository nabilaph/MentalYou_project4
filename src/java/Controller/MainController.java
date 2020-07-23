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

    public boolean createuser (UserModel model) throws SQLException{
        Map<Integer, Object> map = new HashMap();
        map.put(1, model.getEmail());
        map.put(2, model.getUsername());
        map.put(3, model.getPassword());
        
        String sql = this.query.createuser;
        return this.preparedStatement(map, sql);
    }
    
    public ArrayList ceklogin(UserModel model) throws SQLException {
        Map<Integer, Object> map = new HashMap();
        map.put(1, model.getUsername());
        
        String sql = this.query.ceklogin;
        
        ResultSet rs = this.getWithParameter(map, sql);
        
        while(rs.next()){
            String pass = rs.getString("user_password");
            boolean check = model.getPassword().equals(pass);
            
            if(check){
                this.arraylist.add(rs.getString("user_id"));
                this.arraylist.add(rs.getString("user_email"));
                this.arraylist.add(rs.getString("user_username"));
            }
        }
        
        return this.arraylist;
    }
    
    
        
    
        
    
    
//     public ArrayList getUser() throws SQLException {
//        String query = this.query.showuser;
//        ResultSet rs = this.get(query);
//        
//        while (rs.next()) {
//            UserModel model = new UserModel();
//            model.setUsername(rs.getString("user_username"));
//            model.setPassword(rs.getString("user_password"));
//            
//            arraylist.add(model);
//        }
//        
//        return arraylist;
//    }
//    
    
    
//    public boolean update (MainModel model) throws SQLException{
//        Map<Integer, Object> map = new HashMap();
//        map.put(1, model.getName());
//        map.put(2, model.getCategory());
//        map.put(3, model.getQty());
//        map.put(4, model.getExpired_at());
//        map.put(5, model.getId());
//        
//        String sql = this.query.update;
//        
//        return this.preparedStatement(map, sql);
//    }
//    
//    public boolean delete (MainModel model) throws SQLException{
//        Map<Integer, Object> map = new HashMap();
//        map.put(1, model.getId());
//        
//        String sql = this.query.delete;
//        
//        return this.preparedStatement(map, sql);
//    }
}
