/* Escrever um programa que receba dois números e ao final mostre a soma, subtração, 
multiplicação e a divisão dos números lidos. */
import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double valorUm = input.nextDouble();
        System.out.println("Digite o segundo valor:");
        double valorDois = input.nextDouble();

        double soma = valorUm + valorDois;
        double subtracao = valorUm - valorDois;
        double multiplicacao = valorUm * valorDois;
        double divisao = valorUm / valorDois;

        System.out.println("Operações realizadas com os valores informados:");
        System.out.println("Adição: " + soma + "\nSubtração: " + subtracao + 
        "\nMultiplicação: " + multiplicacao + "\nDivisão: " + divisao);
    }
}