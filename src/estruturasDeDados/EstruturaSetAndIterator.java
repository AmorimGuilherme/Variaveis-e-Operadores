package estruturasDeDados;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EstruturaSetAndIterator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num, numeroAEncontrar;

		Set<Integer> numeros = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			num = scan.nextInt();
			numeros.add(num);
		}

		System.out.print("Digite o número que deseja encontrar: ");
		numeroAEncontrar = scan.nextInt();
		if (!numeros.contains(numeroAEncontrar)) {
			System.out.println("O número " + numeroAEncontrar + " não foi encontrado!");
		} else {
			System.out.print("O número " + numeroAEncontrar + " foi encontrado!");
		}
		scan.close();
	}

}
