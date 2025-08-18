package exercicio2;

import java.util.Scanner;

//7) Crie um programa que tenha como entrada as notas de um aluno. Somente se encerrará quando for inserida uma nota negativa. Ao final deverá informar a média das notas.

public class exercicio7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double nota = 0;
        double acumulador = 0;
        int count = 0;

        System.out.println("Calculador de notas");
        System.out.println("Digite uma nota:");
        nota = sc.nextDouble();
        
        while(nota >= 0){
            acumulador += nota;
            count ++;
            System.out.println("Digite uma nota:");
            nota = sc.nextDouble();
        }
        System.out.println("A média das notas é " + acumulador/count);

    }
}
