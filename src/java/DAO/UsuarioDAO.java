/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexao.Conexao;
import Modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Amanda
 */
public class UsuarioDAO {
    public static boolean cadastroUsuario(Usuario user) throws ClassNotFoundException{
        /*retorna confirmação de cadastro*/
        boolean sucesso = false;
        /*Conecta Banco de dados*/
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = Conexao.getConexao();
            st = conn.prepareStatement("INSERT INTO public.dadosusuarios (nome, email, endereco, telefone, cpf, senha, datanascimento, genero) VALUES (?, ?, ?, ?, ?, ?, ?, ?);");
            /*Executa Inserts*/
            st.setString(1, user.getNome());
            st.setString(2, user.getEmail());
            st.setString(3, user.getEndereco());
            st.setString(4, user.getSenha());
            st.setString(5, user.getCpf());
            st.setString(6, user.getDataNascimento());
            st.setString(7, user.getTelefone());
            st.setString(8, user.getGenero());
            
            int linhas = st.executeUpdate();
            
            if(linhas > 0){
                sucesso = true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return sucesso;
    }
    public static boolean Login(Usuario login) throws ClassNotFoundException{
         /*retorna confirmação de cadastro*/
        boolean logado = false;
        /*Conecta Banco de dados*/
        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = Conexao.getConexao();
            st = conn.prepareStatement("Select cpf, senha from public.dadosusuarios;");
            /*Executa Inserts*/
            st.setString(1, login.getCpf());
            st.setString(2, login.getSenha());
            int linhas = st.executeUpdate();
            if(linhas > 0){
                logado = true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return logado;
    }
}
