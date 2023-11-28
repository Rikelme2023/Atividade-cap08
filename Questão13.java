import java.util.Scanner;
public class Questão13 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String[] nomesAlunos = new String[8];
        double[] notasAlunos = new double[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "º aluno: ");
            nomesAlunos[i] = ent.nextLine();

            System.out.print("Informe a nota do " + nomesAlunos[i] + ": ");
            notasAlunos[i] = ent.nextDouble();
            ent.nextLine(); 
        }

        System.out.println("Relatório de Notas:");
        for (int i = 0; i < 8; i++) {
            System.out.println(nomesAlunos[i] + " " + notasAlunos[i]);
        }

        double mediaClasse = calcularMedia(notasAlunos);
        System.out.println("\nMédia da classe = " + mediaClasse);

        ent.close();
    }

    private static double calcularMedia(double[] notas) {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }
}
