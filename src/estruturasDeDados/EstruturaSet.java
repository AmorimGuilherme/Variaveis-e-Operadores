package estruturasDeDados;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EstruturaSet {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			int num = scan.nextInt();
			numeros.add(num);
		}

		Iterator<Integer> iNumeros = numeros.iterator();

		System.out.println("Listando com Iterator: ");
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

		scan.close();
	}

}
