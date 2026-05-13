//Faça um programa que leia um número e mostre todos os seus antecessores.
import java.util.Scanner;

public class Exercicio3{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        System.out.println("Os antecessores de " + numero + " são:");
        for (int i = numero - 1; i >= 0; i--) {
            System.out.println(i);
        }
        input.close();
    }
}