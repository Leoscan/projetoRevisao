package classes;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Usuario {
	private String nome;
	private String email;
	private String dtNasc;
	
	private List<Integer> HTrabalhadas = new ArrayList<Integer>();
	private List<Integer> HValor = new ArrayList<Integer>();
	
	//construtores
	public Funcionario(String user, String senha, String nome, String email, String dtNasc) {
		super(user, senha);
		setNome(nome);
		setEmail(email);
		setDtNasc(dtNasc);
	}
	
	
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	//to string
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\nNome: ");
		builder.append(nome);
		builder.append(", E-mail: ");
		builder.append(email);
		builder.append("\nData de Nascimento: ");
		builder.append(dtNasc);
		builder.append("\n----------");
		builder.append("\nVetor Horas Trabalhadas:\n");
		for (Integer integer : HTrabalhadas) {
			builder.append("|");
			builder.append(HTrabalhadas);
			builder.append("|");
		}
		builder.append("\nVetor Valor Hora:\n");
		for (Integer integer : HValor) {
			builder.append("|");
			builder.append(HValor);
			builder.append("|");
		}
		builder.append("\n----------");
		return builder.toString();
	}

	
	
	
}
