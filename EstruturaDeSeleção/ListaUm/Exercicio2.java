/* Faça um algoritmo que calcule a média que um aluno obteve em uma matéria. Deve 
ser solicitado que o aluno informe suas duas notas. Caso a média seja maior ou igual 
a 7, deve ser imprimido uma mensagem informando que o aluno foi aprovado. Se a 
média for menor que 6, deve ser impresso uma mensagem alertando que o mesmo 
foi reprovado. Se o aluno ficou com a média entre 6 e 7, deve ser impresso uma 
mensagem informando que ele está em recuperação (exame). */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira sua primeira nota:");
        double notaUm = input.nextDouble();
        System.out.println("Insira sua segunda nota:");
        double notaDois = input.nextDouble();

        input.close();
        
        double media = (notaUm + notaDois) / 2;

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media < 6 ) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Em recuperação");
        }
    }
}