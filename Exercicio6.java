import java.util.Scanner;
import java.util.Random;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Leitura dos dois números inteiros
        System.out.print("Informe o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Informe o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        // Determinando o menor e o maior número
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        // Sorteando um número aleatório entre os dois números informados
        int sorteio = random.nextInt(maior - menor + 1) + menor;

        // Verificando se o número sorteado é par ou ímpar
        if (sorteio % 2 == 0) {
            System.out.println("Número sorteado: " + sorteio);
            System.out.println("O número sorteado é PAR.");
        } else {
            System.out.println("Número sorteado: " + sorteio);
            System.out.println("O número sorteado é ÍMPAR.");
        }

        scanner.close();
    }
}
