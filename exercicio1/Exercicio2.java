import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area do um quadrado: ");
        try{
            System.out.println("Digite o primeiro lado");
            double ladoA = scanner.nextDouble();
            System.out.println("Digite o segundo lado");
            double ladoB = scanner.nextDouble();
            
            double area = ladoA + ladoB;

            System.out.println("A area do quadrado é:" + area);
        }catch(Exception e){
                System.out.println("Digite apenas valores numericos");
        }finally{
            scanner.close();
        }
    }
}
