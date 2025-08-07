package exercicio2;

import java.util.Scanner;

public class exercicio2 {
	// 2) Crie um programa que receba um número e indique o mês que representa.
	public static void main(String[]args) {
		System.out.println("Programa dos mesês");
		Scanner sc = new Scanner (System.in);
		try {
		
		while(true) {
		String[] meses = {"janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
		int valor = 0;
		
		System.out.println("Digite o numero do mês");
		valor = sc.nextInt();
		System.out.println("O mês é "+ meses[valor-1]);
		}
		
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			sc.close();
		}
		
	}
}
