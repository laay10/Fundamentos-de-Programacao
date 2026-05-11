/* Faça um programa que leia uma frase e que troque todas as vogais por maiusculas */
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();
        frase = frase.replace('a', 'A');
        frase = frase.replace('e', 'E');
        frase = frase.replace('i', 'I');
        frase = frase.replace('o', 'O');
        frase = frase.replace('u', 'U');
        System.out.println(frase);
    }
}