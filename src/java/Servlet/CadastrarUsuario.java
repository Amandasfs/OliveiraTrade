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
@WebServlet(name = "CadastrarUsuario", urlPatterns = {"/CadastrarUsuario"})
public class CadastrarUsuario extends HttpServlet {

@Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {
   request.getRequestDispatcher("cadastro.jsp").forward(request, response);
 }
 
  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*Cria novo usuario*/
        Usuario user = new Usuario();
        
        user.setCpf(request.getParameter("cpfUser"));
        user.setTelefone(request.getParameter("telefoneUser"));
        user.setDataNascimento(request.getParameter("dataNascimentofUser"));
        user.setNome(request.getParameter("NomeUser"));
        user.setEmail(request.getParameter("EmailUser"));
        user.setEndereco(request.getParameter("EnderecoUser"));
        user.setSenha(request.getParameter("SenhaUser"));
        /*metodo para entrar o select*/
        String generoUser = request.getParameter("cpfUser");
        if(generoUser.equalsIgnoreCase("Feminino")){
            user.setGenero("Feminino");
        }else if (generoUser.equalsIgnoreCase("Masculino")){
            user.setGenero("Masculino");
        }else if (generoUser.equalsIgnoreCase("Não-Binário")){
            user.setGenero("Não-Binário");
        }else if (generoUser.equalsIgnoreCase("Outro")){
             user.setGenero("Não-Binário");
        }
        request.getRequestDispatcher("cadastroSucesso.jsp").forward(request, response);
        /*Valida criação*/
    try {
         boolean  cadastrado = UsuarioDAO.cadastroUsuario(user);
        if(cadastrado){
             request.getRequestDispatcher("cadastroSucesso.jsp").forward(request, response);
             cadastrado= true;
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
