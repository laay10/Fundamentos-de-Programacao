/* Escrever um programa que calcule todos os números divisíveis por certo valor indicado 
pelo usuário (o resto da divisão por este número deve ser igual a zero), compreendidos em 
um intervalo também especificado pelo usuário. O usuário deve entrar com um primeiro 
valor correspondente ao divisor e após ele vai fornecer o valor inicial do intervalo, seguido 
do valor final deste intervalo. Exemplo de tela de saída: 
Entre com o valor do divisor: 3
Inicio do intervalo: 17
Fim do intervalo: 29
Números divisiveis por 3 no intervalo de 17 a 29 :
18 21 24 27 */
import java.util.Scanner;

public class Exercicio2{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com o valor do divisor: ");
        int divisor = input.nextInt();
        System.out.print("Inicio do intervalo: ");
        int inicio = input.nextInt();
        System.out.print("Fim do intervalo: ");
        int fim = input.nextInt();
        System.out.println("Números divisíveis por " + divisor + " no intervalo de " + inicio + " a " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            if (i % divisor == 0) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}