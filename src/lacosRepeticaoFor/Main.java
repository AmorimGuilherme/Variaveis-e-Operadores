package lacosRepeticaoFor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Exercicio 01

		int num1, num2;
		System.out.print("Informe o 1º número: ");
		num1 = scan.nextInt();
		System.out.print("Informe o 2º número: ");
		num2 = scan.nextInt();

		if (num1 > num2) {
			System.out.println("Intervalo Inválido!");
		} else {
			System.out.println("No intervalo entre " + num1 + " e " + num2);

			for (int i = 0; i <= num2; i++) {
				if (i % 3 == 0 && i % 5 == 0 && i != 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		}

		System.out.println();

		// Exercicio 02

		int i, num;
		int somaPar = 0;
		int somaImpar = 0;
		int contadorMaximo = 10;

		for (i = 1; i <= contadorMaximo; i++) {
			System.out.print("Digite o " + i + "º número: ");
			num = scan.nextInt();
			if (num % 2 == 0) {
				somaPar += 1;
			} else if (num % 2 != 0) {
				somaImpar += 1;
			}
		}

		System.out.println("Par: " + somaPar);
		System.out.println("Impar: " + somaImpar);
		System.out.println();
	
		scan.close();

	}

}
