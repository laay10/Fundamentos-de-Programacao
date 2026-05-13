/* Faça um programa em java que lê uma palavra, uma vogal (garanta isso), e uma
posição específica da palavra. O programa deve informar se a posição informada
da palavra possui a vogal tambem informada pelo usuário. */
import java.util.Scanner;

public class Exercicio01 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Lê uma palavra
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();
        
        // Lê e valida uma vogal
        char vogal = ' ';
        boolean vogalValida = false;
        while (!vogalValida) {
            System.out.print("Digite uma vogal (a, e, i, o, u): ");
            String entrada = sc.nextLine().toLowerCase();
            
            if (entrada.length() == 1 && "aeiou".contains(entrada)) {
                vogal = entrada.charAt(0);
                vogalValida = true;
            } else {
                System.out.println("Entrada inválida! Digite apenas uma vogal.");
            }
        }
        
        // Lê uma posição
        System.out.print("Digite a posição (começando de 0): ");
        int posicao = sc.nextInt();
        
        // Valida a posição
        if (posicao < 0 || posicao >= palavra.length()) {
            System.out.println("Posição inválida! A palavra tem " + palavra.length() + " caracteres.");
        } else {
            char caracterNaPosicao = palavra.charAt(posicao);
            
            if (caracterNaPosicao == vogal) {
                System.out.println("Sim! A posição " + posicao + " contém a vogal '" + vogal + "'.");
            } else {
                System.out.println("Não! A posição " + posicao + " contém '" + caracterNaPosicao + "', não a vogal '" + vogal + "'.");
            }
        }
        
        sc.close();
    }
}