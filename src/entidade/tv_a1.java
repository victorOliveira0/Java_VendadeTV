package entidade;

public class tv_a1 {
	public String modelo = "A1_Samsung";
	public String cor = "Black";
	public float tamanho = 32f;
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
