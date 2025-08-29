package exercicio2;

import java.util.Scanner;

// 5) Crie um programa que receba uma String e imprima linha a linha suas letras.

public class exercicio5 {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	try {
        String texto = sc.nextLine();

        for(int i = 0; i < texto.length(); i++){
            System.out.println(texto.charAt(i));
        }
    	}catch(Exception e) {
    		
    	}finally {
    		sc.close();
    	}
        
    }
}
