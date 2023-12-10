package teste;

import java.sql.ResultSet;
import java.sql.SQLException;

import models.Usuario;

public class TestUser {
	
	private Usuario usuario = null;
	
	public TestUser() {
		listar();
		System.out.println("\n=========================\n");
		//insert();
		//System.out.println("\n=========================\n");
		//listar();
		System.out.println("\n=========================\n");
		usuario.setIdUsuario("10");
		usuario.delete();
		System.out.println("\n=========================\n");
		listar();
	}

	private void listar() {
		this.usuario = new Usuario();
		ResultSet rs = usuario.listAll();
		try {
			while ( rs.next() ) {
				String out = "";
				out +=  "\t" +rs.getString("idUsuario");
				out +=  "\t" +rs.getString("email");
				out +=  "\t" +rs.getString("senha");
				out +=  "\t" +rs.getString("idNivelUsuario");
				out +=  "\t" +rs.getString("nome");
				out +=  "\t" +rs.getString("cpf");
				out +=  "\t" +rs.getString("endereco");
				out +=  "\t" +rs.getString("bairro");
				out +=  "\t" +rs.getString("cidade");
				out +=  "\t" +rs.getString("uf");
				out +=  "\t" +rs.getString("cep");
				out +=  "\t" +rs.getString("telefone");
				out +=  "\t" +rs.getString("foto");
				out +=  "\t" +rs.getString("ativo");
				System.out.println(out);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void insert() {
		this.usuario = new Usuario("0", "asdfgdfd@qwert", "123456", "1", "Eu", "8745685", "", "", "","","", "","","");
		this.usuario.save();

	}
	public static void main(String[] args) {
		new TestUser();
	}
}
