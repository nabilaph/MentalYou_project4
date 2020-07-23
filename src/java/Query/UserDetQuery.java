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
public class UserDetQuery {
    public String createUserDet = "INSERT INTO `user_det` ( `user_username`,"
                        + "`userdet_email`, `userdet_fullname`,"
                        + " `userdet_nickname`, `userdet_bday`, `userdet_phone`,"
                        + " `userdet_package`) VALUES (?, ?, ?, ?, ?, ?, ?);";
    
    public String showprofil = "SELECT u.userdet_fullname, u.userdet_nickname, "
            + "u.userdet_phone, u.userdet_email, u.userdet_bday, c.consul_date, "
            + "c.consul_time, c.consul_doctor , c.consul_via, u.userdet_package"
            + " FROM consul_det c JOIN user_det u ON c.user_username = u.user_username "
            + "WHERE c.user_username = ?";
    
    public String updateprofil = "UPDATE user_det SET userdet_fullname = ?, userdet_nickname = ?,"
                            + " userdet_phone = ?, userdet_email = ?,"
                            + " userdet_bday= ? WHERE user_username = ?";
    
    public String showeditprofil = "SELECT userdet_fullname, userdet_nickname, userdet_phone,"
                                 + " userdet_email, userdet_bday "
                                 + "FROM user_det WHERE user_username = ?";
    
    public String deleteconsuldet = "DELETE FROM consul_det WHERE user_username = ?";
}
