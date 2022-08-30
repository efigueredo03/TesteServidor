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
	private ObjectInputStream entrada;
	
	public ThreadSockets(Socket socket, BancoDeDados db) throws IOException {
		this.socket = socket;
		this.db = db;
		this.entrada = new ObjectInputStream(this.socket.getInputStream());
	}
	
	public void run() {
		while (true) {
			try {
				
				Controle controle = (Controle) this.entrada.readObject();
				
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
	
}
