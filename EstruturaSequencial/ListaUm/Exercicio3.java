/* Escrever um programa que leia o nome de um aluno e as notas das três provas que ele 
obteve no semestre. No final, informar o nome do aluno e a sua média (aritmética). */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Escreva seu nome:");
        String nomeAluno = input.nextLine();

        System.out.println("Digite a primeira nota:");
        double notaUm = input.nextDouble();
        System.out.println("Digite a segunda nota:");
        double notaDois = input.nextDouble();
        System.out.println("Digite a terceira nota:");
        double notaTres = input.nextDouble();

        double media = (notaUm + notaDois + notaTres) / 3;

        System.out.println("Aluno: " + nomeAluno + "\nMédia: " + media);
    }
}