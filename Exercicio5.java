import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos números reais e do operador
        System.out.print("Informe o primeiro número real: ");
        double num1 = scanner.nextDouble();

        System.out.print("Informe o segundo número real: ");
        double num2 = scanner.nextDouble();

        System.out.print("Informe o símbolo da operação (+, -, *, /, ^): ");
        char operador = scanner.next().charAt(0);

        // Variável para armazenar o resultado
        double resultado = 0;
        boolean operacaoValida = true; // Flag para verificar a validade da operação

        // Realizando a operação com base no operador informado
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero.");
                    operacaoValida = false;
                } else {
                    resultado = num1 / num2;
                }
                break;
            case '^':
                resultado = Math.pow(num1, num2); // Potência
                break;
            default:
                System.out.println("Erro: Símbolo de operação inválido.");
                operacaoValida = false;
        }

        // Se a operação for válida, exibe o resultado
        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
