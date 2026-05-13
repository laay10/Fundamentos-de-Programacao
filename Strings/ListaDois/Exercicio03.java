/* Escreva um programa que leia tres nomes e os apresente em ordem alfabética */
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o nome 1: ");
        String nome1 = input.nextLine();
        System.out.print("Digite o nome 2: ");
        String nome2 = input.nextLine();
        System.out.print("Digite o nome 3: ");
        String nome3 = input.nextLine();
        
        // Ordenar os nomes em ordem alfabética sem usar array
        // Usar bubble sort adaptado para três variáveis
        if (nome1.compareTo(nome2) > 0) {
            String temp = nome1;
            nome1 = nome2;
            nome2 = temp;
        }
        if (nome2.compareTo(nome3) > 0) {
            String temp = nome2;
            nome2 = nome3;
            nome3 = temp;
        }
        if (nome1.compareTo(nome2) > 0) {
            String temp = nome1;
            nome1 = nome2;
            nome2 = temp;
        }
        
        // Apresentar os nomes em ordem alfabética
        System.out.println("Nomes em ordem alfabética:");
        System.out.println(nome1);
        System.out.println(nome2);
        System.out.println(nome3);
    }
}