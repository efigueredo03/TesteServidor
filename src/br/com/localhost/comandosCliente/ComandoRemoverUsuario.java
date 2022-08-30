package br.com.localhost.comandosCliente;

import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.localhost.controle.Controle;
import br.com.localhost.controle.EnumsComandos;

public class ComandoRemoverUsuario extends Comando {

	public ComandoRemoverUsuario(Comando proximo) {
		super(proximo);
	}

	@Override
	public boolean deveAplicar(EnumsComandos comandoControle) {
		return comandoControle == EnumsComandos.REMOVER;
	}

	@Override
	public boolean executarComando(EnumsComandos comandoControle, ObjectOutputStream saida) throws IOException {
		String frase = "bom dia";
		Controle controle = new Controle(frase, EnumsComandos.REMOVER);	
		saida.writeObject(controle);	
		System.out.println("Objeto controle de Adição enviado ao servidor");		
		return true;
	}
	
}
