package exercicio2;

import java.util.Scanner;

/*
DESAFIO
Crie um programa que receba um valor em reais e determine qual o mínimo de notas necessárias para entregá-lo. 
<br> Notas: R$ 100, R$ 50, R$ 10, R$ 5, R$ 1 <br> Exemplo: R$ 15 -> 1 nota de R$ 10 e 1 nota de R$ 5**
*/

public class desafio {

	public static void main(String[] args) {
		System.out.println("Calcula Troco");
		Scanner sc = new Scanner(System.in);

		// vetor para armazenar as notas
		int[] notas = {100, 50, 10, 5, 1};
		
		int caixa = 0;
		try {
			// Variavel para armazenar os reias
			double valor = 0.0;

			// A variavel recebe o valor
			System.out.println("Digite o valor que deseja ser trocado:");
			valor = sc.nextDouble();
			
			for(int i = 0; i < notas.length; i++) {
				// Armazena a quantidade notas
				int x = 0;
				// calculo das notas
				x = (int) (valor - caixa)/notas[i];
				if( x >= 1) {
				System.out.println("Devolva " + x + " Nota(s) de R$" + notas[i]);
				caixa += x * notas[i];
				}
			}
			
			

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			sc.close();
		}

	}

}
