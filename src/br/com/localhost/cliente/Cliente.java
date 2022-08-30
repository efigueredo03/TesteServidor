package br.com.localhost.cliente;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import br.com.localhost.comandosCliente.Comando;
import br.com.localhost.comandosCliente.ComandoAdicionarUsuario;
import br.com.localhost.comandosCliente.ComandoRemoverUsuario;
import br.com.localhost.comandosCliente.SemComandos;
import br.com.localhost.controle.EnumsComandos;
import br.com.localhost.entradaUsuario.Entrada;
import br.com.localhost.entradaUsuario.EntradaAdicionarUsuario;
import br.com.localhost.entradaUsuario.EntradaRemoverUsuario;
import br.com.localhost.entradaUsuario.EntradaSair;
import br.com.localhost.entradaUsuario.SemEntrada;

public class Cliente {
	
	private Socket socket;
	private ObjectOutputStream saida;
	private Scanner scan;
	
	public Cliente() throws UnknownHostException, IOException {
		this.scan = new Scanner(System.in);
		this.socket = new Socket("192.168.56.1", 40000);
		this.saida = new ObjectOutputStream(this.socket.getOutputStream());
		System.out.println("Conectado");
	}

	public void rodarCliente() throws UnknownHostException, IOException {
		
		String resultado = null;
		Entrada cadeiaDeEntradas = null;
		while (true) {
			// Pedir uma opção para o usuário
			System.out.println("====== INSIRA UMA OPÇÃO ======");
			System.out.println("=== (adicionar)  (remover) ===");
			System.out.println();
			resultado = scan.nextLine();
			
			// Transformar a opção no enum correspondente
			cadeiaDeEntradas = new EntradaAdicionarUsuario(
					new EntradaRemoverUsuario(
							new EntradaSair(
									new SemEntrada())));
				
			EnumsComandos comando = cadeiaDeEntradas.verificarEntradaUsuario(resultado);
			
			// Verificar se a entrada existe ou foi sair
			if (comando == EnumsComandos.NADA) {
				continue;
			} else if (comando == EnumsComandos.SAIR) {
				break;
			}
			
			
			// Chamar o método com base no enum corrrespondente
			Comando cadeiaDeComandos = new ComandoAdicionarUsuario(
					new ComandoRemoverUsuario(
							new SemComandos()));
			
			boolean resultadoDaCadeia = cadeiaDeComandos.verificarComando(comando, this.saida);
			
			
		}
		
		this.saida.close();
		this.socket.close();
		this.scan.close();
		
	}
	
}
