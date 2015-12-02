package br.com.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.dao.ClienteDao;
import br.com.modelo.Cliente;

@ManagedBean
@SessionScoped
public class ClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Cliente cliente;
	private List<Cliente> clientes;
	private ClienteDao dao;

	@PostConstruct
	private void init() {
		cliente = new Cliente();
		clientes = new ArrayList<Cliente>();
		dao = new ClienteDao();
	}

	public String salvar() {
		dao.salvar(cliente);
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
		return dao.findAll();
	}
}
