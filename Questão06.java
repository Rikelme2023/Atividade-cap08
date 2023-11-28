import java.util.Scanner;
    public class Questão06 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String[] nomesVendedores = new String[10];
        double[] vendas = new double[10];
        double[] percentuaisComissao = new double[10];
        double[] valoresReceber = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o nome do vendedor " + (i + 1) + ": ");
            nomesVendedores[i] = ent.nextLine();

            System.out.print("Innforme o total das vendas do vendedor " + (i + 1) + ": ");
            vendas[i] = ent.nextDouble();

            System.out.print("Innforme o percentual de comissão do vendedor " + (i + 1) + ": ");
            percentuaisComissao[i] = ent.nextDouble();

            ent.nextLine();
        }
        double totalVendas = 0;
        double maiorValorReceber = Double.MIN_VALUE;
        double menorValorReceber = Double.MAX_VALUE;
        String nomeMaiorValor = "";
        String nomeMenorValor = "";

        for (int i = 0; i < 10; i++) {
            valoresReceber[i] = vendas[i] * (percentuaisComissao[i] / 100);
            totalVendas += vendas[i];

            if (valoresReceber[i] > maiorValorReceber) {
                maiorValorReceber = valoresReceber[i];
                nomeMaiorValor = nomesVendedores[i];
            }

            if (valoresReceber[i] < menorValorReceber) {
                menorValorReceber = valoresReceber[i];
                nomeMenorValor = nomesVendedores[i];
            }
        }

        System.out.println("Relatório:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Vendedor: " + nomesVendedores[i] +
                    " - Valor a receber: " + valoresReceber[i]);
        }

        System.out.println("Total das vendas de todos os vendedores : " + totalVendas);

        System.out.println("Maior valor a receber: " + maiorValorReceber +
                " - Vendedor: " + nomeMaiorValor);

        System.out.println("Menor valor a receber: " + menorValorReceber +
                " - Vendedor: " + nomeMenorValor);

        ent.close();
    }
}


