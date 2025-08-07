package exercicio2;

import java.util.Scanner;

public class exercicio1 {
//1) Crie um programa que receba três notas calcule a média e diga se foi aprovado (`(nota1 + nota2 + nota3 / 3)`) e (`média maior que 7 para ser aprovado`).	
	
	public static void main(String[]args) {
		 System.out.println("Calcula a Média");
	     Scanner sc = new Scanner(System.in);
		
		try {
			double[] nota = new double[3];
			double valor = 0;
			
			for(int i = 0; i < nota.length; i++) {
				nota[i] = sc.nextDouble();
				valor += nota[i];
			}
			
			valor = valor/3;
			
			if(valor > 7) {
				System.out.println("Aprovado");
			}
			
			
			
			
			
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			
		}
		
	}
}
