import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[]args){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite a altura");
            double altura = sc.nextDouble();
            System.out.println("Digite a largura");
            double largura = sc.nextDouble();
            System.out.println("Digite a profundidade");
            double profundidade = sc.nextDouble();

            double volume = altura * largura * profundidade;
            System.out.println("O volume é: " + volume);
        }catch(Exception e){
            System.out.println("Digite apenas valores numéricos !");
        }finally{
            sc.close();
        }
    }
}
