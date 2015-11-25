package br.com.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.modelo.Cliente;

@ManagedBean
@SessionScoped
public class ClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Cliente cliente = new Cliente();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	
	public String salvar(){
		clientes.add(cliente);
		cliente = new Cliente();
		return "listarCliente";
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
}
