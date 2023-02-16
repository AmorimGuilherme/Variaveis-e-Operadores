package estruturasDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Queue<String> filaClientes = new LinkedList<>();

		String nomeCliente;
		int opcao;

		do {
			System.out.println("--------------------BANCO JAVA--------------------");
			System.out.println("(1) Adicionar cliente na fila.....................");
			System.out.println("(2) Listar todos os clientes......................");
			System.out.println("(3) Retirar cliente da fila.......................");
			System.out.println("(0) Sair..........................................");
			System.out.println("--------------------------------------------------");
			System.out.println("\nPor favor, digite sua opção: ");
			opcao = scan.nextInt();
			scan.nextLine();

			switch (opcao) {
			case 0:
				System.out.println("\nPrograma finalizado!");
				break;
			case 1:
				System.out.print("\nInforme o nome do cliente: ");
				nomeCliente = scan.nextLine();
				filaClientes.add(nomeCliente);
				break;
			case 2:
				if (!filaClientes.isEmpty()) {
					System.out.println("\nOs clientes são: ");
					System.out.println(filaClientes);
				} else {
					System.err.println("\nA fila está vazia!");
				}
				break;
			case 3:
				if (!filaClientes.isEmpty()) {
					System.out.println("\nInforme o cliente que quer remover: ");
					String nomeClienteARemover = scan.nextLine();
					if (filaClientes.contains(nomeClienteARemover)) {
						filaClientes.remove(nomeClienteARemover);
					} else {
						System.err.println("\nCliente não encontrado!");
					}
				} else {
					System.out.println("\nA fila está vazia!");
				}
				break;
			default:
				System.out.println("\nOpção Inválida!");
			}

		} while (opcao != 0);

		scan.close();

	}

}
