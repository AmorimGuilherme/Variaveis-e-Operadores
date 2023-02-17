package estruturasDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class EstruturaArrayListString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.print("Informe uma cor: ");
			String cor = scan.next();
			cores.add(cor);
		}

		System.out.println("\nListar todas as cores: ");

		for (String cor : cores) {
			System.out.println(cor);
		}

		cores.sort(null);

		System.out.println("\nOrdenando cores em ordem alfabética: ");
		for (String cor : cores) {
			System.out.println(cor);
		}

		scan.close();

	}

}
