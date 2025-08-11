package exercicio2;

import java.util.Random;
import java.util.Scanner;



public class exercicio3 {
/*3) Crie um programa que simule um jogo da forca, com a entrada da palavra oculta, 
 * a quantidade de tentativas para acerto e depois solicite a entrada da letra. 
 * A cada erro deve imprimir a quantidade de tentativas restantes e o 'membro' que foi marcado. 
 * Ao final deve imprimir se acertou ou não a palavra e se foi 'enforcado'.*/
	
	
	public static void main(String[] args) {
	
		System.out.println("Jogo da Forca");
		
		// Define as palavras que serão usadas
		String[] palavras = {"java","programacao","computador","algoritmo"};
		
		// Instancia o método random
		Random random = new Random();
		
		// Define qual vai ser a palavra secreta
		String palavaraSecreta = palavras[random.nextInt(palavras.length)];
		
		// Cria um char para fazer as casas da palavras Exemplo: _ _ _ _ _
		char[] palavraOculta = new char[palavaraSecreta.length()];
		
		for(int i = 0; i < palavraOculta.length; i++) {
			palavraOculta[i] = '_';
		}
		
		// Numero de tentativas
		int tentativasRestantes = 6;
		Scanner scanner = new Scanner(System.in);
			
		
		// Loop da forca
		while(tentativasRestantes > 0 && new String(palavraOculta).contains("_")) {
			System.out.println("\nPalavra: " + new String(palavraOculta));
			System.out.println("\nTentativas restantes: " + tentativasRestantes);
			System.out.println("\nDigite uma letra: ");
			char letra = scanner.next().charAt(0);
			
			boolean letraCorreta = false;
			// Verifica letra por letra
			for (int i = 0; i < palavaraSecreta.length(); i++) {
				if(palavaraSecreta.charAt(i) == letra) {
					palavraOculta[i] = letra;
					letraCorreta = true;
				}
				
			}
			// Diminui a quantidade de palavras
			if(letraCorreta == false) {
				tentativasRestantes -= 1;
				System.out.print("\nLetra errada Tentativas restantes: " + tentativasRestantes);
			}
			
		}
		
		if(tentativasRestantes == 0) {
			System.out.println("\nVocê não descobriu a palavra secreta");
		}
				
	}
				
			
			
			
			
			
		
	}

