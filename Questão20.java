import java.util.Scanner;

public class Questão20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o vetor
        int[] vetor = new int[10];

        // Preenchendo o vetor
        System.out.println("Digite dez números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Exibindo apenas os números positivos
        System.out.println("\nNúmeros Positivos:");

        for (int i = 0; i < 10; i++) {
            if (vetor[i] > 0) {
                System.out.print(vetor[i] + " ");
            }
        }

        scanner.close();
    }
}

