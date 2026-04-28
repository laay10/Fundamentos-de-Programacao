/* Escrever um programa em que leia dois valores para as variáveis A e B, e efetuar as trocas 
dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B 
passe a possuir o valor da variável A. Apresentar os valores trocados. */
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite alguma coisa:");
        String a = input.nextLine();
        System.out.println("Digite outra coisa:");
        String b = input.nextLine();

        System.out.println("A = " + a + " B = " + b);
        
        String novaA = b;
        String novaB = a;

        System.out.println("Agora: \nA = " + novaA + " B = " + novaB);
    }
}