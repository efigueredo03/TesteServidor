package br.com.localhost.entradaUsuario;

import br.com.localhost.controle.EnumsComandos;

public class EntradaAdicionarUsuario extends Entrada {

	public EntradaAdicionarUsuario(Entrada proximo) {
		super(proximo);
	}

	@Override
	public EnumsComandos executarConversaoDeComando (String entrada) {
		return EnumsComandos.REMOVER;
	}

	@Override
	public boolean deveAplicar(String entrada) {
		return entrada.equals("remover");
	}
	
}
