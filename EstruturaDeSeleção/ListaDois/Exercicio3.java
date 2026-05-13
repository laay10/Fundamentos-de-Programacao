/* Escreva um programa para ler 3 valores e escrever a soma dos 2 maiores. Considere que 
o usuário não informará valores iguais. */
import java.util.Scanner;

public class Exercicio3{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 3 valores inteiros:");
        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();
        int somaDosMaiores;
        if ((valor1 > valor2 && valor1 > valor3) || (valor1 > valor2 && valor1 > valor3)) {
            somaDosMaiores = valor1 + Math.max(valor2, valor3);
        } else if ((valor2 > valor1 && valor2 > valor3) || (valor2 > valor1 && valor2 > valor3)) {
            somaDosMaiores = valor2 + Math.max(valor1, valor3);
        } else {
            somaDosMaiores = valor3 + Math.max(valor1, valor2);
        }
        System.out.println("A soma dos 2 maiores valores é: " + somaDosMaiores);
        input.close();
    }
}