import java.util.Scanner;

public class Exercicio1{
    public static void main(String{} args){
        Scanner scanner = new Scanner(System.in);

        //Entrada de 3 numeros 
        System.out.print("Digite o primeiro numero: ");
        double num1= scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2= scanner.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double num3= scanner.nextDouble();

        //Encontrar o maior numero
        double maior = num1;
        if (num2 > maior) {
            maior = num2;
        }

        if (num3 > maior) {
            maior = num3;
        }

        // Encontrar o menor numero 
        double menor = num1;
        if (num2 < menor ) {  
            menor = num2;
        }

        if (num3 < menor) {
            menor = num3;
        }

        //Calcular media
        double media = (num1 + num2 + num3) / 3;

        //Exibir os resultados
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.println("Media numero: " + media);

        scanner.close();
    }
}
        
        


