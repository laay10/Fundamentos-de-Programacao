/* Elabore um programa para conjugar verbos regulares no presente, passado e futuro */
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um verbo regular no infinitivo (terminado em -ar, -er ou -ir): ");
        String verbo = input.nextLine().toLowerCase();
        if (verbo.endsWith("ar") || verbo.endsWith("er") || verbo.endsWith("ir")) {
            String raiz = verbo.substring(0, verbo.length() - 2);
            System.out.println("Presente:");
            System.out.println("Eu " + raiz + "o");
            System.out.println("Tu " + raiz + "as");
            System.out.println("Ele/Ela " + raiz + "a");
            System.out.println("Nós " + raiz + "amos");
            System.out.println("Vós " + raiz + "ais");
            System.out.println("Eles/Elas " + raiz + "am");
            System.out.println("\nPassado:");
            System.out.println("Eu " + raiz + "ei");
            System.out.println("Tu " + raiz + "aste");
            System.out.println("Ele/Ela " + raiz + "ou");
            System.out.println("Nós " + raiz + "amos");
            System.out.println("Vós " + raiz + "astes");
            System.out.println("Eles/Elas " + raiz + "aram");
            System.out.println("\nFuturo:");
            System.out.println("Eu vou " + verbo);
            System.out.println("Tu vais " + verbo);
            System.out.println("Ele/Ela vai " + verbo);
            System.out.println("Nós vamos " + verbo);
            System.out.println("Vós vais " + verbo);
            System.out.println("Eles/Elas vão " + verbo);
        } else {
            System.out.println("O verbo deve ser regular e terminar em -ar, -er ou -ir.");
        }
    }
}