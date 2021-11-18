package br.com.generation.hpc2;

public class testandoInterfaces {

	public static void main(String[] args) {
		
		Cachorro2 dog1 = new Cachorro2();
		Cavalo2 cav1 = new Cavalo2();
		Preguica2 preg1 = new Preguica2();
		
		dog1.possuirNome();
		dog1.possuirIdade();
		dog1.emitirSom();
		dog1.deveCorrer();
		dog1.Subirarvore();
		
		System.out.println("=======================");
		
		cav1.possuirNome();
		cav1.possuirIdade();
		cav1.emitirSom();
		cav1.deveCorrer();
		cav1.Subirarvore();
		
		System.out.println("=======================");
		
		preg1.possuirNome();
		preg1.possuirIdade();
		preg1.emitirSom();
		preg1.deveCorrer();
		preg1.Subirarvore();
	}

}
