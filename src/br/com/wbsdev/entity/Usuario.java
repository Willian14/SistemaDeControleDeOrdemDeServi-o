/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wbsdev.entity;

import java.math.BigInteger;

/**
 *
 * @author Willian
 */
public class Usuario {
    private Long idUsu;
    private String nome;
    private String telefone;
    private String login;
    private String senha;
    private String tipo;
    
    public Usuario(){
        
    }
    
    public void setId(Long idUsu){
        this.idUsu = idUsu;
    }
    public Long getIdUsu(){
        return idUsu;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getLogin(){
        return login;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsu=" + idUsu + ", nome=" + nome + ", telefone=" + telefone + ", login=" + login + ", senha=" + senha + ", tipo=" + tipo + '}';
    }
    
    
    
}
