//Exibir os números pares entre 2 e 50.
import java.util.Scanner;

public class Exercicio9{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Os números pares entre 2 e 50 são:");
        input.close();
        for (int i = 2; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}