import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos coeficientes a, b e c
        System.out.print("Informe o coeficiente a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Informe o coeficiente b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Informe o coeficiente c: ");
        double c = scanner.nextDouble();
        
        // Verificação de consistência dos coeficientes
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            // Equação de primeiro grau
            double raiz = -c / b;
            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.println("A raiz real é: " + raiz);
        } else {
            // Equação de segundo grau
            double delta = b * b - 4 * a * c; // Cálculo do discriminante (delta)

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                // Raízes reais iguais
                double raiz = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.println("As raízes são: " + raiz);
            } else {
                // Raízes reais diferentes
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.println("As raízes são: " + raiz1 + " e " + raiz2);
            }
        }
        
        scanner.close();
    }
}
