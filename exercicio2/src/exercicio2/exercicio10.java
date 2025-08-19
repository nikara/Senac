package exercicio2;

import java.util.Scanner;

//10) Crie um programa que receba dois valores e solicite a operação a ser realizada (+ - * /). Ao final imprima o resultado.


public class exercicio10 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double x,y,z;
      String valor; 

      System.out.println("Calculadora Simples");
      
      System.out.println("Adicione o primeiro valor");
      x = sc.nextDouble();

      System.out.println("Adicione o segundo valor");
      y = sc.nextDouble();
      
      sc.nextLine();

      System.out.println("Escolha a operação +, -, *, /");
      valor = sc.nextLine();

      switch (valor) {
        case "+":
                z = y + x;
                System.out.println("O resultado é " + z);
            break;
        case "-":
                z = y - x;
                System.out.println("O resultado é " + z);
            break;
        case "*":
                 z = y * x;
                System.out.println("O resultado é " + z);

            break;
        case "/":
                if(y == 0){
                    System.out.println("Não é possivel dividir por zero");
                    break;
                }
                z = y / x;
                System.out.println("O resultado é " + z);
            break;
        default:
            System.out.println("Operação inválida");
            break;
      }











    }
}
