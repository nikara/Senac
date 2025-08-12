import java.util.Scanner;

public class JogoDaVelhaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] jogo = {
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '},
        };
        char vitoria = ' ';

        for(int i = 1; i <= jogo.length ; i++){
            System.out.println("Jogada" + i);
            System.out.println(jogo[0][0] + " - " + jogo[0][1] + " - " +jogo [0][2]);
            System.out.println( " --------");
            System.out.println(jogo[1][0] + " - " + jogo[1][1] + " - " +jogo [1][2]);
            System.out.println( " --------");
            System.out.println(jogo[2][0] + " - " + jogo[2][1] + " - " +jogo [2][2]);

            System.out.println(i % 2 == 0 ? "Jogue O" : "Jogue X");

            System.out.println("Digite a linha");
            int linha = sc.nextInt();
            System.out.println("Digite a linha");
            int coluna = sc.nextInt();

            jogo[]



            

        }
    }
}
