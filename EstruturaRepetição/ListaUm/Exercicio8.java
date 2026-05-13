/* Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever o múltiplo do valor 
lido. */
import java.util.Scanner;

public class Exercicio8{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int valor;
        do {
            System.out.print("Digite um valor inteiro entre 1 e 10: ");
            valor = input.nextInt();
            if (valor < 1 || valor > 10) {
                System.out.println("Valor inválido. Por favor, tente novamente.");
            }
        } while (valor < 1 || valor > 10);
        System.out.println("O múltiplo de " + valor + " é: " + (valor * 2));
        input.close();
    }
}