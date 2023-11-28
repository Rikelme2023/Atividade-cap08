import java.util.Scanner;
public class Questão11 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Informe dez números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = ent.nextInt();
        }

        int[] pares = calcularPares(numeros);
        int[] impares = calcularImpares(numeros);

        System.out.println("Vetor Resultante de Números Pares:");
        exibirVetor(pares);

        System.out.println("Vetor Resultante de Números Ímpares:");
        exibirVetor(impares);

        ent.close();
    }

    private static int[] calcularPares(int[] vetor) {
        int contadorPares = contarPares(vetor);
        int[] resultadoPares = new int[contadorPares];

        int indiceResultado = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                resultadoPares[indiceResultado] = vetor[i];
                indiceResultado++;
            }
        }

        return resultadoPares;
    }

    private static int[] calcularImpares(int[] vetor) {
        int contadorImpares = contarImpares(vetor);
        int[] resultadoImpares = new int[contadorImpares];

        int indiceResultado = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                resultadoImpares[indiceResultado] = vetor[i];
                indiceResultado++;
            }
        }

        return resultadoImpares;
    }

    private static int contarPares(int[] vetor) {
        int contadorPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                contadorPares++;
            }
        }

        return contadorPares;
    }

    private static int contarImpares(int[] vetor) {
        int contadorImpares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                contadorImpares++;
            }
        }

        return contadorImpares;
    }

    private static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
