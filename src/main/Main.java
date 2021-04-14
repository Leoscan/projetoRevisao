package main;
import classes.*;

public class Main {

	public static void main(String[] args) {
		
		Funcionario s = new Funcionario("Leoscan", "LeoLindo","Leonardo","leofelixscandura@gmail.com", "30/11/1999");
		s.CriarVetores();
		System.out.println(s);
			
		Empresa empresa = new Empresa("Leoscan Enterprise", "1999", s);
		System.out.println("Salários: \n"+empresa.criaVSalarios());
		
		
	}

}
