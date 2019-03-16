// Classe para conexão com banco de dados PostgreSQL.

package ProjectBD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {

	public Statement stm;
	public ResultSet rs;
	private String driver = "org.postgresql.Driver";
	private String url = "jdbc:postgresql://localhost:5432/Harley"; 
	private String usuario = "postgres";
	private String senha = "harley";
	public Connection con;

	public void Conexao(){
	  
	    try {

		con=DriverManager.getConnection(url, usuario, senha);
		JOptionPane.showMessageDialog(null, "Conexão bem sucedida!");
                
}

		catch (SQLException ex) {
		JOptionPane.showMessageDialog(null, "Não foi possível se conectar ao banco de dados: "+ex);
}
  
    }    
 
}   
