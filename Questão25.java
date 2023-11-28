import java.util.Scanner;

public class Questão25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o vetor
        int[] vetor = new int[15];

        // Preenchendo o vetor
        System.out.println("Digite quinze números inteiros:");

        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Encontrando o maior valor do vetor
        int maiorValor = encontrarMaiorValor(vetor);

        // Dividindo todos os elementos pelo maior valor
        for (int i = 0; i < 15; i++) {
            vetor[i] /= maiorValor;
        }

        // Mostrando o vetor após os cálculos
        System.out.println("\nVetor após a divisão pelo maior valor:");
        exibirVetor(vetor);

        scanner.close();
    }

    // Método para encontrar o maior valor de um vetor
    private static int encontrarMaiorValor(int[] vetor) {
        int maiorValor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
        }

        return maiorValor;
    }

    // Método para exibir os elementos de um vetor
    private static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}

