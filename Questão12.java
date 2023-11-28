import java.util.Scanner;
public class Questão12 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o " + (i + 1) + "º número: ");
            numeros[i] = ent.nextInt();
        }

        int soma = calcularSoma(numeros);

        System.out.print("Os números digitados foram: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i]);
            if (i < 4) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + soma);

        ent.close();
    }

    private static int calcularSoma(int[] vetor) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        return soma;
    }
}
