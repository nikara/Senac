import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[]args){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite a distancia");
            double distancia = sc.nextDouble();
            System.out.println("Digite o tempo");
            double tempo = sc.nextDouble();
            
            
            double media = distancia/ tempo;
            System.out.println("A média de tempo é: " + media + "Km por hora");
        }catch(Exception e){
            System.out.println("Digite apenas valores numéricos !");
        }finally{
            sc.close();
        }
    }
}
