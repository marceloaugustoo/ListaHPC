package br.com.generation.hpc;

public class Cavalo extends Animal {

	public static void main(String[] args) {
		
		Animal cavalo = new Animal();
		
		cavalo.setCor("Marrom.");
		cavalo.setIdade(7);
		cavalo.setMamar(true);
		
		System.out.println("Cavalo " + cavalo.getCor());
		System.out.println("Cavalo de " + cavalo.getIdade() + " ano(s).");
		cavalo.mamar();

	}

}
