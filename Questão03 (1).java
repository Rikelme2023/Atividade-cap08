import java.util.Random;
import java.util.Scanner;

public class Questão03{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        Random aleatorio = new Random();
        int codigo[];
        int total[];
        codigo = new int[10];
        total = new int[10];
        boolean existe = false;
        int codPro = 0;

        int cliente = 0, produto = 0, quantidade = 0;

        for(int i = 0; i <= 9; i++){
            codigo[i] = aleatorio.nextInt(1000) + 1;
            total[i] = aleatorio.nextInt(1000) + 1;
        }

        do {
            System.out.print("Insira código do cliente: ");
            cliente = entrada.nextInt();
            if (cliente > 0) {
                // Exibe os números gerados
                System.out.println("Códigos dos produtos: ");
                for (int i = 0; i <= 9; i++) {
                    System.out.println(codigo[i]);
                }
                System.out.print("Insira código do produto: ");
                produto = entrada.nextInt();
                for (int i = 0; i < total.length; i++) {
                    if (produto == codigo[i]) {
                        existe = true;
                        codPro = i;                        
                    }
                }
                    if (existe){
                        System.out.println("Quantidade dos produtos: ");
                        System.out.println(total[codPro]);
                        System.out.print("Insira quantidade desejada: ");
                        quantidade = entrada.nextInt();
                        if (quantidade <= total[codPro]) {
                            System.out.println("Pedido atendido. Obrigado e volte sempre!");
                            total[codPro] -= quantidade;
                        } else {
                            System.out.println("Não temos estoque suficiente dessa mercadoria.");
                        }                              
                } else {
                    System.out.println("Código inexistente");
                }

            }
        } while (cliente > 0);

        for (int i = 0; i <= 9; i++) {
            System.out.println("Código: " + codigo[i] + " - Total: " + total[i]);           
        }
        entrada.close();
    }
}
      