package exercicio2;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class Exercicio4 {
		//4) Crie um programa que imprima a tabuada de 0 a 10.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Cria a janela
		JFrame janela = new JFrame("TabuadaIneirto");
		
		// Cri um texto para mostrar
		JLabel texto = new JLabel("Olá mundo");
		
		// Configura a janela
		janela.setSize(400,200);// Largura x altura
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.add(texto); // adiciona o texo
		janela.setVisible(true);// mostra a janela
		
		//System.out.println("Você quer que eu imprima a tabuada de 0 a 10 ? Digite SIM ou Não:");
		//String resposta = sc.nextLine();
		
		//if(resposta.equalsIgnoreCase("sim")
		
		
		
		
	}

}
