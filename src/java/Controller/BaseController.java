/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.DBConnection;
import com.mysql.jdbc.Connection;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

/**
 *
 * @author Bia
 */
public class BaseController {
    DBConnection koneksi = new DBConnection();
    
    public ResultSet get(String sql){
        try {
            Connection con = koneksi.open();
            
            Statement state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            
            CachedRowSetImpl crs = new CachedRowSetImpl();
            crs.populate(rs);
            con.close();
            //menutup koneksi, biar memorynya gakjebol jadinya ditutup
            //untuk nampung sementara hasil resultset
            //kalo dikembaliin resultsetnya java gak mau terima
            //dynamic, jadi gak langsung pake arraylist
            return crs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public boolean preparedStatement(Map<Integer, Object> map, String sql){
        try {
            Connection con = koneksi.open();
            PreparedStatement ps = con.prepareStatement(sql);
            
            for (Map.Entry<Integer, Object> en : map.entrySet()) {
                ps.setString(en.getKey(), en.getValue().toString());
                
            }
            
            int rows = ps.executeUpdate();
            con.close();
            return rows !=0;
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
    
    public ResultSet getWithParameter (Map <Integer, Object> map, String sql){
        try {
            Connection con = koneksi.open();
            PreparedStatement ps = con.prepareStatement(sql);
            
            for (Map.Entry<Integer, Object> en : map.entrySet()) {
                ps.setString(en.getKey(), en.getValue().toString());
                
            }
            
            ResultSet rs = ps.executeQuery();
            
            CachedRowSetImpl crs = new CachedRowSetImpl();
            crs.populate(rs);
            
            con.close();
            
            return crs;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}

//hubungan dengan database di satu package semua
//bisa reusable