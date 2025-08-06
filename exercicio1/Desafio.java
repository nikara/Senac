import java.util.Scanner;

public class Desafio {
    // DESAFIO Crie um programa que teste se um número é primo
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Testador de Número Primo");
            System.out.println("Esse programa descobre se o número e primo ou Não");
            System.out.println("Digite um número");

            int valor  = sc.nextInt();

            if ( valor % 7 == 1 && valor / 2 != 0){
                System.out.println("O valor " + valor + " é Primo");
            }else{
                System.out.println("O valor " + valor + " não é Primo");
            }



        }catch(Exception e ){
            System.out.println("Erro: "+ e.getMessage());
        }finally{
            
        }
    }




}
