package aula3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MarcaDao {
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String sql = "";
	
	
	public void salvar(Marca marca) {
		con = Conexao.getConexao();
		sql = "INSERT INTO Marca(marnome) VALUES (?); ";
		
		try {
			ps.getConnection().prepareStatement(sql);
			ps.setString(1, marca.getMarnome());
			ps.execute();
			System.out.println("Cadastro Realizado com Sucesso.");
		} catch (Exception e) {
			System.out.println("Erro no Salvar: -> "+e.getMessage());
		}
	}
	
	public Marca pesquisar(int codigo) {
		con = Conexao.getConexao();
		sql = "SELECT * FROM Marca WHERE Marcod = "+codigo+";";
		
		
		Marca marca = null;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				marca = new Marca();
				marca.setMarcod(rs.getInt("Marcod"));
				marca.setMarnome(rs.getString("Marnome"));
			}
		} catch (Exception e) {
			System.out.println("Erro ao Pesquisar: -> "+e.getMessage());
		}
		
		return marca;
		
	}
	
	public void alterar() {
		
	}
	
	public void excluir() {
		
	}
	
	

}
