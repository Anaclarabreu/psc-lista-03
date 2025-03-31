import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double total = 0;

        do {
            System.out.println("----------- Menu -----------");
            System.out.println("1. Salgadinho - R$ 5,00");
            System.out.println("2. Doces - R$ 3,00");
            System.out.println("3. Suco - R$ 4,00");
            System.out.println("4. Refrigerante - R$ 5,50");
            System.out.println("5. Finalizar compra");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    total += 5.00;
                    System.out.println("Salgadinho adicionado ao carrinho.");
                    break;
                case 2:
                    total += 3.00;
                    System.out.println("Doces adicionados ao carrinho.");
                    break;
                case 3:
                    total += 4.00;
                    System.out.println("Suco adicionado ao carrinho.");
                    break;
                case 4:
                    total += 5.50;
                    System.out.println("Refrigerante adicionado ao carrinho.");
                    break;
                case 5:
                    System.out.printf("Total da compra: R$ %.2f%n", total);
                    System.out.println("Compra finalizada.");
                    opcao = 6; 
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);
        int[] notas = {50, 20, 10, 5, 2, 1};
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
        double valorPago = scanner.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("Quantia paga insuficiente para realizar a compra.");
        } else {
            
            int troco = (int) Math.round(valorPago - valorCompra);
            System.out.println("Troco a ser devolvido: R$ " + troco);

            System.out.println("Notas fornecidas como troco:");
            for (int nota : notas) {
                int quantidadeNotas = troco / nota;
                if (quantidadeNotas > 0) {
                    System.out.println("R$ " + nota + ": " + quantidadeNotas);
                    troco %= nota;
                }
            }
        }

        scanner.close();
    }

    
}
