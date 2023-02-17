package estruturasDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class EstruturaArrayListInteger {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("Informe o número que deseja encontrar: ");
		int num = scan.nextInt();

		for (int i = 0; i < numeros.size(); i++) {
			if (num == numeros.get(i)) {
				System.out.println("O número " + num + " está localizado no índice " + i);
			}
			if (!numeros.contains(num)) {

				System.out.println("O número " + num + " não foi encontrado!");
				break;
			}
		}

		scan.close();
	}
}
