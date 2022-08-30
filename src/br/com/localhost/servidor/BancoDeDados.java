package br.com.localhost.servidor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BancoDeDados {

	private ArrayList<Object> armazenamentoAlunos;
	private ArrayList<Object> armazenamentoInstrutores;
	private ArrayList<Object> armazenamentoAdministradores;
	
	private Map<String, ArrayList<Object>> armazenamentoUsuarios;
	
	public BancoDeDados() {
		
		this.armazenamentoAlunos = new ArrayList<Object>();
		this.armazenamentoInstrutores = new ArrayList<Object>();
		this.armazenamentoAdministradores = new ArrayList<Object>();
		this.armazenamentoUsuarios = new HashMap<String, ArrayList<Object>>();
		
		this.armazenamentoUsuarios.put("Alunos", this.armazenamentoAlunos);
		this.armazenamentoUsuarios.put("Instrutores", this.armazenamentoInstrutores);
		this.armazenamentoUsuarios.put("Administradores", this.armazenamentoAdministradores);
		
	}
	
	public void adiconarUsuario() {
		
	}
	
	public void removerUsuario() {
		
	}
	
	public void abrirDataBase() {
		
	}
	
	public void salvarDataBase() {
		
	}
	
}
