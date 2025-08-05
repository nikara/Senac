import java.util.Scanner;

public class Exercicio11 {
/*
11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:

Base	Alíquota
Até 1.903,98	Isento
De 1.903,99 até 2.826,65	7,5%
De 2.826,66 até 3.751,05	15%
De 3.751,06 até 4.664,68	22,5%
Acima de 4.664,68	27,5%
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Calculadora de Imposto VAMOS CALCULAR PORRA ");
            System.out.println("Digite o seu salário:");
            double salario  = sc.nextDouble();
            double imposto = 0.0;

            if (salario <= 1903.98){
                System.out.println(" Isento POBRE ");
            }else if (salario >= 1903.99 && salario <= 2826.65){
                imposto = (salario*0.075);
            }else if (salario >= 2826.66 && salario <= 3751.05){
                imposto = (salario*0.15);
            }else if (salario >= 3751.06 && salario <= 4664.68){
                imposto = (salario*0.225);
            }else if (salario >= 4664.68){
                imposto = (salario*0.275);
            }
            System.out.println("A valor de imposto que você tem que pegar é " + imposto);


        }catch(Exception e){
            System.out.println("Erro: "+ e.getMessage());
        }finally{
            sc.close();
        }
    }
}
