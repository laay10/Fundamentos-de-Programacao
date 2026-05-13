/* Leia dois números e calcule a soma e o produto entre eles, e a subtração e a divisão do 
primeiro valor com o segundo. Escreva o resultado na tela. Neste exercício, no segundo 
número poderá ser digitado o valor zero. Além disto, somente deve ser calculado o 
resultado da subtração quando ele não for negativo. */
import java.util.Scanner;

public class Exercicio2{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = input.nextDouble();
        double soma = numero1 + numero2;
        double produto = numero1 * numero2;
        System.out.println("A soma dos números é: " + soma);
        System.out.println("O produto dos números é: " + produto);
        if (numero1 - numero2 >= 0) {
            double subtracao = numero1 - numero2;
            System.out.println("A subtração do primeiro número pelo segundo é: " + subtracao);
        } else {
            System.out.println("A subtração do primeiro número pelo segundo não é calculada porque o resultado seria negativo.");
        }
        if (numero2 != 0) {
            double divisao = numero1 / numero2;
            System.out.println("A divisão do primeiro número pelo segundo é: " + divisao);
        } else {
            System.out.println("A divisão do primeiro número pelo segundo não é calculada porque o segundo número é zero.");
        }
        input.close();
    }
}