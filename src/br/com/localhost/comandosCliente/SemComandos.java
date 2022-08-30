package br.com.localhost.comandosCliente;

import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.localhost.controle.EnumsComandos;

public class SemComandos extends Comando {

	public SemComandos() {
		super(null);
	}

	@Override
	public boolean executarComando(EnumsComandos comandoControle, ObjectOutputStream saida) throws IOException {
		return false;
	}

	@Override
	public boolean deveAplicar(EnumsComandos comandoControle) {
		return true;
	}
	
}
