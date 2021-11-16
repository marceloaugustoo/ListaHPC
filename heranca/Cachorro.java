package br.com.generation.hpc;

public class Cachorro extends Animal {
	
	public static void main(String[] args) {
	
		Animal dog1 = new Animal();
		
		dog1.setCor("Branco.");
		dog1.setIdade(5);
		dog1.setMamar(true);
		
		System.out.println("Cachorro " + dog1.getCor());
		System.out.println("Cachorro de " + dog1.getIdade() + " ano(s).");
		dog1.mamar();
	}

}
