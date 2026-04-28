/* Faça um programa que determine qual é a idade que o usuário faz no ano atual. */
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int anoAtual = 2026;

        System.out.println("Digite o ano que você nasceu:");
        int ano = input.nextInt();

        int idade = anoAtual - ano;
        System.out.println("O usuário fará esse ano: " + idade + " anos");
    }
}