package br.com.localhost.servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

import br.com.localhost.comandosServidor.Comando;
import br.com.localhost.comandosServidor.ComandoAdicionarUsuario;
import br.com.localhost.comandosServidor.ComandoRemoverUsuario;
import br.com.localhost.comandosServidor.SemComando;
import br.com.localhost.controle.Controle;

public class ThreadSockets extends Thread {

	private Socket socket;
	private BancoDeDados db;
	
	public ThreadSockets(Socket socket, BancoDeDados db) {
		this.socket = socket;
		this.db = db;
	}
	
	public void run() {
		
		try {
			
			ObjectInputStream entrada = new ObjectInputStream(this.socket.getInputStream());
			Controle controle = (Controle) entrada.readObject();
			
			Comando cadeiaDeComandos = new ComandoAdicionarUsuario(this.db, 
					new ComandoRemoverUsuario(this.db, 
							new SemComando()));
			
			boolean resultado = cadeiaDeComandos.verificarComando(controle);
			System.out.println(resultado);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
