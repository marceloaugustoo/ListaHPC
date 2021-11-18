package br.com.generation.hpc2;

public class Cavalo2 implements Animal2 {

	@Override
	public void possuirNome() {
		System.out.println("Nome do cavalo: Pegasus.");
		
	}

	@Override
	public void possuirIdade() {
		System.out.println("Idade do cavalo: 5 anos.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som do cavalo: HIHIHI.");		
		
	}

	@Override
	public void deveCorrer() {
		System.out.println("Cavalo deve correr.");
		
	}
	
	public void Subirarvore() {
		System.out.println("Cavalo não sobe árvore.");
		
	}
	
	

}
