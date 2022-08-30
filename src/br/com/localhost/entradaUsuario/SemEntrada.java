package br.com.localhost.entradaUsuario;

import br.com.localhost.controle.EnumsComandos;

public class SemEntrada extends Entrada {

	public SemEntrada() {
		super(null);
	}

	@Override
	public EnumsComandos executarConversaoDeComando(String entrada) {
		System.out.println("COMANDO NÃO ENCONTRADO");
		return EnumsComandos.NADA;
	}

	@Override
	public boolean deveAplicar(String entrada) {
		return true;
	}

}
