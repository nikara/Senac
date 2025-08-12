import java.util.Scanner;

public class JogoDavelha {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    

        char a = ' '; // 0,0
        char b = ' '; // 0,1
        char c = ' '; // 0,2
        char d = ' '; // 1,0
        char e = ' '; // 1,1
        char f = ' '; // 1,2
        char g = ' '; // 2,0
        char h = ' '; // 2,1
        char i = ' '; // 2,2

        for (int count = 1; count <= 9; count++){
            System.out.println("Jogada " + count);
            System.out.println(count % 2 == 0 ? "Jogue O" : "Jogue 'X"); // Ternario de IF boa dica
            boolean valorOk = false;
            do{
                System.out.println("Informe a linha");
                int linha = sc.nextInt();
                System.out.println("informe a linha");
                int coluna = sc.nextInt();
                
                if(linha > 2 || coluna > 2){
                    System.out.println("Linha ou coluna inválida, por favor informe novamente.");
                }else if (
                    (linha == 0 && coluna == 0 && a != ' ')
                    ||(linha == 0 && coluna == 1 && b != ' ')
                    ||(linha == 0 && coluna == 2 && c != ' ')
                    ||(linha == 1 && coluna == 0 && d != ' ')
                    ||(linha == 1 && coluna == 1 && e != ' ')
                    ||(linha == 1 && coluna == 2 && f != ' ')
                    ||(linha == 2 && coluna == 0 && g != ' ')
                    ||(linha == 2 && coluna == 1 && h != ' ')
                    ||(linha == 2 && coluna == 2 && i != ' ')){
                    System.out.println("Inforamção já preenchida, escolha outra");
                    valorOk = true;
                    continue;
                }
            }while(! valorOk )
            
            
        }


}
    
}

