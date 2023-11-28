import java.util.Random;
public class Questão02 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        Random aleatorio = new Random();
        int num[];
        num = new int[7];

        System.out.println("Números gerados: ");
        for(int i = 0; i <= 6; i++){
            num[i] = aleatorio.nextInt();
        }

        for(int i = 0; i <= 6; i++){
            System.out.println(num[i]);
        }

        System.out.println("Os números mútlipos de 2");
        for(int i = 0; i < 7; i++){
            if(num[i]%2 == 0){
                System.out.println(num[i]);
            }
        }

        System.out.println("Os números mútlipos de 3");
        for(int i = 0; i < 7; i++){
            if(num[i]%3 == 0){
                System.out.println(num[i]);
            }
        }

        System.out.println("Os números mútlipos de 2 e 3");
        for(int i = 0; i < 7; i++){
            if(num[i]% 2 == 0 && (num[i]%3 == 0)){
                System.out.println(num[i]);
            }
        } 
    }
}
