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
    public String create = "INSERT INTO `user` (`user_email`, `user_username`, "
                            + "`user_password`) VALUES (?,?,?);";
    public String showuser = "SELECT * FROM user WHERE user_id = ?";
    public String showuserdet = "SELECT * FROM user_det WHERE user_id = ?";
    public String update = "UPDATE user_det SET name = ?, category = ?,"
                            + " qty = ?, expired_at = ? WHERE id = ?";
    public String delete = "DELETE FROM products WHERE id = ?";
}
