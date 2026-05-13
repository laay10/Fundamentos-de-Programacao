// Faça um programa que lê três valores e mostre o maior e o menor valor.
import java.util.Scanner;

public class Exercicio4{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = input.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int valor3 = input.nextInt();
        int maior = valor1;
        int menor = valor1;
        if (valor2 > maior) {
            maior = valor2;
        }
        if (valor2 < menor) {
            menor = valor2;
        }
        if (valor3 > maior) {
            maior = valor3;
        }
        if (valor3 < menor) {
            menor = valor3;
        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        input.close();
    }
}