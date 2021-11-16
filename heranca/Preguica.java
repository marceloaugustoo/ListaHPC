package br.com.generation.hpc;

public class Preguica extends Animal {
	
	public static void main(String[] args) {
		Animal preguica = new Animal();
		
		preguica.setCor("Cinza.");
		preguica.setIdade(2);
		preguica.setMamar(true);
		
		System.out.println("Preguica " + preguica.getCor());
		System.out.println("Preguica de " + preguica.getIdade() + " ano(s).");
		preguica.mamar();

	}


}
