/* Desenvolva um programa que solicita ao usuário que insira uma temperatura em Celsius e a converta 
para Fahrenheit. O processo é repetido até que o usuário decida sair. Ao final, o usuário apresenta a 
temperatura convertida. Use apenas o comando “do while”. */
import java.util.Scanner;

public class Exercicio2{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        char resposta;
        do {
            System.out.print("Digite uma temperatura em Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + "°C é igual a " + fahrenheit + "°F");
            System.out.print("Deseja converter outra temperatura? (s/n): ");
            resposta = input.next().charAt(0);
        } while (resposta == 's' || resposta == 'S');
        input.close();
    }
}