import java.util.Scanner;

public class Questão18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o vetor
        int[] numeros = new int[15];

        // Preenchendo o vetor com quinze números inteiros
        System.out.println("Digite quinze números inteiros:");

        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Calculando e mostrando o maior número e sua posição
        int indiceMaior = encontrarIndiceMaior(numeros);
        System.out.println("O maior número é: " + numeros[indiceMaior] +
                " e está na posição: " + indiceMaior);

        // Calculando e mostrando o menor número e sua posição
        int indiceMenor = encontrarIndiceMenor(numeros);
        System.out.println("O menor número é: " + numeros[indiceMenor] +
                " e está na posição: " + indiceMenor);

        scanner.close();
    }

    // Método para encontrar o índice do maior número no vetor
    private static int encontrarIndiceMaior(int[] vetor) {
        int indiceMaior = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        return indiceMaior;
    }

    // Método para encontrar o índice do menor número no vetor
    private static int encontrarIndiceMenor(int[] vetor) {
        int indiceMenor = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < vetor[indiceMenor]) {
                indiceMenor = i;
            }
        }

        return indiceMenor;
    }
}

