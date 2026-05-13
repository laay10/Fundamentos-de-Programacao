/* Alterar o exercício anterior, mas agora, considere que o segundo valor lido poderá ser 
maior ou menor que o primeiro valor lido. */
import java.util.Scanner;

public class Exercicio4{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = input.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = input.nextInt();
        System.out.println("Os números ímpares entre " + valor1 + " e " + valor2 + " são:");
        if (valor1 < valor2) {
            for (int i = valor1 + 1; i < valor2; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = valor2 + 1; i < valor1; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}