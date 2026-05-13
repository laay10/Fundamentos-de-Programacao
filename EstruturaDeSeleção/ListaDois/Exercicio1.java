//Leia dois valores numéricos e escreva o menor valor.
import java.util.Scanner;

public class Exercicio1{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double valor1 = input.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = input.nextDouble();
        if (valor1 < valor2) {
            System.out.println("O menor valor é: " + valor1);
        } else if (valor2 < valor1) {
            System.out.println("O menor valor é: " + valor2);
        } else {
            System.out.println("Os valores são iguais: " + valor1);
        }
        input.close();
    }
}