package classes;

import java.util.ArrayList;
import java.util.List;

public class Contabilidade {
	private String nome;
	private String ano;
	private Funcionario funcionario;
	private List<Double> VSalarios = new ArrayList<Double>();
	
	
	public Contabilidade(String nome, String ano, Funcionario funcionario) {
		setNome(nome);
		setAno(ano);
		setFuncionario(funcionario);
	}
	public Contabilidade() {
		
	}
	
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public List<Double> getVSalarios() {
		return VSalarios;
	}
	public void setVSalarios(List<Double> vSalarios) {
		VSalarios = vSalarios;
	}
	
	//metodos
	public void criaVSalarios() {
		for(int x = 0; x < funcionario.getHTrabalhadas().size(); x++) {
			double salario = funcionario.getHTrabalhadas().get(x) * funcionario.getHValor().get(x);	
			VSalarios.add(salario);
		}
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("----------");
		builder.append("\nNome da Empresa: ");
		builder.append(nome);
		builder.append(", Since:");
		builder.append(ano);
		builder.append(funcionario);
		int x = 1;
		for (Double double1 : VSalarios) {
			builder.append("\nSalário "+x+": ");
			builder.append(double1);
			x++;
		}
		builder.append("\n----------");
		return builder.toString();
	}
	
}
