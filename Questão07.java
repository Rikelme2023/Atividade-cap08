import java.util.Scanner;
public class Questão07 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número real " + (i + 1) + ": ");
            numeros[i] = ent.nextDouble();
        }

        int quantidadeNegativos = 0;
        double somaPositivos = 0;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 0) {
                quantidadeNegativos++;
            } else {
                somaPositivos += numeros[i];
            }
        }

        // Exibindo os resultados
        System.out.println("Quantidade de números negativos: " + quantidadeNegativos);
        System.out.println("Soma dos números positivos: " + somaPositivos);

        ent.close();
    }
}  
