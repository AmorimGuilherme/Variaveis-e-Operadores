package variaveisEOperadores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Exercicio 01

		Scanner scan = new Scanner(System.in);

		double salario, abono, novoSalario;

		System.out.print("Digite o salário: R$");
		salario = scan.nextDouble();
		System.out.print("Digite o abono: R$");
		abono = scan.nextDouble();

		novoSalario = salario + abono;

		System.out.printf("Novo salário: R$%.2f", novoSalario);
		System.out.println();
		System.out.println();

		// Exercicio 02

		float nota1, nota2, nota3, nota4, media;

		System.out.print("Digite a 1ª nota: ");
		nota1 = scan.nextFloat();
		System.out.print("Digite a 2ª nota: ");
		nota2 = scan.nextFloat();
		System.out.print("Digite a 3ª nota: ");
		nota3 = scan.nextFloat();
		System.out.print("Digite a 4ª nota: ");
		nota4 = scan.nextFloat();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.printf("Média final: %.1f", media);
		System.out.println();
		System.out.println();

		// Exercicio 03

		float salarioBruto, adicionalNoturno, horasExtras, descontoColaborador, salarioLiquido;

		System.out.print("Digite o salario bruto: R$");
		salarioBruto = scan.nextFloat();
		System.out.print("Digite o adicional noturno: R$");
		adicionalNoturno = scan.nextFloat();
		System.out.print("Digite as horas extras: ");
		horasExtras = scan.nextFloat();
		System.out.print("Digite os descontos: R$");
		descontoColaborador = scan.nextFloat();

		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontoColaborador;

		System.out.printf("Salário líquido: R$%.2f", salarioLiquido);
		System.out.println();
		System.out.println();

		// Exercicio 04

		int n1, n2, n3, n4, calculo;

		System.out.print("Digite n1: ");
		n1 = scan.nextInt();
		System.out.print("Digite n2: ");
		n2 = scan.nextInt();
		System.out.print("Digite n3: ");
		n3 = scan.nextInt();
		System.out.print("Digite n4: ");
		n4 = scan.nextInt();

		calculo = (n1 * n2) - (n3 * n4);

		System.out.println("Diferença: " + calculo);

		scan.close();
	}

}
