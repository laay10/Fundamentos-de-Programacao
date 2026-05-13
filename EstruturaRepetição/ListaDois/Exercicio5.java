/* Ler um número inteiro e apresentar os resultados da tabuada para o número lido. A 
apresentação deverá estar com o formato abaixo. Exemplo para o número informado 2.
1 X 2 = 2
2 X 2 = 4 
E assim sucessivamente */
import java.util.Scanner;

public class Exercicio5{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro para calcular sua tabuada: ");
        int numero = input.nextInt();
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = i * numero;
            System.out.println(i + " X " + numero + " = " + resultado);
        }
        input.close();
    }
}