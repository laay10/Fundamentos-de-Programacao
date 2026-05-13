/* O preço de um automóvel é calculado pela soma do preço de fábrica com o preço dos impostos (45% do 
preço de fábrica) e a percentagem do revendedor (28% do preço de fábrica). Faça um programa que leia o 
preço de fábrica e imprima o seu preço final. */
import java.util.Scanner;

public class Exercicio6{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o preço de fábrica do automóvel: ");
        double precoFabrica = input.nextDouble();
        double impostos = precoFabrica * 0.45;
        double percentualRevendedor = precoFabrica * 0.28;
        double precoFinal = precoFabrica + impostos + percentualRevendedor;
        System.out.println("O preço final do automóvel é: " + precoFinal);
        input.close();
    }
}