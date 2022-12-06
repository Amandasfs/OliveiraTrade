/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Amanda
 */
public class Usuario {
    private String nome;
    private String email;
    private String genero;
    private String endereco;
    private String senha;
    private String dataNascimento;
    private String telefone;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String  cpf) {
        this.cpf = cpf;
    }
    public String  getTelefone() {
        return telefone;
    }

    public void setTelefone(String  telefone) {
        this.telefone = telefone;
    }
    public String  getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String  dataNascimento){
        this.dataNascimento = dataNascimento;
    }
}
