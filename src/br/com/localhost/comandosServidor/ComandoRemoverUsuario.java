package br.com.localhost.comandosServidor;

import br.com.localhost.controle.Controle;
import br.com.localhost.controle.EnumsComandos;
import br.com.localhost.servidor.BancoDeDados;

public class ComandoRemoverUsuario extends Comando {
	
	public ComandoRemoverUsuario(BancoDeDados referenciaDB, Comando comando) {
		super(referenciaDB, comando);
	}

	@Override
	public boolean executarComando(Controle controle) { 
		this.referenciaDB.removerUsuario();
		System.out.println("USUARIO REMOVIDO");
		return true;
	}

	@Override
	public boolean deveAplicar(Controle controle) {
		return controle.getComando() == EnumsComandos.REMOVER;
	}
	
}
