package entidade;

public class tv_c137 {
	public String modelo = "C137_LG";
	public String cor = "Black Piano";
	public float tamanho = 55f;
	public boolean energia;
	
	public void ligar() {
		this.energia = true;
	}
	
	public void desligar() {
		this.energia = false;
	}
	
	public String toString() {
		return "Modelo: " + modelo
				+ "\nCor: " + cor
				+ "\nPolegadas: " + tamanho
				+ "\nLigado: " + energia
				+ "\n=================";
	}
	
	
}
