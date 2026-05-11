/* Escreva um programa que recebe uma frase e um caractere e infroma: (a) em qual posição o caractere aparece a primeira vez. (b) em qual posição o caractere aparece a última. Caso ele não exista na frase, moste mensagem inadequada */
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();
        System.out.print("Digite um caractere: ");
        char caractere = input.nextLine().charAt(0);
        int primeiraPosicao = frase.indexOf(caractere);
        int ultimaPosicao = frase.lastIndexOf(caractere);
        if (primeiraPosicao != -1) {
            System.out.println("O caractere '" + caractere + "' aparece pela primeira vez na posição: " + primeiraPosicao);
            System.out.println("O caractere '" + caractere + "' aparece pela última vez na posição: " + ultimaPosicao);
        } else {
            System.out.println("O caractere '" + caractere + "' não existe na frase.");
        }
    }
}