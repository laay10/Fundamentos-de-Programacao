/* Uma empresa tem para um determinado funcionário uma ficha contendo o número de horas trabalhadas e 
o n0 de dependentes. Considerando que:
a) A empresa paga 12 reais por hora e 40 reais por dependentes, isto é o salário bruto.
b) Sobre o salário bruto são feitos descontos de 8,5% para o INSS e 5% para IR.
Faça um programa para ler o número de horas trabalhadas e número de dependentes de um funcionário. 
Após a leitura, escreva qual o salário bruto, os valores descontados para cada tipo de imposto e
finalmente qual o salário líquido do funcionário. */
import java.util.Scanner;

public class Exercicio7{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = input.nextInt();
        System.out.print("Digite o número de dependentes: ");
        int numeroDependentes = input.nextInt();
        double salarioBruto = (horasTrabalhadas * 12) + (numeroDependentes * 40);
        double descontoINSS = salarioBruto * 0.085;
        double descontoIR = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - descontoINSS - descontoIR;
        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Desconto INSS: " + descontoINSS);
        System.out.println("Desconto IR: " + descontoIR);
        System.out.println("Salário líquido: " + salarioLiquido);
        input.close();
    }
}