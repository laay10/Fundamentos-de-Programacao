/* Ler o valor de uma compra e escrever o quanto deverá ser pago, supondo que esta compra será paga em 
trinta dias e terá um acréscimo de 0,39%. */
import java.util.Scanner;

public class Exercicio10{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valorCompra = input.nextDouble();
        double acrescimo = valorCompra * 0.0039; // 0,39% em decimal
        double valorTotal = valorCompra + acrescimo;
        System.out.println("O valor total a ser pago após 30 dias é: " + valorTotal);
        input.close();
    }
}