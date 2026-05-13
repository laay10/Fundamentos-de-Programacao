/* Escrever um programa para calcular o volume de uma lata de refrigerante, lembre-se que a fórmula é: 
VOLUME = PI * R * R * altura, onde PI = 3.14159. */
import java.util.Scanner;

public class Exercicio2{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o raio da lata de refrigerante: ");
        double raio = input.nextDouble();
        System.out.print("Digite a altura da lata de refrigerante: ");
        double altura = input.nextDouble();
        double pi = 3.14;
        double volume = pi * raio * raio * altura;
        System.out.println("O volume da lata de refrigerante é: " + volume);
    }
}