/* Faça um programa que solicita ao usuário a inserção de números inteiros positivos e os exibe as suas
somas. O usuário pode continuar adicionando números até decidir parar. Para a resolução desse 
exercício, use apenas o comando “do while”. */
import java.util.Scanner;

public class Exercicio1{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int soma = 0;
        char resposta;
        do {
            System.out.print("Digite um número inteiro positivo: ");
            int numero = input.nextInt();
            if (numero > 0) {
                soma += numero;
            } else {
                System.out.println("Número inválido. Por favor, digite um número inteiro positivo.");
            }
            System.out.print("Deseja continuar? (s/n): ");
            resposta = input.next().charAt(0);
        } while (resposta == 's' || resposta == 'S');
        System.out.println("A soma dos números positivos é: " + soma);
        input.close();
    }
}