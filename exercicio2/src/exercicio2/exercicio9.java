package exercicio2;

import java.util.Scanner;

/*
9) Crie um programa que receba a altera e o peso e calcule o IMC:

IMC | Classificação
--- | ------
Abaixo de 18,5 | Abaixo do Peso
Entre 18,6 e 24,9 | Peso Ideal
Entre 25,0 e 29,9 | Levemente acima do peso
Entre 30,0 e 34,9 | Obesidade Grau I
Entre 35,0 e 39,9 | Obesidade Grau II
Acima de 40 | Obesidade Grau III (mórbida)
 */

public class exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println( "Calculadora de IMC");
        double peso,altura,imc;

        System.out.println("Digite sua altura:");
        altura = sc.nextDouble();

        System.out.println("Digite seu peso:");
        peso = sc.nextDouble();

        imc = peso/(altura*altura);

        if(imc <= 18.5){
            System.out.println("Seu IMC é " + imc + "Abaixo do peso ");
        }
        else if(imc >= 18.6 && imc <= 24.9){
            System.out.println("Seu IMC é " + imc + " seu peso é Ideal");
        }
        else if(imc >= 25 && imc <= 29.9){
            System.out.println("Seu IMC é " + imc + " Levemente acima do peso");
        }
        else if(imc >= 30 && imc <= 34.9){
            System.out.println("Seu IMC é " + imc + "  Obesidade Grau I");
        }
        else if(imc >= 35.0 && imc <= 39.9 ){
            System.out.println("Seu IMC é " + imc + " Obesidade Grau II");    
        }
        else if(imc >= 40 ){
                System.out.println("Seu IMC é " + imc + " Obesidade Grau III  (mórbida)");
        }
        sc.close();
    }
    
}
