package models;

import java.sql.ResultSet;

import classes.database.DBQuery;

public class Usuario {

	private int idUsuario;
	private String email;
	private String senha;
	private int idNivelUsuario;
	private String nome;
	private String cpf;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private String telefone;
	private String foto;
	private String ativo;
	
	
	private String tableName 	= "usuarios";
	private String fieldsName 	= "idUsuario,email,senha,idNivelUsuario,nome,cpf,endereco,bairro,cidade,uf,cep,telefone,foto,ativo";  
	private String fieldKey 	= "idUsuario";
	private DBQuery dbQuery = new DBQuery(tableName, fieldsName, fieldKey);
	
	public Usuario() {
	
	}

	private String[] toArray() {
		return (
			new String[] {
					this.getIdUsuario()+"" ,
					this.getEmail() ,
					this.getSenha() ,
					this.getIdNivelUsuario() ,
					this.getNome() ,
					this.getCpf() ,
					this.getEndereco() ,
					this.getBairro() ,
					this.getCidade() ,
					this.getUf() ,
					this.getCep() ,
					this.getTelefone() ,
					this.getFoto() ,
					this.getAtivo()	
			}
		);
	}
	
	public ResultSet listAll() {
		return ( this.dbQuery.select(""));
	}
	
	public int save() {
		if (this.getIdUsuario() > 0) {
			return this.dbQuery.update(this.toArray());
		}else {
			return this.dbQuery.insert(this.toArray());
		}
	}
	
	public int delete() {
		if (this.getIdUsuario() > 0) {
			return this.dbQuery.delete(this.toArray());
		}
		return(0);
	}
	
	public Usuario(String idUsuario, String email, String senha, String idNivelUsuario, String nome, String cpf, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String foto, String ativo) {
		this.setIdUsuario(idUsuario);
		this.setEmail(email);
		this.setSenha(senha);
		this.setIdNivelUsuario(idNivelUsuario);
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setUf(uf);
		this.setCep(cep);
		this.setTelefone(telefone);
		this.setFoto(foto);
		this.setAtivo(ativo);
	}
	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = Integer.parseInt(idUsuario);
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getIdNivelUsuario() {
		return idNivelUsuario+"";
	}
	public void setIdNivelUsuario(String idNivelUsuario) {
		this.idNivelUsuario = Integer.parseInt(idNivelUsuario);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	
}
