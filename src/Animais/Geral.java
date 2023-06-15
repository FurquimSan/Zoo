package Animais;

public class Geral {
	private String especie;
	private String porte;
	private int idade;
	private String alimentacao;
	
	public void animal (String especie, String porte, int idade, String alimentacao) {
		this.especie=especie;
		this.porte=porte;
		this.idade=idade;
		this.alimentacao=alimentacao;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	

}
