import java.util.Scanner;

public class Questão19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo os vetores
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorResultado = new int[10];

        // Preenchendo o primeiro vetor
        System.out.println("Digite os elementos do primeiro vetor:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        // Preenchendo o segundo vetor
        System.out.println("\nDigite os elementos do segundo vetor:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Multiplicando os elementos de mesmo índice e armazenando no vetor resultado
        for (int i = 0; i < 10; i++) {
            vetorResultado[i] = vetor1[i] * vetor2[i];
        }

        // Exibindo o vetor resultado
        System.out.println("\nVetor Resultado da Multiplicação:");

        for (int i = 0; i < 10; i++) {
            System.out.print(vetorResultado[i] + " ");
        }

        scanner.close();
    }
}

