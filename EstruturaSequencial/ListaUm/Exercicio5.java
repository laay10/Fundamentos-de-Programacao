/* Escreva um pequeno software que peça a sua idade e a idade da sua mãe. Mostre
a diferença de idade entre o filho e a mãe. Em seguida, imprima na tela as três informações. */
import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int anoFinal = input.nextInt();

        System.out.println("Digite a idade da sua mãe:");
        int anoInicial = input.nextInt();

        int diferenca = anoInicial - anoFinal;

        System.out.println("A diferença entre idades é de: " + diferenca + " anos"); 
    }
}