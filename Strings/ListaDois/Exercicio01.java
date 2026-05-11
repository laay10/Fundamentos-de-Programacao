/* Ler um nome e escrevê-lo na tela de forma vertical */
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = input.nextLine()
        ;
        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
    }
}