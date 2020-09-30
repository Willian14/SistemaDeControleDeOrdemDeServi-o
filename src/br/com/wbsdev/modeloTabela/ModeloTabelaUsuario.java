/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wbsdev.modeloTabela;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Willian
 */
public class ModeloTabelaUsuario extends AbstractTableModel {
    
    private ArrayList linhas = null;
    private String[] colunas = null;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    public ModeloTabelaUsuario(){
        
    }
    public ModeloTabelaUsuario(ArrayList linhas, String[] colunas){
        this.linhas = linhas;
        this.colunas = colunas;
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    
 /***
  * Método que retorna o nome da coluna especificada
  * Esse método também faz a função de nomear as colunas. Sem ele, se as colunas forem nomeadas
  * manualmente, esses nomes não seram setados, apresentando assim, nomes default.
  * @param numColuna
  * @return retorna uma String que representa o nome da coluna
  */
    @Override
    public String getColumnName(int numColuna) {
        return colunas[numColuna];
    }
    
    

    @Override
    public Object getValueAt(int numLinha, int numColuna) {
        Object [] linha = (Object[])getLinhas().get(numLinha);
        return linha[numColuna];
    }
    
}
