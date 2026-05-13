/* Um banco concederá um crédito especial aos seus clientes, variável com o saldo 
médio no último ano. Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela abaixo. Mostre uma mensagem 
informando o saldo médio e o valor do crédito.
Saldo                           Médio Crédito
Maior ou igual a R601,00 40% do valor do saldo médio
Maior ou igual a R401,00 30% do valor do saldo médio
Maior ou igual a R201,00 20% do valor do saldo médio*/
import java.util.Scanner;

public class Exercicio7{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o saldo médio do cliente: R$");
        double saldoMedio = input.nextDouble();
        double credito = 0.0;
        if (saldoMedio >= 601.00) {
            credito = saldoMedio * 0.4;
        } else if (saldoMedio >= 401.00) {
            credito = saldoMedio * 0.3;
        } else if (saldoMedio >= 201.00) {
            credito = saldoMedio * 0.2;
        }
        System.out.println("Saldo médio: R$" + saldoMedio);
        System.out.println("Valor do crédito: R$" + credito);
        input.close();
    }
}