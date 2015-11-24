package br.com.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Temporal(TemporalType.DATE)
	private Date dataNasc;
	private String inscricao;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public String getInscricao() {
		return inscricao;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}
}
