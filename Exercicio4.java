import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao;
        double raio;

        // Lê a operação
        System.out.print("Digite o código da operação (1: Perímetro do círculo, 2: Área do círculo, 3: Volume da esfera): ");
        operacao = scanner.nextInt();

        // Lê o raio
        System.out.print("Digite o raio: ");
        raio = scanner.nextDouble();

        // Constante π
        final double PI = 3.143;

        // Realiza a operação com base no código informado
        switch (operacao) {
            case 1:
                // Cálculo do perímetro do círculo
                double perimetro = 2 * PI * raio;
                System.out.printf("Perímetro do círculo: %.2f%n", perimetro);
                break;
            case 2:
                // Cálculo da área do círculo
                double area = PI * Math.pow(raio, 2);
                System.out.printf("Área do círculo: %.2f%n", area);
                break;
            case 3:
                // Cálculo do volume da esfera
                double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);
                System.out.printf("Volume da esfera: %.2f%n", volume);
                break;
            default:
                // Mensagem de erro para código de operação inválido
                System.out.println("Código da operação inválido. Por favor, digite 1, 2 ou 3.");
        }

        // Fecha o scanner
        scanner.close();
    }
}

