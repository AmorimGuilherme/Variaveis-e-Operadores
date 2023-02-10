package lacosRepeticaoDoWhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Exercicio 05

		int numero;
		int somaPositivos = 0;

		do {
			System.out.print("Digite um número: ");
			numero = scan.nextInt();
			if (numero >= 0) {
				somaPositivos += numero;
			}

		} while (numero != 0);

		System.out.println("Soma dos números positivos: " + somaPositivos);
		System.out.println();

		// Exercicio 06

		int num;
		float somaMultiplosDeTres = 0;
		int quantidadeMultiplosDeTres = 0;
		float mediaMultiplosDeTres;

		do {
			System.out.print("Digite um número: ");
			num = scan.nextInt();
			if (num % 3 == 0 && num != 0) {
				somaMultiplosDeTres += num;
				quantidadeMultiplosDeTres += 1;
			}

		} while (num != 0);

		mediaMultiplosDeTres = somaMultiplosDeTres / quantidadeMultiplosDeTres;

		System.out.printf("A média de todos os números multiplos de 3 é: %.1f", mediaMultiplosDeTres);

		scan.close();
	}

}
