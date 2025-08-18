package exercicio2;

import java.util.Scanner;

//8) Crie um programa que receba um valor e imprima o fatorial desse número. Ex.: 3! = 3 x 2 x 1 = 6.

public class exercicio8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int fatorial,temp;
    System.out.println("Calculador de fatorial");
    System.out.println("Digite o numero para calcular o fatorial");
        fatorial = sc.nextInt();

        while (fatorial > 1) {
            
            temp = temp * (fatorial-1);
            fatorial--;
            System.out.println(fatorial);
        }
    

    }    
}
