package Funcionarios;

public class Estagiario implements Funcionario {

	@Override
	public void trabalhando() {
		System.out.println("Estagiario esta trabalhando");
		
	}

	@Override
	public void descansar() {
		System.out.println("Estagiario esta descansando");
		
	}

}
