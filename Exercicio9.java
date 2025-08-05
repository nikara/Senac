import java.util.Scanner;

public class Exercicio9 {

    //9) Crie um programa que compare dois valores Strings

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{

            System.out.println("Comparador de Caracteres");
            System.out.println("Digite duas sequências de caracteres");
            System.out.println("Digite a primeira sequência:");
            String valor1 = sc.nextLine();
            System.out.println("Digite segunda sequência:");
            String valor2 = sc.nextLine();

            if ( valor1.equals(valor2) ) {
                System.out.println("As sequências são iguias");
            }else{
                System.out.println("As sequências não combinam");
            }


        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }finally{
            sc.close();
        }
    }
}
