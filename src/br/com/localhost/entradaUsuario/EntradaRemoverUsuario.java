package br.com.localhost.entradaUsuario;

import br.com.localhost.controle.EnumsComandos;

public class EntradaRemoverUsuario extends Entrada {

	public EntradaRemoverUsuario(Entrada proximo) {
		super(proximo);
	}

	@Override
	public EnumsComandos executarConversaoDeComando (String entrada) {
		return EnumsComandos.ADICIONAR;
	}

	@Override
	public boolean deveAplicar(String entrada) {
		return entrada.equals("adicionar");
	}
	
}
