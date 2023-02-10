package lacosCondicionaisIfElse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Exercicio 01

		int A, B, C, somaAB;

		System.out.print("Digite A: ");
		A = scan.nextInt();
		System.out.print("Digite B: ");
		B = scan.nextInt();
		System.out.print("Digite C: ");
		C = scan.nextInt();

		somaAB = A + B;

		if (somaAB > C) {
			System.out.println(somaAB + " é maior que " + C);
		} else if (somaAB < C) {
			System.out.println(somaAB + " é menor que " + C);
		} else {
			System.out.println(somaAB + " é igual a " + C);
		}

		System.out.println();

		// Exercicio 02

		int num;

		System.out.print("Digite um numero qualquer: ");
		num = scan.nextInt();

		if (num % 2 == 0 && num > 0) {
			System.out.println(num + " é par e positivo");
		} else if (num % 2 == 0 && num < 0) {
			System.out.println(num + " é par e negativo");
		} else if (num % 2 != 0 && num > 0) {
			System.out.println(num + " é ímpar e positivo");
		} else if (num % 2 != 0 && num < 0) {
			System.out.println(num + " é ímpar e negativo");
		} else {
			System.out.println(num + " é 0!");
		}

		System.out.println();

		// Exercicio 03

		String nomeDoador;
		int idadeDoador;
		boolean primeiraDoacao;

		System.out.print("Digite o nome da pessoa doadora: ");
		nomeDoador = scan.next();
		System.out.print("Idade da pessoa doadora " + nomeDoador + ": ");
		idadeDoador = scan.nextInt();
		System.out.println("Primeira doação da pessoa " + nomeDoador + "?");
		String decisaoDoacao = scan.next();

		if (decisaoDoacao.equalsIgnoreCase("Sim") || decisaoDoacao.equalsIgnoreCase("s")) {
			primeiraDoacao = true;
			if (idadeDoador >= 60 && idadeDoador <= 69 && primeiraDoacao == true) {
				System.out.println(nomeDoador + " NÃO está apto para doar!");
			} else if (idadeDoador >= 18 && idadeDoador <= 69 && primeiraDoacao == true) {
				System.out.println(nomeDoador + " está apto para doar!");
			}
		}

		if (decisaoDoacao.equalsIgnoreCase("Nao") || decisaoDoacao.equalsIgnoreCase("n")) {
			primeiraDoacao = false;
			if (idadeDoador >= 18 && idadeDoador <= 69 && primeiraDoacao == false) {
				System.out.println(nomeDoador + " está apto para doar!");
			} else if (idadeDoador < 18 || idadeDoador > 69) {
				System.out.println(nomeDoador + " NÃO está apto para doar!");

			}
		}

		// Exercicio 04

		String primeiraPalavra, segundaPalavra, terceiraPalavra;

		System.out.print("Digite a primeira palavra: ");
		primeiraPalavra = scan.next();
		System.out.print("Digite a segunda palavra: ");
		segundaPalavra = scan.next();
		System.out.print("Digite a terceira palavra: ");
		terceiraPalavra = scan.next();

		if (primeiraPalavra.equalsIgnoreCase("vertebrado") && segundaPalavra.equalsIgnoreCase("ave")
				&& terceiraPalavra.equalsIgnoreCase("carnivoro")) {
			System.out.println("Animal escolhido: Águia!");
		} else if (primeiraPalavra.equalsIgnoreCase("vertebrado") && segundaPalavra.equalsIgnoreCase("ave")
				&& terceiraPalavra.equalsIgnoreCase("onivoro")) {
			System.out.println("Animal escolhido: Pomba!");
		} else if (primeiraPalavra.equalsIgnoreCase("vertebrado") && segundaPalavra.equalsIgnoreCase("mamifero")
				&& terceiraPalavra.equalsIgnoreCase("onivoro")) {
			System.out.println("Animal escolhido: Homem!");
		} else if (primeiraPalavra.equalsIgnoreCase("vertebrado") && segundaPalavra.equalsIgnoreCase("mamifero")
				&& terceiraPalavra.equalsIgnoreCase("herbivoro")) {
			System.out.println("Animal escolhido: Vaca!");
		} else if (primeiraPalavra.equalsIgnoreCase("invertebrado") && segundaPalavra.equalsIgnoreCase("inseto")
				&& terceiraPalavra.equalsIgnoreCase("hematofago")) {
			System.out.println("Animal escolhido: Pulga!");
		} else if (primeiraPalavra.equalsIgnoreCase("invertebrado") && segundaPalavra.equalsIgnoreCase("inseto")
				&& terceiraPalavra.equalsIgnoreCase("herbivoro")) {
			System.out.println("Animal escolhido: Lagarta!");
		} else if (primeiraPalavra.equalsIgnoreCase("invertebrado") && segundaPalavra.equalsIgnoreCase("anelideo")
				&& terceiraPalavra.equalsIgnoreCase("hematofago")) {
			System.out.println("Animal escolhido: Sanguessuga!");
		} else if (primeiraPalavra.equalsIgnoreCase("invertebrado") && segundaPalavra.equalsIgnoreCase("anelideo")
				&& terceiraPalavra.equalsIgnoreCase("onivoro")) {
			System.out.println("Animal escolhido: Minhoca!");
		} else {
			System.out.println("Digite uma palavra válida!");
		}

		scan.close();

	}
}