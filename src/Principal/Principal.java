package Principal;

import java.util.Scanner;

import Animais.Aves;
import Animais.Felinos;
import Animais.Repteis;
import Funcionarios.CLT;
import Funcionarios.Estagiario;
import Funcionarios.Funcionario;

public class Principal {

	public static void main(String[] args) {
		String b;
		Aves lala = new Aves("Angola", "Medio", 2, "Racao");
		lala.botarOvos();
		lala.setTipoPena("Pluma");
		lala.getTipoPena();
		System.out.println("Quem esta botando? ");
		Scanner leitorText2 = new Scanner (System.in);
		b = leitorText2.next();
		lala.setNome(b);
		lala.getNome();
		Aves papaguaio1 = new Aves("Normal", "Grande", 1, "Racao");
		System.out.println("Papaguaio falando o que?");
		Scanner leitorTexto = new Scanner (System.in);
		String a;
		a = leitorTexto.next();
		papaguaio1.setFalar(a);
		papaguaio1.getFalar();
		Felinos mark = new Felinos("leao", "Grande", "Saudavel", 3);
		mark.setRugir("Mark");
		mark.getRugir();
		mark.setPelo("curto");
		mark.getPelo();
		Repteis jack = new Repteis(3.5, "Jacare", "Agua");
		jack.setEspecie("Jacare");
		jack.setIdade(3);
		Funcionario luiz = new CLT ();
		Funcionario anna = new Estagiario();
		luiz.trabalhando();
		luiz.descansar();
		anna.trabalhando();
		anna.descansar();
		
		
		
		
		
	}

}
