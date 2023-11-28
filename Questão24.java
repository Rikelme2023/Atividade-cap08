import java.util.Scanner;

public class Questão24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o vetor original e o vetor resultante
        int[] vetorOriginal = new int[15];
        int[] vetorResultante;

        // Preenchendo o vetor original
        System.out.println("Digite quinze números inteiros:");

        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetorOriginal[i] = scanner.nextInt();
        }

        // Filtrando os números primos e armazenando no vetor resultante
        vetorResultante = filtrarPrimos(vetorOriginal);

        // Exibindo o vetor resultante
        System.out.println("\nVetor Resultante (Números Primos):");
        exibirVetor(vetorResultante);

        scanner.close();
    }

    // Método para verificar se um número é primo
    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Método para filtrar os números primos de um vetor
    private static int[] filtrarPrimos(int[] vetor) {
        int contadorPrimos = 0;

        // Contando a quantidade de números primos
        for (int i = 0; i < vetor.length; i++) {
            if (ehPrimo(vetor[i])) {
                contadorPrimos++;
            }
        }

        // Criando um novo vetor resultante com o tamanho adequado
        int[] vetorResultante = new int[contadorPrimos];
        int indiceVetorResultante = 0;

        // Preenchendo o vetor resultante com os números primos
        for (int i = 0; i < vetor.length; i++) {
            if (ehPrimo(vetor[i])) {
                vetorResultante[indiceVetorResultante++] = vetor[i];
            }
        }

        return vetorResultante;
    }

    // Método para exibir os elementos de um vetor
    private static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}

