package ListaColects;

import java.util.ArrayList;

import java.util.Scanner;

public class EstoqueFuncional {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String eq1,eq2,eq3,eq4,eq5;
		
		eq1 = "Caneta";
		eq2 = "Lapis";
		eq3 = "Caderno";
		eq4 = "borracha";
		eq5 = "Apontador";
		
		Estoque estocado = new Estoque(eq1);
		Estoque estocado2 = new Estoque(eq2);
		Estoque estocado3 = new Estoque(eq3);
		Estoque estocado4 = new Estoque(eq4);
		Estoque estocado5 = new Estoque(eq5);

		ArrayList<Estoque> est = new ArrayList();
		
		est.add(estocado);
		est.add(estocado2);
		est.add(estocado3);
		est.add(estocado4);
		
		System.out.println("Estoque: ");
		System.out.println(est);
		
		System.out.println("Após a remoçao do primeiro item, temos o novo estoque: ");
		
		est.remove(0);
		
		System.out.println(est);
		
		System.out.println("Após a substituição do item, estoque final: ");
		
		est.add(estocado5);
		
		System.out.println(est);

	}

}
