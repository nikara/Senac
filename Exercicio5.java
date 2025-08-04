import java.util.Scanner;

public class Exercicio5 {
    public static void main (String [] args ){
        System.out.println("Calcula a Bhaskara");
        Scanner sc = new Scanner(System.in);
        
        try{
        
        // Declaração das variaveis
        double x1,x2, delta,a,b,c;

        System.out.println("Vamos calcular o Bhaskara" );

        System.out.println("Digite o valor A: " );
        a = sc.nextDouble();
        System.out.println("Digite o valor B: " );
        b = sc.nextDouble();
        System.out.println("Digite o valor C: " );
        c = sc.nextDouble();

        System.out.println("Agora vou calcular o delta" );

        delta =(Math.pow(b,2)) - (4*a*c);

        if(delta < 0){
            System.out.println("Não a uma raize");
        }else if (delta == 0) {
            System.out.println("Havera apenas uma raize");
            x1 = ((-b - Math.sqrt(delta)) / 2*a);
            System.out.println("A raize e  " + x1 );
        }else{
            System.out.println("Havera duas raize");
            x1 = ((-b - Math.sqrt(delta)) / 2*a);
            x2 = ((-b + Math.sqrt(delta)) / 2*a);
            
            System.out.println("As raizes são " + x1 + " é " + x2);
        }
        }
        
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }finally{
            sc.close();
        }
    }
}
