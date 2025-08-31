package exercicio3;

import java.util.Scanner;

import java.math.BigInteger;
// 4) Crie um programa que execute uma operação de Exponenciação com o valor inteiro com precisão arbitrária.
public class exercicio4 {
	
	static void ExpRap(BigInteger base,BigInteger exp) {
		BigInteger res = BigInteger.ONE;
		
		while(exp.compareTo(BigInteger.ZERO) > 0) {
			
			if(exp.testBit(0)) {
				res = res.multiply(base);
			}
			base = base.multiply(base);
			exp = exp.shiftRight(1);
		}
		System.out.println("Resultado: " + res);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger base = new BigInteger("3");
		BigInteger expoente = new BigInteger("13");
		
		
		try {

			ExpRap(base,expoente);
			
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}finally {
			
		}

	}

}
