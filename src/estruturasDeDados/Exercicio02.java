package estruturasDeDados;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String nomeLivro;
		int opcao;

		Stack<String> listaLivros = new Stack<>();

		do {
			System.out.println("--------------------BIBLIOTECA JAVA--------------------");
			System.out.println("(1) Adicionar livros na pilha..........................");
			System.out.println("(2) Listar todos os livros.............................");
			System.out.println("(3) Retirar livro da pilha.............................");
			System.out.println("(0) Sair...............................................");
			System.out.println("-------------------------------------------------------");
			System.out.println("\nPor favor, digite sua opção: ");
			opcao = scan.nextInt();
			scan.nextLine();

			switch (opcao) {
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			case 1:
				System.out.print("\nInforme o nome do livro: ");
				nomeLivro = scan.nextLine();
				listaLivros.add(nomeLivro);
				System.out.println("\nLivro adicionado!");
				break;
			case 2:
				if (!listaLivros.isEmpty()) {
					System.out.println(listaLivros);
				} else {
					System.err.println("A lista está vazia!");
				}
				break;
			case 3:
				if (!listaLivros.isEmpty()) {
					System.out.print("\nInforme o nome do livro a remover: ");
					String nomeLivroARemover = scan.nextLine();
					if (listaLivros.contains(nomeLivroARemover)) {
						listaLivros.remove(nomeLivroARemover);
					} else {
						System.err.println("\nLivro não encontrado!");
					}

				}
				break;
			default:
				System.out.println("\nOpção Inválida!");
			}

		} while (opcao != 0);

		scan.close();
	}

}
