package exercicio3;

import java.util.Scanner;

/*
 3) Crie um programa que receba como entrada da classe Main dois valores numéricos e calcule as operações 
 básicas com eles.
 */


	



public class exercicio3 {
	
static double MetodoCalculadora (String chave, double y, double x) {
	
	
switch(chave) {
	case "+":
		return y + x;
	case "-":
		return y - x;
	case "*":
		return y * x;
	case "/":
		return y / x;
	default:
		if (chave != "+"||chave != "-"||chave != "*"||chave != "/") {
			 System.out.println("Digite uma operação valida");
		}
	}
return 0;
}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Calculadora usando metodo");
			
			// Coleta dos valores para o metodo
			System.out.println("Digite a operacao:");
			String operacao = sc.nextLine();
			
			System.out.println("Digite o primeiro valor");
			double valor1 = sc.nextDouble();
			
			System.out.println("Digite o primeiro valor");
			double valor2 = sc.nextDouble();
			
			// Execução do metodo
			System.out.println("O resultado é " + MetodoCalculadora(operacao,valor1,valor2) );
			
			
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			
		}

	}

}
