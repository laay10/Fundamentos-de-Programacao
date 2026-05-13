/* Faça um programa que calcule e mostre a área de um losango, onde:
Losango = (diagonalMaior * diagonalMenor) /2 */
import java.util.Scanner;

public class Exercicio11{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a diagonal maior do losango: ");
        double diagonalMaior = input.nextDouble();
        System.out.print("Digite a diagonal menor do losango: ");
        double diagonalMenor = input.nextDouble();
        double area = (diagonalMaior * diagonalMenor) / 2;  
        System.out.println("A área do losango é: " + area);
        input.close();
    }
}