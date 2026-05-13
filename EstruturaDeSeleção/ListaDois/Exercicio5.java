/* Escreva um programa que recebe um valor como entrada e exibe o seu quadrado quando 
o número for par, e o seu cubo quando ele é ímpar. */
import java.util.Scanner;

public class Exercicio5{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();
        if (numero % 2 == 0) {
            int quadrado = numero * numero;
            System.out.println("O quadrado de " + numero + " é: " + quadrado);
        } else {
            int cubo = numero * numero * numero;
            System.out.println("O cubo de " + numero + " é: " + cubo);
        }
        input.close();
    }
}