import java.util.Scanner;

public class Exercicio7 {
    // 7) Crie um programa que calcule o percentual de imposto pago (faturamento \ qtd imposto)
    public static void main(String[] args) {
        System.out.println("Calculadora de Percentual de Imposto Pago");
        Scanner sc = new Scanner(System.in);
        try{
            // Declaração de variaveis
            double faturamento;
            double imposto;

            System.out.println("Vamos calcular o Percentual");
            System.out.println("Quanto você ganha: ");
            faturamento = sc.nextDouble();
            System.out.println("Quanto você paga de imposto:");
            imposto = sc.nextDouble();

            System.out.println("O Percentual do Imposto é " + ((faturamento * imposto)/100)/100 + " %");




        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }finally{
            sc.close();
        }
    }
}
