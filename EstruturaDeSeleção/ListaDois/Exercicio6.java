/* Dados três valores lado1, lado2, lado3, verificar se eles podem ser os comprimentos dos 
lados de um triângulo e, se for verificar se é triângulo eqüilátero, isóscele ou escaleno. 
Se não formarem triângulo, escrever uma mensagem.
Lembretes:
• Triângulo é uma forma geométrica composta por três lados, onde cada lado é menor 
que a soma dos outros dois lados.
• Triângulo eqüilátero todos os lados são iguais.
• Triângulo isóscele dois lados iguais e um diferente.
• Triângulo escaleno todos os lados diferentes. */
import java.util.Scanner;

public class Exercicio6{
    public static void main (String[] args){
       Scanner input = new Scanner(System.in);
        System.out.println("Digite os comprimentos dos três lados do triângulo:");
        double lado1 = input.nextDouble();
        double lado2 = input.nextDouble();
        double lado3 = input.nextDouble();
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é eqüilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é isóscele.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }
        input.close(); 
    }
}