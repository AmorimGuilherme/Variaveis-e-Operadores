package matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Exercicio 03

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

		// for(double[] mediaTurma: notasAlunosAnual) {

		System.out.println("Média dos alunes: " + Arrays.toString(mediasAlunos));

		scan.close();

	}

}
