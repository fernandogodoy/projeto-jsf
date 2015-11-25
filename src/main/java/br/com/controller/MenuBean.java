package br.com.controller;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MenuBean {
	
	public String principal(){
		return "bemVindo";
	}
	public String cadastrarCliente(){
		return "cadastrarCliente";
	}
	public String listarCliente(){
		return "listarCliente";
	}
}
