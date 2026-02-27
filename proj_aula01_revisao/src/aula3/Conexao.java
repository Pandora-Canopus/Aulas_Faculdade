package aula3;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public static Connection getConexao() {
		Connection con = null;
		
		String url = "jdbc:mysql://localhost:3306/Aula3";
		String user = "root";
		String password = "12345";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			System.out.println("Falha na Conexão -> "+e.getMessage());
		}
		
		return con;
	}
	
	public static void main(String[] args) {
		Conexao.getConexao();
		
	}

}
