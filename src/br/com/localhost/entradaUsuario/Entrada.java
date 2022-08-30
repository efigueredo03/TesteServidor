package br.com.localhost.entradaUsuario;

import br.com.localhost.controle.EnumsComandos;

public abstract class Entrada {

	private Entrada proximo;
	
	public Entrada(Entrada proximo) {
		this.proximo = proximo;
	}
	
	public EnumsComandos verificarEntradaUsuario(String entrada) {
		if(deveAplicar(entrada)) {
			return executarConversaoDeComando(entrada);
		}
		return proximo.verificarEntradaUsuario(entrada);
	}
	
	public abstract EnumsComandos executarConversaoDeComando (String entrada);
	public abstract boolean deveAplicar(String entrada);
	
}
