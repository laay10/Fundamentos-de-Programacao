/* Faça um programa que leia uma palavra e que informa se a palavra contém uma
das vogais A,E,I,O ou U */
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = input.next();

        boolean contemVogal = verificaVogal(palavra);
        
        if (contemVogal) {
            System.out.println("A palavra contém vogais.");
        } else {
            System.out.println("A palavra não contém vogais.");
        }
        
        input.close();
    }

    public static boolean verificaVogal(String palavra){
        String palavraMinuscula = palavra.toLowerCase();
        
        for (char letra : palavraMinuscula.toCharArray()) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                return true;
            }
        }
        
        return false;
    }

}

// 