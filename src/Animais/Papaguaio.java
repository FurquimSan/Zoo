package Animais;

public class Papaguaio extends Aves{
	private String falar;

	public Papaguaio(String especie, String porte, int idade, String alimentacao) {
		super(especie, porte, idade, alimentacao);
		this.falar= falar;
	}

	public String getFalar() {
		return falar;
	}

	public void setFalar(String falar) {
		this.falar = falar;
	}
	

}
