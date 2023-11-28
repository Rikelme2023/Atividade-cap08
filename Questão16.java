import java.util.Scanner;
public class Questão16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomesProdutos = new String[5];
        double[] precosProdutos = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome do produto " + (i + 1) + ": ");
            nomesProdutos[i] = scanner.nextLine();

            System.out.print("Informe o preço do produto " + (i + 1) + ": R$");
            precosProdutos[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        int quantidadeProdutosInferior50 = 0;
        System.out.print("\nProdutos com preço inferior a R$ 50,00: ");
        for (int i = 0; i < 5; i++) {
            if (precosProdutos[i] < 50.0) {
                quantidadeProdutosInferior50++;
                System.out.print(nomesProdutos[i] + ", ");
            }
        }

        System.out.println("\n\nProdutos com preço entre R$ 50,00 e R$ 100,00: ");
        for (int i = 0; i < 5; i++) {
            if (precosProdutos[i] >= 50.0 && precosProdutos[i] <= 100.0) {
                System.out.println(nomesProdutos[i]);
            }
        }

        double somaPrecosSuperior100 = 0;
        int quantidadeProdutosSuperior100 = 0;
        for (int i = 0; i < 5; i++) {
            if (precosProdutos[i] > 100.0) {
                somaPrecosSuperior100 += precosProdutos[i];
                quantidadeProdutosSuperior100++;
            }
        }

        System.out.println("\nMédia dos preços dos produtos com preço superior a R$ 100,00: ");
        if (quantidadeProdutosSuperior100 > 0) {
            double mediaPrecosSuperior100 = somaPrecosSuperior100 / quantidadeProdutosSuperior100;
            System.out.printf("%.2f%n", mediaPrecosSuperior100);
        } else {
            System.out.println("Nenhum produto com preço superior a R$ 100,00.");
        }

        scanner.close();
    }
}

