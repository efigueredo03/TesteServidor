package br.com.localhost.servidor;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	private BancoDeDados db;
	
	public Servidor() {
		this.db = new BancoDeDados();
		db.abrirDataBase();
	}
	
	public void rodarServidor() throws IOException {
		
		ServerSocket servidor = new ServerSocket(40000);
		System.out.println("Porta 40000 aberta");
		System.out.println("Esperando conexões");
		
		while (true) {
			
			Socket socket = servidor.accept();
			System.out.println("Cliente " + socket.getInetAddress().getHostAddress() + " conectado");
			
			ThreadSockets thread = new ThreadSockets(socket, this.db);
			thread.start();
			
		}
		
	}
	
	
	
	public void pararServidor() {
		
	}
	
}
