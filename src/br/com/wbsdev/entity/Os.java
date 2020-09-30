/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wbsdev.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;

/**
 *
 * @author Willian
 */
public class Os {
        private BigInteger idOs;
        private Calendar dataOs;
        private String equipamento;
        private String defeito;
        private String obs;
        private String laudo;
        private String tecnico;
        private BigDecimal valor;
        private Calendar dataEntrega;
        private Calendar dataRealizacao;
        private Cliente cli;
        
        
        public void setIdOs(BigInteger idOs){
            this.idOs = idOs;
        }
        public BigInteger getIdOs(){
            return idOs;
        }
        public void setDataOs(Calendar dataOs){
            this.dataOs = dataOs;
        }
        public Calendar getDataOs(){
            return dataOs;
        }
        public void setEquipamento(String equipamento){
            this.equipamento = equipamento;
        }
        public String getEquipamento(){
            return equipamento;
        }
        public void setDefeito(String defeito){
            this.defeito = defeito;
        }
        public String getDefeito(){
            return defeito;
        }
        public void setObs(String obs){
            this.obs = obs;
        }
        public String getObs(){
            return obs;
        }
        public void setLaudo(String laudo){
            this.laudo = laudo;
        }
        public String getLAudo(){
            return laudo;
        }
        public void setTecnico(String tecnico){
            this.tecnico = tecnico;
        }
        public String getTecnico(){
            return tecnico;
        }
        public void setValor(BigDecimal valor){
            this.valor = valor;
        }
        public BigDecimal getValor(){
            return valor;
        }
        public void setDataEntrega(Calendar dataEntrega){
            this.dataEntrega = dataEntrega;
        }
        public Calendar getDataEntrega(){
            return dataEntrega;
        }
        public void setDataRealizacao(Calendar dataRealizacao){
            this.dataRealizacao = dataRealizacao;
        }
        public Calendar getDataRealizacao(){
            return dataRealizacao;
        }
        public void setCliente(Cliente cli){
            this.cli = cli;
        }
        public Cliente getCliente(){
            return cli;
        }

    @Override
    public String toString() {
        return "Os{" + "idOs=" + idOs + ", dataOs=" + dataOs + ", equipamento=" + equipamento + ", defeito=" + defeito + ", obs=" + obs + ", laudo=" + laudo + ", tecnico=" + tecnico + ", valor=" + valor + ", dataEntrega=" + dataEntrega + ", dataRealizacao=" + dataRealizacao + ", cli=" + cli + '}';
    }
        
        
                
}
