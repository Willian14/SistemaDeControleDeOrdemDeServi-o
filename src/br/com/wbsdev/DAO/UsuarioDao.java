/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wbsdev.DAO;

import br.com.wbsdev.connection.ConnectionFactory;
import br.com.wbsdev.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Willian
 */
public class UsuarioDao {
    private   PreparedStatement pst = null;
    private ResultSet rs = null;
    private Usuario usu;
    
    Connection con = ConnectionFactory.getConnection();
    
    public Boolean cadastrar(Usuario usu){
        String sql = "insert into tbusuarios(usuario,fone,login,senha,tipo) values(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, usu.getNome());
            pst.setString(2, usu.getTelefone());
            pst.setString(3,usu.getLogin());
            pst.setString(4,usu.getSenha());
            pst.setString(5, usu.getTipo());
            pst.execute();
            pst.close();
            return true;
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public Boolean alterar(Usuario usu){
        String sql = "update tbusuarios set usuario = ?, fone = ?, login = ?, senha = ?, tipo = ?  where iduser = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, usu.getNome());
            pst.setString(2, usu.getTelefone());
            pst.setString(3, usu.getLogin());
            pst.setString(4, usu.getSenha());
            pst.setString(5, usu.getTipo());
            pst.setLong(6, usu.getIdUsu());
            pst.execute();
            pst.close();
            return true;
        } catch (Exception e) {
        }
        return null;
    }
    
    public Boolean deletar(Long idUser){
        String sql = "delete from tbusuarios where iduser = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setLong(1, idUser);
            pst.execute();
            pst.close();
            return true;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
    }
    
    public List<Usuario> buscarTodos() throws SQLException{
        String sql = "select * from tbusuarios";
        List<Usuario> lista = new ArrayList<Usuario>();
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(rs.next()){
            Usuario usu = new Usuario();
            
            usu.setId(rs.getLong("iduser"));
            usu.setNome(rs.getString("usuario"));
            usu.setTelefone(rs.getString("fone"));
            usu.setLogin(rs.getString("login"));
            usu.setSenha(rs.getString("senha"));
            usu.setTipo(rs.getString("tipo"));
            
            lista.add(usu);
         
        }
           return lista;
    }
    
   public Usuario buscarPorId(Long idUser) throws SQLException{
       String sql = "select * from tbusuarios where iduser = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setLong(1, idUser);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(rs.next()){
            Usuario usu = new Usuario();
            usu.setId(rs.getLong("iduser"));
            usu.setNome(rs.getString("usuario"));
            usu.setTelefone(rs.getString("fone"));
            usu.setLogin(rs.getString("login"));
            usu.setSenha(rs.getString("senha"));
            usu.setTipo(rs.getString("tipo"));
            return usu;       
        }
        return null;
   } 
   
   public Boolean salvar(Usuario usu){
       if(usu.getIdUsu() != null){
           alterar(usu);
          
       }else{
           cadastrar(usu);
           return true;
       }
       return null;
   }
   
   public Usuario verificaSeExisteNoBanco(String login, String senha) throws SQLException{
          String sql ="select * from tbusuarios where login=? and senha=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, login);
            pst.setString(2, senha);
            rs = pst.executeQuery();
            if(rs.next()){
                 usu = new Usuario();
                 usu.setId(rs.getLong("iduser"));
                 usu.setNome(rs.getString("usuario"));
                 usu.setTipo(rs.getString("tipo"));
                 return usu;
         }
            pst.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
     
             
         return null;
       
   }
   
    public ArrayList buscarTodosParaPreencherTabela() throws SQLException{
        String sql = "select * from tbusuarios";
        ArrayList lista = new ArrayList<>();
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(rs.next()){
              lista.add(new Object[]{
              new Integer(rs.getInt("iduser")).toString(),
              rs.getString("usuario"),
              rs.getString("fone"),
              rs.getString("login"),
              rs.getString("senha"),
              rs.getString("tipo")
              
              });
         
        }
           return lista;
    }
}
