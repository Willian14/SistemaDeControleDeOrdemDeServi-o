
import br.com.wbsdev.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Willian
 */
public class TesteDao {
    Connection con = ConnectionFactory.getConnection();
      public  void inserir(){
            String sql = "insert into tbusuarios(iduser,usuario,fone,login,senha,tipo) values(?,?,?,?,?,?)";
            
        try ( PreparedStatement preparador = con.prepareStatement(sql)){
                preparador.setInt(1, 1);
                preparador.setString(2, "Willian");
                preparador.setString(3, "67 99277-1592");
                preparador.setString(4, "Will");
                preparador.setString(5, "123456");
                preparador.setString(6,"admin");
                
                preparador.execute();
                
        } catch (SQLException ex) {
            Logger.getLogger(TesteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}
