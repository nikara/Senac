import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        System.out.println("Calcula a Média");
        Scanner sc = new Scanner(System.in);
        
        try{
        

        double nota1,nota2,nota3;
        
        System.out.println("Digite a primeira nota");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota");
        nota3 = sc.nextDouble();
        
        double valorFinal = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média é : "+valorFinal);

        
        }
        
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }finally{
            sc.close();
        }


    }



}
