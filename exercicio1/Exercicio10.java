import java.util.Scanner;

public class Exercicio10 {
    // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro

    public static void main(String[]args){
        System.out.println("Conversor de String com ponto em Double");
        Scanner sc = new Scanner(System.in);
    
        try{
        System.out.println("Passa um valor com ponto");
        String numerica = sc.nextLine();
        
        double stringNumero =  Double.parseDouble(numerica);

        System.out.println("O valor no muda nada " + stringNumero + " Mas e a ativade kkkk");
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }finally{
            sc.close();
        }
    }
}
