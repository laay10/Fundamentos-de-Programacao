/* Faça um programa que leia um número inteiro de 4 dígitos (seu programa deve verificar 
isso) e a seguir verifique se o número lido possui a mesma característica que o número 
3025. O programa deverá escrever uma mensagem indicando se o valor lido possui ou não
a característica citada.
{30 + 25 = 55}
55² = 3025
Obs.: 55 ao quadrado resulta 3025 */
import java.util.Scanner;

public class Exercicio7{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro de 4 dígitos: ");
        int numero = input.nextInt();
        if (numero >= 1000 && numero <= 9999) {
            int parte1 = numero / 100; // Primeiros dois dígitos
            int parte2 = numero % 100; // Últimos dois dígitos
            int soma = parte1 + parte2;
            if (soma * soma == numero) {
                System.out.println("O número " + numero + " possui a mesma característica que o número 3025.");
            } else {
                System.out.println("O número " + numero + " não possui a mesma característica que o número 3025.");
            }
        } else {
            System.out.println("O número digitado não é um inteiro de 4 dígitos.");
        }
        input.close();
    }
}