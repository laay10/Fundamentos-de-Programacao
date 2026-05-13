/* Implemente um programa em Java que lê 50 valores inteiros e positivos, calcule e escreva:
(a) a média dos valores;
(b) o maior deles;
(c) o menor deles. */
import java.util.Scanner;

public class Exercicio5{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int quantidadeValores = 50;
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.print("Digite o valor inteiro e positivo " + i + ": ");
            int valor = input.nextInt();
            while (valor <= 0) {
                System.out.print("Valor inválido. Digite um valor inteiro e positivo " + i + ": ");
                valor = input.nextInt();
            }
            soma += valor;
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }
        double media = (double) soma / quantidadeValores;
        System.out.println("A média dos valores é: " + media);
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        input.close();
    }
}