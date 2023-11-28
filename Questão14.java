import java.util.Scanner;
public class Questão14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo os vetores para armazenar os nomes e as notas dos alunos
        String[] nomesAlunos = new String[6];
        double[] notasProva1 = new double[6];
        double[] notasProva2 = new double[6];
        double[] medias = new double[6];
        String[] situacoes = new String[6];

        // Recebendo o nome e as notas de cada aluno
        for (int i = 0; i < 6; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "º aluno: ");
            nomesAlunos[i] = scanner.nextLine();

            System.out.print("Informe a nota da prova 1 do " + nomesAlunos[i] + ": ");
            notasProva1[i] = scanner.nextDouble();

            System.out.print("Informe a nota da prova 2 do " + nomesAlunos[i] + ": ");
            notasProva2[i] = scanner.nextDouble();
            scanner.nextLine();

            medias[i] = calcularMedia(notasProva1[i], notasProva2[i]);
            situacoes[i] = calcularSituacao(medias[i]);
        }

        System.out.println("Relatório de Notas:");
        System.out.println("ALUNO\tPROVA 1\tPROVA 2\tMÉDIA\tSITUAÇÃO");

        for (int i = 0; i < 6; i++) {
            System.out.printf("%s\t%.1f\t%.1f\t%.1f\t%s%n",
                    nomesAlunos[i], notasProva1[i], notasProva2[i], medias[i], situacoes[i]);
        }

        double mediaClasse = calcularMediaClasse(medias);
        double percentualAprovados = calcularPercentualAprovados(situacoes);
        double percentualExame = calcularPercentualExame(situacoes);
        double percentualReprovados = calcularPercentualReprovados(situacoes);

        System.out.println("\nMédia da classe = " + mediaClasse);
        System.out.println("Percentual de alunos aprovados = " + percentualAprovados + "%");
        System.out.println("Percentual de alunos de exame = " + percentualExame + "%");
        System.out.println("Percentual de alunos reprovados = " + percentualReprovados + "%");

        scanner.close();
    }

    private static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    private static String calcularSituacao(double media) {
        return media >= 7.0 ? "Aprovado" : (media >= 4.0 ? "Exame" : "Reprovado");
    }

    private static double calcularMediaClasse(double[] medias) {
        double soma = 0;

        for (double media : medias) {
            soma += media;
        }

        return soma / medias.length;
    }


    private static double calcularPercentualAprovados(String[] situacoes) {
        int aprovados = contarSituacoes(situacoes, "Aprovado");
        return ((double) aprovados / situacoes.length) * 100;
    }

    private static double calcularPercentualExame(String[] situacoes) {
        int exame = contarSituacoes(situacoes, "Exame");
        return ((double) exame / situacoes.length) * 100;
    }
   private static double calcularPercentualReprovados(String[] situacoes) {
        int reprovados = contarSituacoes(situacoes, "Reprovado");
        return ((double) reprovados / situacoes.length) * 100;
    }

    private static int contarSituacoes(String[] situacoes, String situacao) {
        int contador = 0;

        for (String s : situacoes) {
            if (s.equals(situacao)) {
                contador++;
            }
        }

        return contador;
    }
}

