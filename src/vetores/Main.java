package vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Exercicio 01

		int[] numerosInteiros = new int[10];

		for (int i = 0; i < numerosInteiros.length; i++) {
			System.out.print("Informe os números dos vetores: ");
			numerosInteiros[i] = scan.nextInt();
		}

		System.out.print("\nInforme o número que deseja encontrar: ");
		int numeroAEncontrar = scan.nextInt();

		for (int i = 0; i < numerosInteiros.length; i++) {
			if (numerosInteiros[i] == numeroAEncontrar) {
				System.out.printf("O número %d está localizado no índice %d.", numeroAEncontrar, i);
			} else {
				System.out.printf("O número %d não foi encontrado!", numeroAEncontrar);
			}

			System.out.println();
			System.out.println();
		}

		// Exercicio 02

		int[] vetorNumerosInteiros = new int[10];
		String mostraPar = "";
		String mostraImpar = "";
		int somaTodosNumeros = 0;
		double mediaNumeros = 0.0;

		for (int i = 0; i < vetorNumerosInteiros.length; i++) {
			System.out.print("Informe os números do vetor: ");
			vetorNumerosInteiros[i] = scan.nextInt();
			somaTodosNumeros += vetorNumerosInteiros[i];

			if (vetorNumerosInteiros[i] % 2 == 0) {
				mostraPar += vetorNumerosInteiros[i] + " ";
			} else {
				mostraImpar += vetorNumerosInteiros[i] + " ";

			}

		}

		mediaNumeros = (double) somaTodosNumeros / vetorNumerosInteiros.length;

		System.out.println("Soma: " + somaTodosNumeros);
		System.out.printf("Média: %.2f ", mediaNumeros);
		System.out.println();
		System.out.println("Números pares: " + mostraPar);
		System.out.println("Números ímpares: " + mostraImpar);

		scan.close();

	}

}
