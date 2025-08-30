package exercicio3;

import java.util.Scanner;

// 2) Crie um programa que leia e imprima no console todas as linhas de um arquivo de texto.

/* Texto que sera usado
Três Anéis para os Reis-Elfos sob este céu;
Sete para os Senhores-Anões em seus rochosos corredores;
Nove para os Homens Mortais fadados a morrer;
Um para o Senhor do Escuro em seu Escuro Trono,
Na terra de Mordor, onde as Sombras se deitam.
Um Anel para a todos governar, Um Anel para encontrá-los,
Um Anel para a todos trazer e na Escuridão aprisioná-los,
Na terra de Mordor, onde as Sombras se deitam.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class exercicio2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			File texto = new File("poemaDoAnel.txt");
		try {
			while(sc.hasNextLine()) {
				String transcricao = sc.nextLine();
				System.out.println(transcricao);
			}
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}finally {
			sc.close();
		}

	}

}
