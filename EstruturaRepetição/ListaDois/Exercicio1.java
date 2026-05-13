// Ler 10 valores inteiros e escrever apenas os valores que estão no intervalo [10, 20] .
import java.util.Scanner;

public class Exercicio1{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            int valor = input.nextInt();
            if (valor >= 10 && valor <= 20) {
                System.out.println("Valor no intervalo [10, 20]: " + valor);
            }
        }
        input.close();
    }
}