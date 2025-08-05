import java.util.Scanner;

public class Exercicio8 {
    // 8) Crie um programa que teste se um valor é par ou ímpar

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        try{
            
            System.out.println("Testador de Par ou Ímpar");
            System.out.println("Digite um numero:");
            double valor = sc.nextDouble();
            if(valor%2 == 0 ){
                System.out.println("O valor " + valor + " e Par");
            }else{
                System.out.println("O valor " + valor + " e Ìmpar");
            }


        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }finally{
        sc.close();
        }
    }

}