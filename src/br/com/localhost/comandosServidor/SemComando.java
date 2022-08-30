package br.com.localhost.comandosServidor;

import br.com.localhost.controle.Controle;

public class SemComando extends Comando {

	public SemComando() {
		super(null, null);
	}

	@Override
	public boolean executarComando(Controle controle) {
		System.out.println("COMANDO NÃO ENCONTRADO");
		return false;
	}

	@Override
	public boolean deveAplicar(Controle controle) {
		return true;
	}

	
	
}
