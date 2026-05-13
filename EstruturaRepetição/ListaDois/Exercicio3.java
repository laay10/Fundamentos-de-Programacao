/* Ler dois valores inteiros e escrever os inteiros ímpares entre os dois valores lidos. 
Considere que o segundo valor lido será sempre maior que o primeiro valor lido. */
import java.util.Scanner;

public class Exercicio3{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = input.nextInt();
        System.out.print("Digite o segundo valor inteiro (maior que o primeiro): ");
        int valor2 = input.nextInt();
        System.out.println("Os números ímpares entre " + valor1 + " e " + valor2 + " são:");
        for (int i = valor1 + 1; i < valor2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}