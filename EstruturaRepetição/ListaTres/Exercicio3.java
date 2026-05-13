/* Solicite ao usuário que insira números inteiros e conte quantos são pares e quantos são ímpares. O 
usuário pode continuar inserindo números até decidir parar. Mostre os números pares e ímpares. */
import java.util.Scanner;

public class Exercicio3{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int countPares = 0;
        int countImpares = 0;
        char resposta;
        do {
            System.out.print("Digite um número inteiro: ");
            int numero = input.nextInt();
            if (numero % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
            System.out.print("Deseja continuar? (s/n): ");
            resposta = input.next().charAt(0);
        } while (resposta == 's' || resposta == 'S');
        System.out.println("Quantidade de números pares: " + countPares);
        System.out.println("Quantidade de números ímpares: " + countImpares);
        input.close();
    }
}