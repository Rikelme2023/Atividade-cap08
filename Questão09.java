import java.util.Scanner;
public class Questão09 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String[] nomesProdutos = new String[10];
        int[] codigosProdutos = new int[10];
        double[] precosProdutos = new double[10];

        // Preenchendo os vetores com os nomes, códigos e preços dos produtos
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o nome do produto " + (i + 1) + ": ");
            nomesProdutos[i] = ent.nextLine();

            System.out.print("Innforme o código do produto " + (i + 1) + ": ");
            codigosProdutos[i] = ent.nextInt();

            System.out.print("Innforme o preço do produto " + (i + 1) + ": ");
            precosProdutos[i] = ent.nextDouble();

            ent.nextLine();
        }

        System.out.println("Relatório de Aumento de Produtos:");
        for (int i = 0; i < 10; i++) {
            double novoPreco = calcularNovoPreco(codigosProdutos[i], precosProdutos[i]);

            if (novoPreco > precosProdutos[i]) {
                System.out.println("Nome: " + nomesProdutos[i] +
                        ", Código: " + codigosProdutos[i] +
                        ", Preço Atual: R$" + precosProdutos[i] +
                        ", Novo Preço: R$" + novoPreco);
            }
        }

        ent.close();
    }

    private static double calcularNovoPreco(int codigo, double preco) {
        double aumento = 0;

        if (codigo % 2 == 0 && preco > 1000) {
            aumento = 0.20;
        } else if (codigo % 2 == 0) {
            aumento = 0.15;
        } else if (preco > 1000) {
            aumento = 0.10;
        }

        return preco * (1 + aumento);
    }
}

