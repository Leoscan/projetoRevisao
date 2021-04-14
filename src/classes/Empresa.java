package classes;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nome;
	private String ano;
	private Funcionario funcionario;
	private List<Double> VSalarios = new ArrayList<Double>();
	
	
	public Empresa(String nome, String ano, Funcionario funcionario) {
		setNome(nome);
		setAno(ano);
		setFuncionario(funcionario);
	}
	public Empresa() {
		
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
	public List<Double> criaVSalarios() {
		for(int x = 0; x < funcionario.getHTrabalhadas().size(); x++) {
			double salario = funcionario.getHTrabalhadas().get(x) * funcionario.getHValor().get(x);	
			VSalarios.add(salario);
		}
		return VSalarios;
	}
	
	
}
