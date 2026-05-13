//Exibir os números múltiplos de 3 entre 3 e 40.
import java.util.Scanner;

public class Exercicio7{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Os números múltiplos de 3 entre 3 e 40 são:");
        input.close();
        for (int i = 3; i <= 40; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}