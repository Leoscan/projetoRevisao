package main;
import java.util.Arrays;
import java.util.Calendar;

import classes.*;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f1 = null; 
		try {
			f1 = new Funcionario("Leoscan", "leo123","Leonardo","leofelixscandura@gmail.com", "30/11/1999");
			f1.CriarVetores();

		
		Contabilidade contabilidade = new Contabilidade("Leoscan Enterprise", "1999", f1);
		contabilidade.criaVSalarios();
			
			System.out.println(contabilidade);
			System.out.println("Média Salarial: "+contabilidade.mediaSalarial());
			System.out.println("Maiores Salários: "+Arrays.toString(contabilidade.maiorSalario(3)));
			System.out.println("Menores Salários: "+Arrays.toString(contabilidade.menorSalario(2)));
			System.out.println("----------");
			System.out.println("Meses Trabalhados: "+contabilidade.mesesTrabalhados());
			System.out.println("Anos Trabalhados: "+contabilidade.mesesTrabalhados()/12);
			System.out.println("Fração (sobra) de Meses Trabalhados: "+contabilidade.mesesTrabalhados()%12);
			System.out.println("Anos e Meses Trabalhados: "+contabilidade.mesesTrabalhados()/12+" Ano e "+contabilidade.mesesTrabalhados()%12+" Meses");
			System.out.println("----------");
			int aContrbui = contabilidade.anoContribui();
			System.out.println("Ano dos 35 anos de Contribuição: "+aContrbui);
			
			boolean homen = true;
			int iMinima = 0;
			if(homen) { 
				System.out.println("Ano Idade Mínima (65 anos): "+contabilidade.iMinima(true));
				iMinima = contabilidade.iMinima(true);
			} else {
				System.out.println("Ano Idade Mínima (62 anos): "+contabilidade.iMinima(false));
				iMinima = contabilidade.iMinima(false);
			}
			
			System.out.println("Ano Nascimento: "+contabilidade.anoNasc());
			
			int IAposentadoria = 0;
			if(iMinima > aContrbui) {
				System.out.println("Ano Aposentadoria: "+iMinima);
				IAposentadoria = (iMinima - contabilidade.anoNasc());
				System.out.println("Idade Aposentadoria: "+ IAposentadoria);
			} else {
				System.out.println("Ano Aposentadoria: "+aContrbui);
				IAposentadoria = (aContrbui - contabilidade.anoNasc());
				System.out.println("Idade Aposentadoria: "+  IAposentadoria);
			}
			int idade = (Calendar.getInstance().get(Calendar.YEAR) - contabilidade.anoNasc());
			System.out.println("idade atual: "+ idade);

			System.out.println("Anos faltantes para se aposentar: "+ (IAposentadoria - idade));
			
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}	

		
	}
}
