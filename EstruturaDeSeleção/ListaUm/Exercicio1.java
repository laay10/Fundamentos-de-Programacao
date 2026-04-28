/* Faça um programa que simule o funcionamento de uma calculadora. O programa 
deve prover ao usuário as opções de realizar Adição, Subtração, Multiplicação e 
Divisão. Também deve ser lido os dois números que o usuário deseja aplicar a 
operação */
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double resultado = 0;

        System.out.println("Digite o primeiro número:");
        double numeroUm = input.nextDouble();
        System.out.println("Digite o segundo número");
        double numeroDois = input.nextDouble();

        System.out.println("Qual operação deseja realizar:");
        System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int escolha = input.nextInt();

        input.close();

        if(escolha == 1) {
            resultado = numeroUm + numeroDois;
            System.out.println("O resultado da Adição foi: " + resultado);
        } else if (escolha == 2) {
            resultado = numeroUm - numeroDois;
            System.out.println("O resultado da Subtração foi: " + resultado);
        } else if (escolha == 3) {
            resultado = numeroUm * numeroDois;
            System.out.println("O resultado da Multiplicação foi: " + resultado);
        } else if (escolha == 4) {
            resultado = numeroUm / numeroDois;
            System.out.println("O resultado da Divisão foi: " + resultado);
        } else {
            System.out.println("A operação escolhida não existe");
        }
    }
}