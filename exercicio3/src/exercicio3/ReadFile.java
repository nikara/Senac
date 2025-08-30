package exercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		try {
			File myObjt = new File("poemaDoAnel.txt");
			Scanner sc = new Scanner(myObjt);
			while(sc.hasNextLine()){
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
			
		}catch(FileNotFoundException  e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}

	}

}
