/* Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de 
vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de 
comissão sobre suas vendas efetuadas, informar seu nome, o salário fixo e salário no final 
do mês. */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Qual o nome do funcionário:");
        String nomeFuncionario = input.nextLine();

        System.out.println("Qual seu salário:");
        double salario = input.nextDouble();

        System.out.println("Quantidade de vendas:");
        int quantidade = input.nextInt();

        double extra = 0.15 * quantidade;

        double salarioTotal = salario + extra;

        System.out.println("Nome: " + nomeFuncionario + "\nSalário fixo: R$" + salario + "\nSalário total: R$" + salarioTotal);
    }
}