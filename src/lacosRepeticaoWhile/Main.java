package lacosRepeticaoWhile;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Exercicio 03

		int idadePessoa = 0;
		int maiorCinquentaAnos = 0;
		int menorVinteEUmAnos = 0;

		while (idadePessoa >= 0) {
			System.out.print("Digite uma idade: ");
			idadePessoa = scan.nextInt();
			if (idadePessoa > 50) {
				maiorCinquentaAnos += 1;
			} else if (idadePessoa < 21 && idadePessoa > 0) {
				menorVinteEUmAnos += 1;
			}
		}

		System.out.println("Total de pessoas menores de 21 anos: " + menorVinteEUmAnos);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorCinquentaAnos);
		System.out.println();

		// Exercicio 04

		int idadeDev, sexoDev, categoriaDev, opcaoSexo, opcaoCategoria;
		int somaCategoria = 0;
		int somaMasculino = 0;
		int somaFeminino = 0;
		int somaOutros = 0;
		int somaBackEnd = 0;
		int somaFrontEnd = 0;
		int somaMobile = 0;
		int somaFullStack = 0;

		int somaMasculinoBackEnd = 0;
		int somaMasculinoFrontEnd = 0;
		int somaMasculinoMobile = 0;
		int somaMasculinoFullStack = 0;

		int somaFemininoBackEnd = 0;
		int somaFemininoFrontEnd = 0;
		int somaFemininoMobile = 0;
		int somaFemininoFullStack = 0;

		int somaOutrosBackEnd = 0;
		int somaOutrosFrontEnd = 0;
		int somaOutrosMobile = 0;
		int somaOutrosFullStack = 0;

		boolean decisaoContinuar = true;

		while (decisaoContinuar) {
			System.out.print("Idade da pessoa desenvolvedora: ");
			idadeDev = scan.nextInt();
			System.out.println();

			System.out.println("Sexo          ");
			System.out.println("1 - Masculino ");
			System.out.println("2 - Feminino  ");
			System.out.println("3 - Outros    ");
			System.out.print("Informe o sexo: ");
			opcaoSexo = scan.nextInt();
			System.out.println();

			switch (opcaoSexo) {
			case 1:
				somaMasculino += 1;
				break;
			case 2:
				somaFeminino += 1;
				break;
			case 3:
				somaOutros += 1;
				break;
			}

			System.out.println("Categoria          ");
			System.out.println("1 - Back-End       ");
			System.out.println("2 - Front-End      ");
			System.out.println("3 - Mobile         ");
			System.out.println("4 - FullStack      ");
			System.out.print("Informe a categoria: ");
			opcaoCategoria = scan.nextInt();
			System.out.println();

			switch (opcaoCategoria) {
			case 1:
				somaBackEnd += 1;
				break;
			case 2:
				somaFrontEnd += 1;
				break;
			case 3:
				somaMobile += 1;
				break;
			case 4:
				somaFullStack += 1;
				break;
				default:
					System.out.println("Categoria Inválida!");
			}

			System.out.println("Deseja Continuar? (S/N)");
			String escolha = scan.next();
			
			if (escolha.equalsIgnoreCase("N") || escolha.equalsIgnoreCase("Nao")) {
				decisaoContinuar = false;
			} else if (escolha.equalsIgnoreCase("S") || escolha.equalsIgnoreCase("Sim")) {
				decisaoContinuar = true;
			}

			// Somando DEVs Masculinos

			if (opcaoSexo == 1 && opcaoCategoria == 1) {
				somaMasculinoBackEnd += 1;
			} else if (opcaoSexo == 1 && opcaoCategoria == 2) {
				somaMasculinoFrontEnd += 1;
			} else if (opcaoSexo == 1 && opcaoCategoria == 3) {
				somaMasculinoMobile += 1;
			} else if (opcaoSexo == 1 && opcaoCategoria == 4) {
				somaMasculinoFullStack += 1;
			}

			// Somando DEVS Femininos

			else if (opcaoSexo == 2 && opcaoCategoria == 1) {
				somaFemininoBackEnd += 1;
			} else if (opcaoSexo == 2 && opcaoCategoria == 2) {
				somaFemininoFrontEnd += 1;
			} else if (opcaoSexo == 2 && opcaoCategoria == 3) {
				somaFemininoMobile += 1;
			} else if (opcaoSexo == 2 && opcaoCategoria == 4) {
				somaFemininoFullStack += 1;
			}

			// Somando DEVs Outros

			else if (opcaoSexo == 3 && opcaoCategoria == 1) {
				somaOutrosBackEnd += 1;
			} else if (opcaoSexo == 3 && opcaoCategoria == 2) {
				somaOutrosFrontEnd += 1;
			} else if (opcaoSexo == 3 && opcaoCategoria == 3) {
				somaOutrosMobile += 1;
			} else if (opcaoSexo == 3 && opcaoCategoria == 4) {
				somaOutrosFullStack += 1;
			}

		}

		System.out.println("Total de DEVs Back-End..................: " + somaBackEnd);
		System.out.println("Total de DEVs Front-End.................: " + somaFrontEnd);
		System.out.println("Total de DEVs Mobile....................: " + somaMobile);
		System.out.println("Total de DEVs FullStack.................: " + somaFullStack);
		System.out.println();
		System.out.println("Total de mulheres DEVs Back-End.........: " + somaFemininoBackEnd);
		System.out.println("Total de mulheres DEVs Front-End........: " + somaFemininoFrontEnd);
		System.out.println("Total de mulheres DEVs Mobile...........: " + somaFemininoMobile);
		System.out.println("Total de mulheres DEVs FullStack........: " + somaFemininoFullStack);
		System.out.println();
		System.out.println("Total de homens DEVs Back-End...........: " + somaMasculinoBackEnd);
		System.out.println("Total de homens DEVs Front-End..........: " + somaMasculinoFrontEnd);
		System.out.println("Total de homens DEVs Mobile.............: " + somaMasculinoMobile);
		System.out.println("Total de homens DEVs FullStack..........: " + somaMasculinoFullStack);
		System.out.println();
		System.out.println("Total de outras pessoas DEVs Back-End...: " + somaOutrosBackEnd);
		System.out.println("Total de outras DEVs Front-End..........: " + somaOutrosFrontEnd);
		System.out.println("Total de outras DEVs Mobile.............: " + somaOutrosMobile);
		System.out.println("Total de outras DEVs FullStack..........: " + somaOutrosFullStack);
		System.out.println();

		scan.close();
	}

}
