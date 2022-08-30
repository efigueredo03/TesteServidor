package br.com.localhost.entradaUsuario;

import br.com.localhost.controle.EnumsComandos;

public class EntradaSair extends Entrada {

	public EntradaSair(Entrada proximo) {
		super(proximo);
	}

	@Override
	public EnumsComandos executarConversaoDeComando (String entrada) {
		return EnumsComandos.SAIR;
	}

	@Override
	public boolean deveAplicar(String entrada) {
		return entrada.equals("sair");
	}
	
}
