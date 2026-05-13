/* Faça um programa que calcule os 100 primeiros quadrados perfeitos (números naturais):
1, 4, 9 ,16. */
import java.util.Scanner;

public class Exercicio2{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Os 100 primeiros quadrados perfeitos são:");
        for (int i = 1; i <= 100; i++) {
            int quadradoPerfeito = i * i;
            System.out.println(quadradoPerfeito);
        }
        input.close();
    }
}