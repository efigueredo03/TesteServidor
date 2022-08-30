package br.com.localhost.teste;

import java.io.IOException;
import java.net.UnknownHostException;

import br.com.localhost.cliente.Cliente;

public class TesteCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Cliente cliente = new Cliente();
		cliente.rodarCliente();
		
	}
	
}
