
import br.com.wbsdev.DAO.UsuarioDao;
import br.com.wbsdev.connection.ConnectionFactory;
import br.com.wbsdev.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Willian
 */
public class TesteConnection {
    public static void main(String[] args) throws SQLException{
          //testeCadastrar();
          //testeAlterar();
         // testeDeletar();
        // testeBuscarTodos();
        //testeBuscarPorId();
        testeSalvar();
    }
    private static void testeCadastrar(){
            UsuarioDao usuDao = new UsuarioDao();
        Usuario usu = new Usuario();
        usu.setNome("Elaine");
        usu.setTelefone("67 99277-1592");
        usu.setLogin("Laine");
        usu.setSenha("12345");
        usu.setTipo("admin");
       Boolean cadastrou =  usuDao.cadastrar(usu);
       if(cadastrou){
           System.out.println("Usuário cadastrado com sucesso!");
       }else{
           System.out.println("Erro ao cadastrar usuário!");
       }
        
    
    }
       private static void testeAlterar(){
            UsuarioDao usuDao = new UsuarioDao();
        Usuario usu = new Usuario();
        usu.setId(new Long("1"));
        usu.setNome("Elaine Cristina");
        usu.setTelefone("67 99277-1592");
        usu.setLogin("elaine");
        usu.setSenha("12345");
        usu.setTipo("admin");
       Boolean cadastrou =  usuDao.alterar(usu);
       if(cadastrou){
           System.out.println("Usuário Alterado com sucesso!");
       }else{
           System.out.println("Erro ao cadastrar usuário!");
       }
        
    
    }
    
   private static void testeDeletar(){
       Long idUser = new Long("3");
       UsuarioDao usuDao = new UsuarioDao();
       usuDao.deletar(idUser);
   }    
   
   private static void testeBuscarTodos() throws SQLException{
       UsuarioDao usuDao = new UsuarioDao();
       List<Usuario> lista = usuDao.buscarTodos();
      for(Usuario usu : lista){
          System.out.println(usu.toString());
      }  
     
   }
   
   private static void testeBuscarPorId() throws SQLException{
       Long idUser = new Long("4");
       UsuarioDao usuDao = new UsuarioDao();
       Usuario usu = usuDao.buscarPorId(idUser);
       
       System.out.println(usu.toString());
   }
   
  private static void testeSalvar(){
      UsuarioDao usuDao = new UsuarioDao();
         Usuario usu = new Usuario();
         usu.setId(new Long("6"));
        usu.setNome("Fulaninho da Silva Sauro");
        usu.setTelefone("67 99277-1592");
        usu.setLogin("Full");
        usu.setSenha("12345");
        usu.setTipo("colaborador");
        usuDao.salvar(usu);
  }
    
      
}
