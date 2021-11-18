package br.com.generation.hpc2;

public class Preguica2 implements Animal2 {

	@Override
	public void possuirNome() {
		System.out.println("Nome da preguiça: Juli.");
		
	}

	@Override
	public void possuirIdade() {
		System.out.println("Idade da preguiça: 2 anos.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som da preguiça: :).");		
		
	}

	@Override
	public void deveCorrer() {
		System.out.println("Preguiça não corre.");
		
	}
	
	public void Subirarvore() {
		System.out.println("Preguiça sobe árvore.");
		
	}
	
	

}
