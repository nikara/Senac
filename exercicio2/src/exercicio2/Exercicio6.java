package exercicio2;

//6) Crie um programa que de a soma de todos os números ímpares e múltiplos de 7 entre 1 e 500.

public class Exercicio6 {
    public static void main(String[] args) {
  
        int soma = 0;;

        for(int i = 0; i < 500; i++){
            if(i%2 != 0 && i%7 == 0 ){
                soma += i;
            }
        }

        System.out.println(soma);


    }
}
