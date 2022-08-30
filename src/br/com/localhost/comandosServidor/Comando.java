package br.com.localhost.comandosServidor;

import br.com.localhost.controle.Controle;
import br.com.localhost.servidor.BancoDeDados;

public abstract class Comando {

	protected Comando proximo;
	protected BancoDeDados referenciaDB;
	
	public Comando(BancoDeDados referenciaDB, Comando comando) {
		this.proximo = comando;
		this.referenciaDB = referenciaDB;
	}
	
	public abstract boolean executarComando(Controle controle);
	
	public boolean verificarComando(Controle controle) {
		if (deveAplicar(controle)) {
			return executarComando(controle);
		}
		return proximo.verificarComando(controle);
	}
	
	public abstract boolean deveAplicar(Controle controle);
	
}
