/* Implemente um programa em Java que leia um valor n e escreva todos os quadrados perfeitos menores 
que n. Exemplo : n=100 escreve 1, 4, 9, 16, 25, 36, 49, 64, 81. */
import java.util.Scanner;

public class Exercicio7{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor n para encontrar os quadrados perfeitos menores que n: ");
        int n = input.nextInt();
        System.out.println("Os quadrados perfeitos menores que " + n + " são:");
        for (int i = 1; i * i < n; i++) {
            int quadradoPerfeito = i * i;
            System.out.println(quadradoPerfeito);
        }
        input.close();
    }
}