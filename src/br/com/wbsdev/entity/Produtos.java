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
public class Produtos {
    private Integer idProd;
    private String descricao;
    private BigDecimal valorCusto;
    private BigDecimal valorVenda;
    private Integer qtd;
    
    public void setIdProd(Integer idProd){
        this.idProd = idProd;
    }
    public Integer getIdProd(){
        return idProd;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setValorCusto(BigDecimal valorCusto){
        this.valorCusto = valorCusto;
    }
    public BigDecimal getValorCusto(){
        return valorCusto;
    }
    public void setValorVenda(BigDecimal valorVenda){
        this.valorVenda = valorVenda;
    }
    public BigDecimal getValorVenda(){
        return valorVenda;
    }
    public void setQtd(Integer qtd){
        this.qtd = qtd;
    }
    public Integer getQtd(){
        return qtd;
    }

    @Override
    public String toString() {
        return "Produtos{" + "idProd=" + idProd + ", descricao=" + descricao + ", valorCusto=" + valorCusto + ", valorVenda=" + valorVenda + ", qtd=" + qtd + '}';
    }
    
    
    
}
