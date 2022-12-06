/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Amanda
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     request.getRequestDispatcher("login.jsp").forward(request, response);
    }

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*Cria novo usuario*/
        Usuario user = new Usuario();
        
        user.setCpf(request.getParameter("cpfUser"));
        user.setSenha(request.getParameter("SenhaUser"));
        
        request.getRequestDispatcher("sucessoLogin.jsp").forward(request, response);
        /*Valida criação*/
    try {
         boolean logado = UsuarioDAO.cadastroUsuario(user);
        if(logado){
             request.getRequestDispatcher("sucessoLogin.jsp").forward(request, response);
             logado = true;
        }else{
        request.setAttribute("erro", "Algum erro aconteceu. Tente novamente!");
        }
    } catch (ClassNotFoundException ex) {
    }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
