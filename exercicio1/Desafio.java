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

            if ( valor % 2 != 0 || valor == 2){
                System.out.println("O valor " + valor + " é Primo");
            }else{
                System.out.println("O valor " + valor + " não é Primo");
            }



        }catch(Exception e ){
            System.out.println("Erro: "+ e.getMessage());
        }finally{
            
        }
    }
    
// Esse codigo funciona a casos que ele não pega achei uma caso mais interresandte.
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);       
        System.out.println("Entre com um numero ");
        int num = scan.nextInt();       
        for(int i = 2; i <= num; i++) {
            boolean primo = true;        
            for(int j = 2; j < i; j++) {            
                if(i % j == 0) {
                    primo = false;
                }
            }
            if(primo) {
                System.out.println(i);
            }          
        }
    }
}
*/




}
