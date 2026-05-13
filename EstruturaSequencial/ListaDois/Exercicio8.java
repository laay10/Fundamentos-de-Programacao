/* Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida 
respectivamente por 10, 15, 18 reais. Construa um programa em que o usuário forneça a quantidade de 
camisetas pequenas, médias e grandes vendidas. Informe o valor a ser cobrado. */
import java.util.Scanner;

public class Exercicio8{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de camisetas pequenas vendidas: ");
        int quantidadePequenas = input.nextInt();
        System.out.print("Digite a quantidade de camisetas médias vendidas: ");
        int quantidadeMedias = input.nextInt();
        System.out.print("Digite a quantidade de camisetas grandes vendidas: ");
        int quantidadeGrandes = input.nextInt();
        double valorTotal = (quantidadePequenas * 10) + (quantidadeMedias * 15) + (quantidadeGrandes * 18);
        System.out.println("O valor total a ser cobrado é: " + valorTotal);
        input.close();
    }
}