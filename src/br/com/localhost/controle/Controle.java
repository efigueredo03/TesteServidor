package br.com.localhost.controle;

import java.io.Serializable;

public class Controle implements Serializable {

	private static final long serialVersionUID = 1L;
	private Object objeto;
	private EnumsComandos comando;
	
	public Controle(Object objeto, EnumsComandos comando) {
		this.objeto = objeto;
		this.comando = comando;
	}
	
	public Object getObjeto() {
		return objeto;
	}
	
	public EnumsComandos getComando() {
		return comando;
	}
	
}
