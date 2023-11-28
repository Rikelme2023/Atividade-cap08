import java.util.Scanner;
public class Questão08 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String[] nomesAlunos = new String[7];
        double[] mediasAlunos = new double[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Informme o nome do aluno " + (i + 1) + ": ");
            nomesAlunos[i] = ent.nextLine();

            System.out.print("Informe a média final do aluno " + (i + 1) + ": ");
            mediasAlunos[i] = ent.nextDouble();
            ent.nextLine(); 
        }

        int indiceMaiorMedia = encontrarIndiceMaiorMedia(mediasAlunos);
        System.out.println("O aluno com maior média é: " + nomesAlunos[indiceMaiorMedia]);

        for (int i = 0; i < 7; i++) {
            if (mediasAlunos[i] < 7.0) {
                double notaExameNecessaria = calcularNotaExameNecessaria(mediasAlunos[i]);
                System.out.println("O aluno " + nomesAlunos[i] + " precisa tirar " +
                        notaExameNecessaria + " na prova de exame para ser aprovado.");
            }
        }

        ent.close();
    }

    private static int encontrarIndiceMaiorMedia(double[] medias) {
        int indiceMaiorMedia = 0;
        for (int i = 1; i < medias.length; i++) {
            if (medias[i] > medias[indiceMaiorMedia]) {
                indiceMaiorMedia = i;
            }
        }
        return indiceMaiorMedia;
    }

    private static double calcularNotaExameNecessaria(double media) {
        return Math.max(5.0, (10.0 - media));
    }
}

