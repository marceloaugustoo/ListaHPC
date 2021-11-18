package br.com.generation.hpc2;

public class Cachorro2 implements Animal2 {

	@Override
	public void possuirNome() {
		System.out.println("Nome do cachorro: TOTÓ.");
		
	}

	@Override
	public void possuirIdade() {
		System.out.println("Idade do cachorro: 9 anos.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som do cachorro: AUAU.");
		
	}

	@Override
	public void deveCorrer() {
		System.out.println("Cachorro deve correr.");
		
	}
	
	@Override
	public void Subirarvore() {
		System.out.println("Cachorro não sobe árvore.");
		
	}
	

	

}
