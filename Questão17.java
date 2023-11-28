import java.util.Arrays;
public class Questão17 {
    public static void main(String[] args) {
        // Definindo os vetores
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorMergedSorted = new int[20];
        preencherVetor(vetor1, "Vetor 1");
        preencherVetor(vetor2, "Vetor 2");

        mesclarVetores(vetor1, vetor2, vetorMergedSorted);

        Arrays.sort(vetorMergedSorted);
        inverterVetor(vetorMergedSorted);

        System.out.println("Vetor Mesclado e Ordenado Decrescente:");
        exibirVetor(vetorMergedSorted);
    }

    private static void preencherVetor(int[] vetor, String nomeVetor) {
        System.out.println("Preencha o " + nomeVetor + " com valores inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;  // Exemplo: Preenche com valores de 1 a 10
        }
    }

    private static void mesclarVetores(int[] vetor1, int[] vetor2, int[] vetorMerged) {
        int indiceVetorMerged = 0;

        for (int i = 0; i < vetor1.length; i++) {
            vetorMerged[indiceVetorMerged++] = vetor1[i];
        }

        for (int i = 0; i < vetor2.length; i++) {
            vetorMerged[indiceVetorMerged++] = vetor2[i];
        }
    }

    private static void inverterVetor(int[] vetor) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio < fim) {
            int temp = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = temp;

            inicio++;
            fim--;
        }
    }

    private static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}

