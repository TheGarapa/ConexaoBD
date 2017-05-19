package Project;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {

	public Statement stm;
	public ResultSet rs;
	private String driver = "org.postgresql.Driver";
	private String url = "jdbc:postgresql://localhost:5432/Garapa"; 
	private String usuario = "postgres";
	private String senha = "garapa";
	public Connection con;

	public void Conexao(){
	  
	    try {
//		System.setProperty("jdbc.Drivers", driver);
		con=DriverManager.getConnection(url, usuario, senha);
		JOptionPane.showMessageDialog(null, "Conexão bem sucedida!");
                
} // chaves da linha try

		catch (SQLException ex) {
		JOptionPane.showMessageDialog(null, "Não foi possível se conectar ao banco de dados: "+ex);
} // chaves da linha catch
  
    }    
 
}   
