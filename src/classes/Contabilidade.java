package classes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
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
	public double mediaSalarial() {
		double total = 0;
		int x = 0;
		for (Double indice : VSalarios) {
			total = total + indice;
			x++;
		}
		System.out.println("Valor Total de Salário: "+total);
		return total/x;
	}
	
	public double[] maiorSalario(int quantidade) {
		double MaSalario[] = new double[quantidade];
		VSalarios.sort(Comparator.reverseOrder());
		int x = 0;
		for (Double Maior : VSalarios) {
			if (x <= (quantidade-1)) {
				MaSalario[x] = Maior;
			}
			x++;
		}
		
		return MaSalario;
	}
	
	public double[] menorSalario(int quantidade) {
		double MeSalario[] = new double[quantidade];
		VSalarios.sort(Comparator.reverseOrder());
		VSalarios.sort(null);
		int x = 0;
		for (Double Maior : VSalarios) {
			if (x <= (quantidade-1)) {
				MeSalario[x] = Maior;
			}
			x++;
		}
		
		return MeSalario;
	}
	
	public int mesesTrabalhados() {
		return VSalarios.size();  
	}
	
	public int anoContribui() {
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		ano = ano + 35;
		return ano - (mesesTrabalhados()/12);
	}
	
	public int anoNasc() {
		String[] textoSeparado = funcionario.getDtNasc().split("/");
		return Integer.parseInt(textoSeparado[2]);
	}
	
	public int iMinima(boolean seMasculino) {
		
		int ano = 0;
		if(seMasculino) {
			ano =  anoNasc() + 65;
		} else {
			ano = anoNasc() + 62;
		}
		return ano;
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
