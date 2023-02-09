package lacosCondicionaisSwitchCase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Exercicio 05

		int opcaoMenu, quantidadeProduto;
		double valorProduto, valorTotal;
		String nomeProduto;

		System.out.println("Código do Produto\t| Produto         \t| Preco Unitario");
		System.out.println("1                \t| Cachorro Quente \t| R$ 10,00");
		System.out.println("2                \t| X-Salada        \t| R$ 15,00");
		System.out.println("3                \t| X-Bacon         \t| R$ 18,00");
		System.out.println("4                \t| Bauru           \t| R$ 12,00");
		System.out.println("5                \t| Refrigerante    \t| R$ 08,00");
		System.out.println("6                \t| Suco de Laranja \t| R$ 13,00");
		System.out.print("\nCódigo do produto: ");
		opcaoMenu = scan.nextInt();
		System.out.print("Quantidade: ");
		quantidadeProduto = scan.nextInt();

		switch (opcaoMenu) {

		case 1:
			nomeProduto = "Cachorro Quente";
			valorProduto = 10.00;
			valorTotal = quantidadeProduto * valorProduto;
			System.out.println("Produto: " + nomeProduto + " | Valor Total: R$" + valorTotal);
			break;
		case 2:
			nomeProduto = "X-Salada";
			valorProduto = 15.00;
			valorTotal = quantidadeProduto * valorProduto;
			System.out.println("Produto: " + nomeProduto + " | Valor Total: R$" + valorTotal);
			break;
		case 3:
			nomeProduto = "X-Bacon";
			valorProduto = 18.00;
			valorTotal = quantidadeProduto * valorProduto;
			System.out.println("Produto: " + nomeProduto + " | Valor Total: R$" + valorTotal);
			break;
		case 4:
			nomeProduto = "Bauru";
			valorProduto = 12.00;
			valorTotal = quantidadeProduto * valorProduto;
			System.out.println("Produto: " + nomeProduto + " | Valor Total: R$" + valorTotal);
			break;
		case 5:
			nomeProduto = "Refrigerante";
			valorProduto = 8.00;
			valorTotal = quantidadeProduto * valorProduto;
			System.out.println("Produto: " + nomeProduto + " | Valor Total: R$" + valorTotal);
			break;
		case 6:
			nomeProduto = "Suco de Laranja";
			valorProduto = 13.00;
			valorTotal = quantidadeProduto * valorProduto;
			System.out.println("Produto: " + nomeProduto + " | Valor Total: R$" + valorTotal);
			break;
		default:
			System.out.println("Opção Inválida!");
		}

		System.out.println();

		// Exercicio 06

		String nomeColaborador, nomeCargo;
		double novoSalario, salario, reajuste;
		int opcaoCargo;

		System.out.println("Código do Cargo  \t| Cargo           \t| Percentual do Reajuste (%)");
		System.out.println("1                \t| Gerente         \t| 10%");
		System.out.println("2                \t| Vendedor        \t| 7%");
		System.out.println("3                \t| Supervisor      \t| 9%");
		System.out.println("4                \t| Motorista       \t| 6%");
		System.out.println("5                \t| Estoquista      \t| 5%");
		System.out.println("6                \t| Técnico de TI   \t| 8%");
		System.out.print("\nCódigo do Cargo: ");
		opcaoCargo = scan.nextInt();
		System.out.print("Nome do colaborador: ");
		nomeColaborador = scan.next();

		switch (opcaoCargo) {
		case 1:
			nomeCargo = "Gerente";
			salario = 10000;
			reajuste = 0.1;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("Nome do colaborador: %s | Cargo: %s | Salário: R$%.2f", nomeColaborador, nomeCargo,
					novoSalario);
			break;
		case 2:
			nomeCargo = "Vendedor";
			salario = 2500;
			reajuste = 0.07;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("Nome do colaborador: %s | Cargo: %s | Salário: R$%.2f", nomeColaborador, nomeCargo,
					novoSalario);
			break;
		case 3:
			nomeCargo = "Supervisor";
			salario = 3500;
			reajuste = 0.09;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("Nome do colaborador: %s | Cargo: %s | Salário: R$%.2f", nomeColaborador, nomeCargo,
					novoSalario);
			break;
		case 4:
			nomeCargo = "Motorista";
			salario = 3000;
			reajuste = 0.06;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("Nome do colaborador: %s | Cargo: %s | Salário: R$%.2f", nomeColaborador, nomeCargo,
					novoSalario);
			break;
		case 5:
			nomeCargo = "Estoquista";
			salario = 2000;
			reajuste = 0.05;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("Nome do colaborador: %s | Cargo: %s | Salário: R$%.2f", nomeColaborador, nomeCargo,
					novoSalario);
			break;
		case 6:
			nomeCargo = "Técnico de TI";
			salario = 5000;
			reajuste = 0.08;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("Nome do colaborador: %s | Cargo: %s | Salário: R$%.2f", nomeColaborador, nomeCargo,
					novoSalario);
		default:
			System.out.println("Opção Inválida!");
		}
		System.out.println();
		System.out.println();

		// Exercicio 07

		float numero1, numero2, soma, subtracao, multiplicacao, divisao;
		int opcaoOperacao;

		System.out.println("Código     \tOperacao");
		System.out.println("1          \tSoma");
		System.out.println("2          \tSubtracao");
		System.out.println("3          \tMultiplicacao");
		System.out.println("4          \tDivisao");
		System.out.print("\nDigite o 1º numero: ");
		numero1 = scan.nextFloat();
		System.out.print("Digite o 2º numero: ");
		numero2 = scan.nextFloat();
		System.out.print("\nCódigo da Operação: ");
		opcaoOperacao = scan.nextInt();

		switch (opcaoOperacao) {
		case 1:
			soma = numero1 + numero2;
			System.out.printf("%.1f + %.1f = %.1f", numero1, numero2, soma);
			break;
		case 2:
			subtracao = numero1 - numero2;
			System.out.printf("%.1f - %.1f = %.1f", numero1, numero2, subtracao);
			break;
		case 3:
			multiplicacao = numero1 * numero2;
			System.out.printf("%.1f x %.1f = %.1f", numero1, numero2, multiplicacao);
			break;
		case 4:
			divisao = numero1 / numero2;
			System.out.printf("%.1f / %.1f = %.1f", numero1, numero2, divisao);
			break;
		default:
			System.out.println("Operação Inválida!");
		}

		System.out.println();
		System.out.println();

		// Exercicio 08

		int opcaoBancaria;
		float saldo = 1000;
		float saque, deposito, valor;

		System.out.println("Código     \tOperacao");
		System.out.println("1          \tSaldo");
		System.out.println("2          \tSaque");
		System.out.println("3          \tDepósito");
		System.out.print("\nOperação Bancária: ");
		opcaoBancaria = scan.nextInt();

		switch (opcaoBancaria) {
		case 1:
			System.out.printf("Operação Saldo | Saldo: R$%.2f", saldo);
			break;
		case 2:
			System.out.print("Valor do Saque: R$");
			valor = scan.nextFloat();
			saque = saldo - valor;
			if (valor > saldo) {
				System.out.println("Operação Saque | Saldo Insuficiente!");
			} else {
				System.out.printf("Operação Saque | Saldo: R$%.2f", saque);
			}
			break;
		case 3:
			System.out.print("Valor do Depósito: R$");
			valor = scan.nextFloat();
			deposito = saldo + valor;
			System.out.printf("Operação Depósito | Saldo: R$%.2f", deposito);
			break;
		default:
			System.out.println("Operação Inválida!");
		}

		scan.close();

	}

}
