/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Query;

/**
 *
 * @author Bia
 */
public class MainQuery {
    public String createuser = "INSERT INTO `user` (`user_email`, `user_username`, "
                            + "`user_password`) VALUES (?,?,?);";
    public String ceklogin = "SELECT * FROM user WHERE user_username=?";
    
    
}
