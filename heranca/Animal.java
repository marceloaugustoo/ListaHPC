package br.com.generation.hpc;

public class Animal {
	private String cor;
	private int idade;
	private boolean mamar;
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isMamar() {
		return mamar;
	}
	public void setMamar(boolean mamar) {
		this.mamar = mamar;
	}
	
	void mamar() {
		if (mamar == true) {
			System.out.println("Mamifero.");
		}
	}
}
