package programacaoSequencial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Exercicio 01

		int dia, mes, ano, idadeDias;

		System.out.println("De acordo com a sua idade, expresse-a em: dias, meses e anos:");
		System.out.print("Anos: ");
		ano = scan.nextInt();
		System.out.print("Meses: ");
		mes = scan.nextInt();
		System.out.print("Dias: ");
		dia = scan.nextInt();

		idadeDias = (ano * 365) + (mes * 30) + dia;

		System.out.println("Idade em dias: " + idadeDias);
		System.out.println();

		// Exercicio 02

		int idadeDia, idadeMes, idadeAno, diasIdade;

		System.out.print("Idade em dias: ");
		diasIdade = scan.nextInt();

		idadeAno = diasIdade / 365;
		idadeMes = (diasIdade % 365) / 30;
		idadeDia = (diasIdade % 365) % 30;

		String idadeFinal = idadeAno + " anos, " + idadeMes + " mes(es) e " + idadeDia + " dia(s)";

		System.out.println("Idade Final: " + idadeFinal);
		System.out.println();

		// Exercicio 03

		int segundo, minuto, hora, duracaoEmSegundos;

		System.out.print("Digite a duração do evento em segundos: ");
		duracaoEmSegundos = scan.nextInt();

		segundo = (duracaoEmSegundos % 3600) % 60;
		minuto = (duracaoEmSegundos % 3600) / 60;
		hora = duracaoEmSegundos / 3600;

		String tempoFinal = hora + " hora(s), " + minuto + " minuto(s) e " + segundo + " segundo(s).";

		System.out.println("Tempo final: " + tempoFinal);
		System.out.println();

		// Exercicio 04

		int A, B, C;

		System.out.print("Insira o valor de A: ");
		A = scan.nextInt();
		System.out.print("Insira o valor de B: ");
		B = scan.nextInt();
		System.out.print("Insira o valor de C: ");
		C = scan.nextInt();

		double R = Math.pow((A + B), 2);

		System.out.println("VALOR R: " + R);

		double S = Math.pow((B + C), 2);

		System.out.println("VALOR S: " + S);

		double D = (R + S) / 2;

		System.out.println("D = " + D);
		System.out.println();

		// Exercicio 05

		float nota1, nota2, nota3, mediaPonderada;

		System.out.print("Digite a 1ª nota: ");
		nota1 = scan.nextFloat();
		System.out.print("Digite a 2ª nota: ");
		nota2 = scan.nextFloat();
		System.out.print("Digite a 3ª nota: ");
		nota3 = scan.nextFloat();

		mediaPonderada = (nota1 * 2) + (nota2 * 3) + (nota3 * 5) / (2 + 3 + 5);

		System.out.printf("Média ponderada: %.2f", mediaPonderada);
		System.out.println();

		// Exercicio 06

		int x1, x2, y1, y2;
		double dFormula;

		System.out.print("Informe x1: ");
		x1 = scan.nextInt();
		System.out.print("Informe x2: ");
		x2 = scan.nextInt();
		System.out.print("Informe y1: ");
		y1 = scan.nextInt();
		System.out.print("Informe y2: ");
		y2 = scan.nextInt();

		dFormula = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow((y2 - y1), 2)));

		System.out.printf("d = %.2f", dFormula);
		System.out.println();

		// Exercicio 07

		int a, b, c, d, e, f;
		float x, y;

		System.out.print("Informe a: ");
		a = scan.nextInt();
		System.out.print("Informe b: ");
		b = scan.nextInt();
		System.out.print("Informe c: ");
		c = scan.nextInt();
		System.out.print("Informe d: ");
		d = scan.nextInt();
		System.out.print("Informe e: ");
		e = scan.nextInt();
		System.out.print("Informe f: ");
		f = scan.nextInt();

		x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		y = ((a * f) - (c * d)) / ((a * e) - (b * d));

		System.out.printf("Valor x: %.2f", x);
		System.out.println();
		System.out.printf("Valor y: %.2f", y);
		System.out.println();
		System.out.println();

		// Exercicio 08

		double precoFabricaCarro, precoFinalCarro, percentagemDistribuidor, imposto;

		System.out.print("Valor de fábrica do carro: R$");
		precoFabricaCarro = scan.nextDouble();
		System.out.print("Porcentagem do distribuidor: ");
		percentagemDistribuidor = scan.nextDouble();
		System.out.print("Porcentagem do imposto: ");
		imposto = scan.nextDouble();

		double precoImpostoCarro = precoFabricaCarro * (imposto * 0.01);
		double precoPercentagemDistribuidor = precoFabricaCarro * (percentagemDistribuidor * 0.01);
		precoFinalCarro = precoFabricaCarro + precoPercentagemDistribuidor + precoImpostoCarro;

		System.out.printf("Preço final do carro: R$ %.2f", precoFinalCarro);

		scan.close();

	}

}
