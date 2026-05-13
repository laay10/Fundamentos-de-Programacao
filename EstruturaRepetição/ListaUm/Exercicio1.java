/* Faça um programa que informe o número de alunos de uma turma e calcule a média do 
exercício de avaliação 1 dos alunos. */
import java.util.Scanner;

public class Exercicio1{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número de alunos da turma: ");
        int numeroAlunos = input.nextInt();
        double somaNotas = 0.0;
        for (int i = 1; i <= numeroAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = input.nextDouble();
            somaNotas += nota;
        }
        double media = somaNotas / numeroAlunos;
        System.out.println("A média do exercício de avaliação 1 é: " + media);
        input.close();
    }
}