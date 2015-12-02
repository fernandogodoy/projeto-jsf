package br.com.modelo;

import java.io.Serializable;

public class Usuario implements Serializable{

	private Long id;
	private String user;
	private String senha;

	public Long getId() {
		return id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
