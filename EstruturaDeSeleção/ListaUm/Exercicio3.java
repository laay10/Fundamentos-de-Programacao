/* Faça um programa para tratar o funcionamento de um saque em caixa eletrônico de 
banco. Neste programa o saque deverá ser feito apenas se o cliente possuir saldo e o 
cliente deve ter avisado se o saque foi realizado com sucesso ou não. Considere que o 
cliente tem R$ 300,00 de saldo. */
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double saldo = 300;
        double novoSaldo = 0;

        System.out.println ("Digite o valor do Saque: ");
        double saque = input.nextDouble();

        if (saque <= saldo) {
            novoSaldo = saldo - saque;
            System.out.println("Saque realizado com sucesso");
            System.out.println("Seu saldo atual agora é: R$" + novoSaldo);
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }
}