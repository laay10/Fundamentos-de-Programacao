/* Escrever um programa para ler dois valores (enquanto o segundo valor informado for 
ZERO, deve ser lido um novo valor) e imprimir o resultado da divisão primeiro pelo 
segundo. */
import java.util.Scanner;

public class Exercicio5{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        double valorUm = input.nextDouble();
        double valorDois;
        do {
            System.out.println("Digite o segundo valor (diferente de zero):");
            valorDois = input.nextDouble();
            if (valorDois == 0) {
                System.out.println("O segundo value não pode ser zero. Por favor, tente novamente.");
            }
        } while (valorDois == 0);
        double resultado = valorUm / valorDois;
        System.out.println("O resultado da divisão é: " + resultado);
        input.close();
    }
}