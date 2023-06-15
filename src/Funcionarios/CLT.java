package Funcionarios;

import java.util.Scanner;

public class CLT implements Funcionario{
	
	
	private String Sim;

	private void batePonto() {
		Scanner leitorTexto = new Scanner (System.in);
		System.out.println("Trabalhador bateu ponto?");
		String a;
		a= leitorTexto.next();
		if(a.equalsIgnoreCase(Sim)) {
			System.out.println("Ponto batido");
		}else {
			System.out.println("Funcionario faltou");
		}
	}

	@Override
	public void trabalhando() {
		System.out.println("Funcionario esta trabalhando");
	
		
	}

	@Override
	public void descansar() {
		System.out.println("Funcionario esta descansando");
	}

}
