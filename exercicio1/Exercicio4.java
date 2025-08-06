import java.util.Scanner;
import java.util.Random;

public class Exercicio4 {
    // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro
    // valor
    public static void main(String[] args) {
        System.out.println("Calcula a Bhaskara");
        Scanner sc = new Scanner(System.in);
        Random al = new Random();

        try {
            
            //Declaração de variaveis
            double x,y;
            boolean condicao;
            do{ 
            System.out.println("Vamos de descobrir se X e maior que o dobro de Y");

            x = al.nextDouble()*100;
            y = (al.nextDouble()*100) ;
            
            if ( x > y*2){

                System.out.println("X e " + x);
                System.out.println("Y e " + y);
                System.out.println("X e o dobro de Y");
                condicao = false;
            }else{

                System.out.println("X e " + x);
                System.out.println("Y e " + y);
                System.out.println("X não e o dobro de Y");
                condicao = true;
            }
            }
            while(condicao);

        }

        catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
