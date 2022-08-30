package br.com.localhost.comandosServidor;

import br.com.localhost.controle.Controle;
import br.com.localhost.controle.EnumsComandos;
import br.com.localhost.servidor.BancoDeDados;

public class ComandoAdicionarUsuario extends Comando {
	
	public ComandoAdicionarUsuario(BancoDeDados referenciaDB, Comando comando) {
		super(referenciaDB, comando);
	}

	@Override
	public boolean executarComando(Controle controle) {	
		this.referenciaDB.adiconarUsuario();
		System.out.println("USUARIO ADICONADO");
		return true;
	}

	@Override
	public boolean deveAplicar(Controle controle) {
		return controle.getComando() == EnumsComandos.ADICIONAR;
	}
	
}
