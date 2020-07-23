/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.MainController;
import Model.UserDetModel;
import Controller.UserdetController;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Bia
 */
public class editprofileServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = request.getSession(true);
            
            String username = session.getAttribute("username").toString();
        
            UserdetController mc = new UserdetController();
            UserDetModel model = mc.showeditprofile(username);

            request.setAttribute("user", model);
            RequestDispatcher dispatch = request.getRequestDispatcher("/views/editprofile.jsp"); //yang diganti yg tanda kutip
            dispatch.forward(request, response);

        } catch (SQLException e) {
            Logger.getLogger(editprofileServlet.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String fullname = request.getParameter("fullname");
            String nickname = request.getParameter("nickname");
            String phone = request.getParameter("phonenum");
            String email = request.getParameter("email");
            String bday = request.getParameter("birthday");
            
            UserDetModel model = new UserDetModel();
            model.setFullname(fullname);
            model.setNickname(nickname);
            model.setPhoneNum(phone);
            model.setEmail(email);
            model.setBday(bday);
            
            UserdetController uc = new UserdetController();
            boolean check = uc.updateprofile(model);
            
            if(check){
                //go to profile page
                response.sendRedirect("profile");
            }
            
        } catch (SQLException e) {
            Logger.getLogger(editprofileServlet.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
