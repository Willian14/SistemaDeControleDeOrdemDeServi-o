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
public class Cliente {
    private BigInteger idCli;
    private String nome;
    private String telefone;
    private String email;
    
    public void setIdCli(BigInteger idCli){
        this.idCli = idCli;
    }
    public BigInteger getIdCli(){
        return idCli;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String gteNome(){
        return nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCli=" + idCli + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
    
}
