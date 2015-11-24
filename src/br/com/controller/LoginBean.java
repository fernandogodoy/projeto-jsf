package br.com.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.modelo.Usuario;

@RequestScoped
@ManagedBean
public class LoginBean {

	private Usuario usuario = new Usuario();

	public String conectar() {
		if (usuario.getUser().equals("") && 
				usuario.getSenha().equals("")) {
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, 
							"Login ou Senha não informados", "login"));
			return "index.xhtml";
		}
		return "bemVindo.xhtml";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
