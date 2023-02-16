package vetoresEMatrizes;

import java.util.Arrays;
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
		System.out.println();
		System.out.println();

		// Exercicio 03

		int[][] matriz = new int[3][3];
		int[] diagonalPrincipal = new int[3];
		int[] diagonalSecundaria = new int[3];
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Digite o valor da posição (%d , %d):\n", i, j);
				matriz[i][j] = scan.nextInt();
				if (i == j) {

					diagonalPrincipal[i] = matriz[i][j];
					somaDiagonalPrincipal += matriz[i][j];
				}
				if ((i + j) == matriz.length - 1) {
					diagonalSecundaria[i] = matriz[i][j];
					somaDiagonalSecundaria += matriz[i][j];
				}
			}
		}

		System.out.printf("Elementos da Diagonal Principal: \n %d %d %d\n", diagonalPrincipal[0], diagonalPrincipal[1],
				diagonalPrincipal[2]);
		System.out.printf("Elementos da Diagonal Secundária: \n %d %d %d\n", diagonalSecundaria[0],
				diagonalSecundaria[1], diagonalSecundaria[2]);
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);

		// Exercicio 04

		int aluno = 10;
		int bimestre = 4;
		double mediaNotaAluno = 0.0;
		double somaNotaAluno = 0.0;
		double[] mediasAlunos = new double[aluno];
		double[][] notasAlunosAnual = new double[aluno][bimestre];

		for (int i = 0; i < notasAlunosAnual.length; i++) {
			System.out.println();
			somaNotaAluno = 0;
			for (int j = 0; j < notasAlunosAnual[bimestre].length; j++) {
				System.out.print("Informe a " + (j + 1) + "ª nota do " + (i + 1) + "º alune: ");
				double notaAluno = scan.nextDouble();
				somaNotaAluno += notaAluno;
				mediaNotaAluno = somaNotaAluno / bimestre;
				mediasAlunos[i] = mediaNotaAluno;

			}
		}

		System.out.println("Média dos alunes: " + Arrays.toString(mediasAlunos));

		scan.close();

	}

}
