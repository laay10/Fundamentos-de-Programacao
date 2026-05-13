/* Faça um programa que leia uma quantidade não determinada de números positivos. Calcule a quantidade 
de números pares e ímpares, a média de valores pares e a média geral dos números lidos. O número que 
encerrará a leitura será zero. */
import java.util.Scanner;

public class Exercicio4{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int somaPares = 0;
        int somaTotal = 0;
        int quantidadeTotal = 0;
        do {
            System.out.print("Digite um número positivo (ou 0 para encerrar): ");
            numero = input.nextInt();
            if (numero > 0) {
                quantidadeTotal++;
                somaTotal += numero;
                if (numero % 2 == 0) {
                    quantidadePares++;
                    somaPares += numero;
                } else {
                    quantidadeImpares++;
                }
            }
        } while (numero != 0);
        double mediaPares = quantidadePares > 0 ? (double) somaPares / quantidadePares : 0;
        double mediaGeral = quantidadeTotal > 0 ? (double) somaTotal / quantidadeTotal : 0;
        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
        System.out.println("Média dos valores pares: " + mediaPares);
        System.out.println("Média geral dos números lidos: " + mediaGeral);
        input.close();
    }
}