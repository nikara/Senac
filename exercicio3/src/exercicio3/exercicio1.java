package exercicio3;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class exercicio1 {
	
/*1) Crie um programa que receba um valor e calcule a tabuada deste valor, salvando seu resultado 
em um arquivo de texto.*/

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("TabuaIneirto");	
		System.out.println("Digite o numero da tabuada que você que criar:");
		int numero = sc.nextInt();
			
			
		File tabuada = new File("tabuadaDe"+numero+".txt");
		
		if(tabuada.createNewFile()) {
			FileWriter calculo = new FileWriter("tabuadaDe"+numero+".txt");
			for(int i = 0; i <= 10; i++) {
				calculo.write(numero + " vezes " + i + " igual a " + (numero*i) + "\n");
			}
			calculo.close();
			System.out.println("Arquivo criado");
			
			
		}else {
			System.out.println("Arquivo já existe.");
		}
			
			
			
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}finally {
			sc.close();
		}
	}

}
