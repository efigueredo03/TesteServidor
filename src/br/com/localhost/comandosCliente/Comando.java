package br.com.localhost.comandosCliente;

import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.localhost.controle.EnumsComandos;

public abstract class Comando {

	protected Comando proximo;
	
	public Comando(Comando proximo) {
		this.proximo = proximo;
	}
	
	public boolean verificarComando(EnumsComandos comandoControle, ObjectOutputStream saida) throws IOException {
		if (deveAplicar(comandoControle)) {
			return executarComando(comandoControle, saida);
		}
		return proximo.verificarComando(comandoControle, saida);
	}
	
	public abstract boolean deveAplicar(EnumsComandos comandoControle);
	public abstract boolean executarComando(EnumsComandos comandoControle, ObjectOutputStream saida) throws IOException;
	
	
}
