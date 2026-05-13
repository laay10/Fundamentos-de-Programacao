/* Faça um programa que leia uma palavra e um trecho de uma palavra. O
programa deve informar se a palavra lida possui o trecho de palavra informado
pelo usuário. Exemplo: PALAVRA: casaco TRECHO: asa, resultado, contém asa. */
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();
        System.out.print("Digite um trecho de palavra: ");
        String trecho = input.nextLine();

        if (palavra.contains(trecho)) {
            System.out.println("A palavra contém o trecho informado.");
        } else {
            System.out.println("A palavra não contém o trecho informado.");
        }

        input.close();
        
    }
}

// sTRING PALAVRA
// Usar nesse caso o método startsWith("asa").