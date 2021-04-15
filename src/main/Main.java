package main;
import classes.*;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f1 = null; 
		try {
			f1 = new Funcionario("Leoscan", "88750205Ligia","Leonardo","leofelixscandura@gmail.com", "30/11/1999");
			f1.CriarVetores();
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}	
		
		Contabilidade contabilidade = new Contabilidade("Leoscan Enterprise", "1999", f1);
			contabilidade.criaVSalarios();
		System.out.println(contabilidade);
		
	}
}
