/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wbsdev.entity;

import java.math.BigDecimal;

/**
 *
 * @author Willian
 */
public class Servico {
    private Integer idServ;
    private String descricao;
    private BigDecimal valor;
    
    public void setIdServ(Integer idServ){
        this.idServ = idServ;
    }
    public Integer getIdServ(){
        return idServ;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setValor(BigDecimal valor){
        this.valor = valor;
    }
    public BigDecimal getValor(){
        return valor;
    }

    @Override
    public String toString() {
        return "Servico{" + "idServ=" + idServ + ", descricao=" + descricao + ", valor=" + valor + '}';
    }
    
    
}
