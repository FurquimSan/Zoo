package Animais;

public class Felinos extends Mamiferos {
	private String rugir;
	private String pelo;
	public Felinos(String especie, String porte, String estado, int idade) {
	}
	public String getRugir() {
		System.out.println(rugir + " Está rugindo");
		return rugir;
	}
	public void setRugir(String rugir) {
		this.rugir = rugir;
	}
	public String getPelo() {
		System.out.println("Tipo de pelo " + pelo);
		return pelo;
	}
	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

}
