package lacosRepeticaoExtra;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Exercicio 01

		for (int i = 1000; i < 2000; i++) {
			if (i % 11 == 5) {
				System.out.println("O resto de " + i + " dividido por 11 é 5!");
			}
		}

		System.out.println();

		// Exercicio 02

		int somaPar = 0;
		int somaImpar = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			int num = scan.nextInt();

			if (num % 2 == 0) {
				somaPar++;
			} else {
				somaImpar++;
			}
		}

		System.out.printf("Há %s números pares e %s números ímpares!", somaPar, somaImpar);
		System.out.println();
		System.out.println();

		// Exercicio 03

		int idade = 0;
		int somaMenorVinteEUm = 0;
		int somaMaiorCinquenta = 0;

		while (idade != -99) {
			System.out.print("Informe a idade: ");
			idade = scan.nextInt();
			if (idade < 21 && idade > 0) {
				somaMenorVinteEUm++;
			} else if (idade > 50) {
				somaMaiorCinquenta++;
			}
		}

		System.out.printf("%s pessoas com menos de 21 anos e %s pessoas com mais de 50 anos!", somaMenorVinteEUm,
				somaMaiorCinquenta);
		System.out.println();
		System.out.println();

		// Exercicio 04

		int idadePessoa, opcaoGenero, opcaoComportamento;
		int somaMasculino = 0;
		int somaFeminino = 0;
		int somaOutros = 0;
		int somaCalmo = 0;
		int somaNervoso = 0;
		int somaAgressivo = 0;

		int somaFemininoCalmo = 0;
		int somaFemininoNervoso = 0;
		int somaFemininoAgressivo = 0;

		int somaMasculinoCalmo = 0;
		int somaMasculinoNervoso = 0;
		int somaMasculinoAgressivo = 0;

		int somaOutrosCalmo = 0;
		int somaOutrosNervoso = 0;
		int somaOutrosAgressivo = 0;

		int pessoaCalmaAbaixoDeDezoito = 0;
		int pessoaNervosaAbaixoDeDezoito = 0;
		int pessoaAgressivaAbaixoDeDezoito = 0;
		int pessoaCalmaAcimaDeQuarenta = 0;
		int pessoaNervosaAcimaDeQuarenta = 0;
		int pessoaAgressivaAcimaDeQuarenta = 0;

		int decisaoContinuar = 0;
		int limitePessoas = 3;

		while (decisaoContinuar != limitePessoas) {
			System.out.print("Idade da pessoa: ");
			idadePessoa = scan.nextInt();
			System.out.println();

			System.out.println("Sexo          ");
			System.out.println("1 - Feminino ");
			System.out.println("2 - Masculino  ");
			System.out.println("3 - Outros    ");
			System.out.print("Informe o gênero: ");
			opcaoGenero = scan.nextInt();
			System.out.println();

			switch (opcaoGenero) {
			case 1:
				somaFeminino += 1;
				break;
			case 2:
				somaMasculino += 1;
				break;
			case 3:
				somaOutros += 1;
				break;
			}

			System.out.println("Comportamento          ");
			System.out.println("1 - Calmo              ");
			System.out.println("2 - Nervoso            ");
			System.out.println("3 - Agressivo           ");
			System.out.print("Informe o comportamento: ");
			opcaoComportamento = scan.nextInt();
			System.out.println();

			switch (opcaoComportamento) {
			case 1:
				somaCalmo += 1;
				break;
			case 2:
				somaNervoso += 1;
				break;
			case 3:
				somaAgressivo += 1;
				break;
			default:
				System.out.println("Comportamento Inválido!");
			}

			if (opcaoGenero == 1 && opcaoComportamento == 1) {
				somaFemininoCalmo += 1;
			} else if (opcaoGenero == 1 && opcaoComportamento == 2) {
				somaFemininoNervoso += 1;
			} else if (opcaoGenero == 1 && opcaoComportamento == 3) {
				somaFemininoAgressivo += 1;
			}

			else if (opcaoGenero == 2 && opcaoComportamento == 1) {
				somaMasculinoCalmo += 1;
			} else if (opcaoGenero == 2 && opcaoComportamento == 2) {
				somaMasculinoNervoso += 1;
			} else if (opcaoGenero == 2 && opcaoComportamento == 3) {
				somaMasculinoAgressivo += 1;
			}

			else if (opcaoGenero == 3 && opcaoComportamento == 1) {
				somaOutrosCalmo += 1;
			} else if (opcaoGenero == 3 && opcaoComportamento == 2) {
				somaOutrosNervoso += 1;
			} else if (opcaoGenero == 3 && opcaoComportamento == 3) {
				somaOutrosAgressivo += 1;
			}

			if (idadePessoa < 18 && opcaoComportamento == 1) {
				pessoaCalmaAbaixoDeDezoito++;
			} else if (idadePessoa < 18 && opcaoComportamento == 2) {
				pessoaNervosaAbaixoDeDezoito++;
			} else if (idadePessoa < 18 && opcaoComportamento == 3) {
				pessoaAgressivaAbaixoDeDezoito++;
			}

			if (idadePessoa > 40 && opcaoComportamento == 1) {
				pessoaCalmaAcimaDeQuarenta++;
			} else if (idadePessoa > 40 && opcaoComportamento == 2) {
				pessoaNervosaAcimaDeQuarenta++;
			} else if (idadePessoa > 40 && opcaoComportamento == 3) {
				pessoaAgressivaAcimaDeQuarenta++;
			}

			decisaoContinuar++;

		}

		System.out.println("Total de pessoas calmas..............: " + somaCalmo);
		System.out.println("Total de pessoas nervosas............: " + somaNervoso);
		System.out.println("Total de pessoas agressivas..........: " + somaAgressivo);
		System.out.println();
		System.out.println("Total de mulheres calmas.............: " + somaFemininoCalmo);
		System.out.println("Total de mulheres nervosas...........: " + somaFemininoNervoso);
		System.out.println("Total de mulheres agressivas.........: " + somaFemininoAgressivo);
		System.out.println();
		System.out.println("Total de homens calmos...............: " + somaMasculinoCalmo);
		System.out.println("Total de homens nervosos.............: " + somaMasculinoNervoso);
		System.out.println("Total de homens agressivos...........: " + somaMasculinoAgressivo);
		System.out.println();
		System.out.println("Total de outras pessoas calmas.......: " + somaOutrosCalmo);
		System.out.println("Total de outras pessoas nervosas.....: " + somaOutrosNervoso);
		System.out.println("Total de outras pessoas agressivas...: " + somaOutrosAgressivo);
		System.out.println();
		System.out.println("Total de pessoas calmas com menos de 18 anos.........: " + pessoaCalmaAbaixoDeDezoito);
		System.out.println("Total de pessoas nervosas com menos de 18 anos.......: " + pessoaNervosaAbaixoDeDezoito);
		System.out.println("Total de pessoas agressivas com menos de 18 anos.....: " + pessoaAgressivaAbaixoDeDezoito);
		System.out.println();
		System.out.println("Total de pessoas calmas com mais de 40 anos.........: " + pessoaCalmaAcimaDeQuarenta);
		System.out.println("Total de pessoas nervosas com mais de 40 anos.......: " + pessoaNervosaAcimaDeQuarenta);
		System.out.println("Total de pessoas agressivas com mais de 40 anos.....: " + pessoaAgressivaAcimaDeQuarenta);
		System.out.println();

		// Exercicio 05

		int numero;
		int somaNumero = 0;

		do {

			System.out.print("Digite um número: ");
			numero = scan.nextInt();
			somaNumero += numero;

		} while (numero != 0);

		System.out.println("Soma dos números digitados é: " + somaNumero);
		System.out.println();

		// Exercicio 06

		int num;
		double quantidadeNum = 0;
		double mediaNum = 0;
		double somaNum = 0;

		do {
			System.out.print("Digite um número: ");
			num = scan.nextInt();
			if (num != 0) {
				quantidadeNum++;
				somaNum += num;
			}

		} while (num != 0);

		mediaNum = somaNum / quantidadeNum;
		System.out.printf("Média de todos os números: %.2f", mediaNum);

		scan.close();
	}
}