/*Faça um algoritmo que leia um nº inteiro e mostre uma mensagem indicando se este 
número é par ou ímpar, e se é positivo ou negativo. */
import java.util.Scanner;

public class Exercicio6{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        input.close();
         if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}