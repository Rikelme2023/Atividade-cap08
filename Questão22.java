import java.util.Scanner;

public class Questão22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o vetor A e o vetor B
        int[] vetorA = new int[10];
        int[] vetorB;

        // Preenchendo o vetor A
        System.out.println("Digite dez números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        // Compactando o vetor A, retirando os valores nulos e negativos
        vetorB = compactarVetor(vetorA);

        // Exibindo o vetor B
        System.out.println("\nVetor B (compactado):");
        exibirVetor(vetorB);

        scanner.close();
    }

    // Método para compactar um vetor, retirando os valores nulos e negativos
    private static int[] compactarVetor(int[] vetor) {
        int contadorElementosPositivos = 0;

        // Contando a quantidade de elementos positivos
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                contadorElementosPositivos++;
            }
        }

        // Criando um novo vetor B com o tamanho adequado
        int[] vetorCompactado = new int[contadorElementosPositivos];
        int indiceVetorCompactado = 0;

        // Preenchendo o vetor B com os valores positivos
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                vetorCompactado[indiceVetorCompactado++] = vetor[i];
            }
        }

        return vetorCompactado;
    }

    // Método para exibir os elementos de um vetor
    private static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}

