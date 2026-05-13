/*Leia 4 valores, faça a soma e o produto desses valores lidos. Mostre na tela o valor de 
cada operação realizada. */
import java.util.Scanner;

public class Exercicio4{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        double valorUm = input.nextDouble();
        System.out.println("Digite o segundo valor:");
        double valorDois = input.nextDouble();
        System.out.println("Digite o terceiro valor:");
        double valorTres = input.nextDouble();
        System.out.println("Digite o quarto valor:");
        double valorQuatro = input.nextDouble();
        double soma = valorUm + valorDois + valorTres + valorQuatro;
        double produto = valorUm * valorDois * valorTres * valorQuatro;
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("O produto dos valores é: " + produto);
        input.close();
    }
}