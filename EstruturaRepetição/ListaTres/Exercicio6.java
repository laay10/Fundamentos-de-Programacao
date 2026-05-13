// Faça um programa que escreve todos os números pares entre 1000 e 2000.

public class Exercicio6{
    public static void main (String[] args){
        for (int i = 1000; i <= 2000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}