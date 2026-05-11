/* Escreva um programa que leia tres nomes e os apresente em ordem alfabética */
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[3];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = input.nextLine();
        }
        // Ordenar os nomes em ordem alfabética
        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = 0; j < nomes.length - i - 1; j++) {
                if (nomes[j].compareTo(nomes[j + 1]) > 0) {
                    // Trocar os nomes
                    String temp = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = temp;
                }
            }
        }
        // Apresentar os nomes em ordem alfabética
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}