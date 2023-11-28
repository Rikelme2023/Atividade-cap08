import java.util.Scanner;
public class Questão10 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];

        System.out.println("o primeiro vetor com dez números inteiros: ");
        preencherVetor(vetor1, ent);

        System.out.println("o segundo vetor com cinco números inteiros: ");
        preencherVetor(vetor2, ent);

        int[] vetorSomaPar = calcularVetorSomaPar(vetor1, vetor2);
        int[] vetorDivisoresImpar = calcularVetorDivisoresImpar(vetor1, vetor2);

        System.out.println("Vetor Resultante Soma Par:");
        exibirVetor(vetorSomaPar);

        System.out.println("Vetor Resultante Divisores Ímpar:");
        exibirVetor(vetorDivisoresImpar);

        ent.close();
    }

    private static void preencherVetor(int[] vetor, Scanner scanner) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o número inteiro " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    private static int[] calcularVetorSomaPar(int[] vetor1, int[] vetor2) {
        int[] resultado = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 == 0) {
                for (int j = 0; j < vetor2.length; j++) {
                    resultado[i] += vetor1[i] + vetor2[j];
                }
            }
        }

        return resultado;
    }

    private static int[] calcularVetorDivisoresImpar(int[] vetor1, int[] vetor2) {
        int[] resultado = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 != 0) {
                for (int j = 0; j < vetor2.length; j++) {
                    if (vetor2[j] != 0 && vetor1[i] % vetor2[j] == 0) {
                        resultado[i]++;
                    }
                }
            }
        }

        return resultado;
    }

    private static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}

