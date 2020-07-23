/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.UserDetModel;
import Query.UserDetQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bia
 */
public class UserdetController extends BaseController{
    UserDetQuery query = new UserDetQuery();
    UserDetModel model = new UserDetModel();
    
    public boolean createUserDet (UserDetModel model) throws SQLException{
        Map<Integer, Object> map = new HashMap();
        map.put(1, model.getUsername());
        map.put(2, model.getEmail());
        map.put(3, model.getFullname());
        map.put(4, model.getNickname());
        map.put(5, model.getBday());
        map.put(6, model.getPhoneNum());
        map.put(7, model.getPack());
        
        String sql = this.query.createUserDet;
        return this.preparedStatement(map, sql);
    }
    
    public UserDetModel showprofile(String username) throws SQLException{
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, username);
        
        String sql = this.query.showprofil;
        ResultSet rs = this.getWithParameter(map, sql);
        
        if (rs.next()) {
            model.setFullname(rs.getString("userdet_fullname"));
            model.setNickname(rs.getString("userdet_nickname"));
            model.setPhoneNum(rs.getString("userdet_phone"));
            model.setEmail(rs.getString("userdet_email"));
            model.setBday(rs.getString("userdet_bday"));
            model.setConsul_date(rs.getString("consul_date"));
            model.setConsul_time(rs.getString("consul_time"));
            model.setConsul_doctor(rs.getString("consul_doctor"));
            model.setConsul_via(rs.getString("consul_via"));
            model.setPayment(rs.getString("userdet_package"));
            
        }
        
        return model;
    }
    
    public UserDetModel showeditprofile(String username) throws SQLException{
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, username);
        
        String sql = this.query.showeditprofil;
        ResultSet rs = this.getWithParameter(map, sql);
        
        if (rs.next()) {
            model.setFullname(rs.getString("userdet_fullname"));
            model.setNickname(rs.getString("userdet_nickname"));
            model.setPhoneNum(rs.getString("userdet_phone"));
            model.setEmail(rs.getString("userdet_email"));
            model.setBday(rs.getString("userdet_bday"));
        }
        
        return model;
    }
    
    public boolean updateprofile (UserDetModel model) throws SQLException{
        Map<Integer, Object> map = new HashMap();
        map.put(1, model.getFullname());
        map.put(2, model.getNickname());
        map.put(3, model.getPhoneNum());
        map.put(4, model.getEmail());
        map.put(5, model.getEmail());
        
        String sql = this.query.updateprofil;
        
        return this.preparedStatement(map, sql);
    }
    
//    public boolean delete (MainModel model) throws SQLException{
//        Map<Integer, Object> map = new HashMap();
//        map.put(1, model.getId());
//        
//        String sql = this.query.delete;
//        
//        return this.preparedStatement(map, sql);
//    }
}
