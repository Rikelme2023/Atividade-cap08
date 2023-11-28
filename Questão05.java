import java.util.Scanner;
import java.util.HashSet;

public class Questão05 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int[] matriculasLogica = new int[15];
        int[] matriculasLinguagem = new int[10];

  
        System.out.println("Informe as matrículas de Lógica :");
        preencherMatriculas(matriculasLogica, ent);

        System.out.println("Informe as matrículas de Linguagem de Programação :");
        preencherMatriculas(matriculasLinguagem, ent);

        HashSet<Integer> matriculasComuns = encontrarMatriculasComuns(matriculasLogica, matriculasLinguagem);

        System.out.println("Matrículas dos alunos que cursam ambos curso :");
        for (int matricula : matriculasComuns) {
            System.out.println(matricula);
        }
        ent.close();
    }

    private static void preencherMatriculas(int[] matriculas, Scanner scanner) {
        for (int i = 0; i < matriculas.length; i++) {
            System.out.print("Digite a matrícula do aluno " + (i + 1) + ": ");
            matriculas[i] = scanner.nextInt();
        }
    }

    private static HashSet<Integer> encontrarMatriculasComuns(int[] vetor1, int[] vetor2) {
        HashSet<Integer> conjuntoVetor1 = new HashSet<>();
        HashSet<Integer> matriculasComuns = new HashSet<>();

        for (int matricula : vetor1) {
            conjuntoVetor1.add(matricula);
        }

        for (int matricula : vetor2) {
            if (conjuntoVetor1.contains(matricula)) {
                matriculasComuns.add(matricula);
            }
        }

        return matriculasComuns;
    }
}
