package Animais;

public class Aves extends Geral {
	private String tipoPena;
	private String falar;
	private String nome;
	public Aves (String especie, String porte, int idade, String alimentacao) {
		
		
		}
	public void botarOvos() {
		System.out.println("Ave botando ovos");
	}
	public String getTipoPena() {
		System.out.println("Expessura da pena: " + tipoPena);
		return tipoPena;
	}
	public void setTipoPena(String tipoPena) {
		this.tipoPena = tipoPena;
	}
	public String getFalar() {
		System.out.println("Papaguaio falando: " + falar);
		return falar;
	}
	public void setFalar(String falar) {
		this.falar = falar;
	}
	public String getNome() {
		System.out.println(nome + " Esta botando ovos");
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
