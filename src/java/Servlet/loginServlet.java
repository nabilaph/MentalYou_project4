/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controller.MainController;
import Model.UserModel;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Bia
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/login"})
public class loginServlet extends HttpServlet {

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
       
            HttpSession session = request.getSession(true);
        
        if(session.getAttribute("auth") != null){
            response.sendRedirect("");
        } else{
            RequestDispatcher dispatch = request.getRequestDispatcher("/views/login.jsp"); //yang diganti yg tanda kutip
            dispatch.forward(request, response);
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
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            UserModel model = new UserModel();
            model.setUsername(username);
            model.setPassword(password);
            
            MainController ac = new MainController();
            ArrayList check = ac.ceklogin(model);
            
            if(check.isEmpty()){
                request.setAttribute("alert", "Username/Password is invalid!");
                RequestDispatcher dispatch = request.getRequestDispatcher("/views/login.jsp"); //yang diganti yg tanda kutip
                dispatch.forward(request, response);
            } else{
                //Go to index page
                HttpSession session = request.getSession(true);
                session.setAttribute("id", check.get(0).toString());
                session.setAttribute("name", check.get(1).toString());
                session.setAttribute("username", check.get(2).toString());
                session.setAttribute("auth", true);
                response.sendRedirect("profile?username="+username);
            }
            
        } catch (SQLException e) {
            Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, e);
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
