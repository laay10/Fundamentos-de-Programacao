/*Elaborar um programa que leia a base e a altura de triângulo e apresente a área deste triângulo. */
import java.util.Scanner;

public class Exercicio3{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a base do triângulo: ");
        double base = input.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = input.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
        input.close();
    }
}