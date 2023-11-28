import java.util.Scanner;

public class Questão21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o vetor original e o vetor modificado
        int[] vetorOriginal = new int[10];
        int[] vetorModificado = new int[10];

        // Preenchendo o vetor original
        System.out.println("Digite dez números inteiros (pode incluir zeros):");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetorOriginal[i] = scanner.nextInt();
        }

        // Criando o vetor modificado, substituindo os valores nulos por 1
        for (int i = 0; i < 10; i++) {
            if (vetorOriginal[i] == 0) {
                vetorModificado[i] = 1;
            } else {
                vetorModificado[i] = vetorOriginal[i];
            }
        }

        // Exibindo os dois vetores
        System.out.println("\nVetor Original:");
        exibirVetor(vetorOriginal);

        System.out.println("\nVetor Modificado (substituindo nulos por 1):");
        exibirVetor(vetorModificado);

        scanner.close();
    }

    // Método para exibir os elementos de um vetor
    private static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}

