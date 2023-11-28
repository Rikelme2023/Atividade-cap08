import java.util.Scanner;

public class Questão23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo os vetores A e B
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        // Preenchendo os vetores A e B
        preencherVetor(vetorA, "A");
        preencherVetor(vetorB, "B");

        // Realizando as subtrações acumuladas
        int resultadoAcumulado = 0;

        for (int i = 0; i < 5; i++) {
            int indiceA = i;
            int indiceB = 4 - i;
            int subtracao = vetorA[indiceA] - vetorB[indiceB];
            resultadoAcumulado += subtracao;
            System.out.println("Subtração " + (i + 1) + ": " + subtracao);
        }

        // Mostrando o resultado acumulado
        System.out.println("\nResultado Acumulado: " + resultadoAcumulado);

        scanner.close();
    }

    // Método para preencher um vetor com valores inteiros
    private static void preencherVetor(int[] vetor, String nomeVetor) {
        System.out.println("Digite os elementos do vetor " + nomeVetor + ":");

        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
    }
}

