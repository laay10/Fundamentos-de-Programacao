/* Escrever um programa que leia o ano de nascimento de uma pessoa. Escrever a sua idade. Considere para 
o cálculo o ano atual. */
import java.util.Scanner;

public class Exercicio4{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = input.nextInt();
        int anoAtual = 2026; // Você pode usar a classe Calendar para obter o ano atual dinamicamente
        int idade = anoAtual - anoNascimento;
        System.out.println("A idade da pessoa é: " + idade);
        input.close();
    }
}