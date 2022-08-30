package br.com.localhost.teste;

import java.io.IOException;

import br.com.localhost.servidor.Servidor;

public class TesteServidor {

	public static void main(String[] args) throws IOException {
		
		Servidor servidor = new Servidor();
		servidor.rodarServidor();
		
	}
	
}
