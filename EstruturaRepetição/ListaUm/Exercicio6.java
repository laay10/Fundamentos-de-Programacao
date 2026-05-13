/* Alterar o programa anterior e acrescentar a mensagem “VALOR INVALIDO” sempre 
que o segundo valor informado seja ZERO. */
import java.util.Scanner;

public class Exercicio6{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int anoAtual = 2026;
        System.out.println("Digite o ano em que você nasceu:");
        int anoNascimento = input.nextInt();
        int idade = anoAtual - anoNascimento;
        if (idade < 0) {
            System.out.println("VALOR INVALIDO: O ano de nascimento não pode ser maior que o ano atual.");
        } else {
            System.out.println("Sua idade é: " + idade + " anos.");
        }
        input.close();
    }
}