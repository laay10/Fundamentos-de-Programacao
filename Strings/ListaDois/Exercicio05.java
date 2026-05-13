/* Faça um programa que receba uma data no formato dd/mm/aaaa e mostre com o mês por extenso. Por exemplo: 15/03/2023 -> 15 de março de 2023 */
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = input.nextLine();
        
        // Encontrar as posições das barras
        int primeiroSlash = data.indexOf('/');
        if (primeiroSlash == -1) {
            System.out.println("Formato inválido.");
            return;
        }
        int segundoSlash = data.indexOf('/', primeiroSlash + 1);
        if (segundoSlash == -1) {
            System.out.println("Formato inválido.");
            return;
        }
        
        // Extrair dia, mês e ano sem usar array
        String diaStr = data.substring(0, primeiroSlash);
        String mesStr = data.substring(primeiroSlash + 1, segundoSlash);
        String anoStr = data.substring(segundoSlash + 1);
        
        int dia = Integer.parseInt(diaStr);
        int mes = Integer.parseInt(mesStr);
        int ano = Integer.parseInt(anoStr);
        
        String mesExtenso = "";
        switch (mes) {
            case 1: mesExtenso = "janeiro"; break;
            case 2: mesExtenso = "fevereiro"; break;
            case 3: mesExtenso = "março"; break;
            case 4: mesExtenso = "abril"; break;
            case 5: mesExtenso = "maio"; break;
            case 6: mesExtenso = "junho"; break;
            case 7: mesExtenso = "julho"; break;
            case 8: mesExtenso = "agosto"; break;
            case 9: mesExtenso = "setembro"; break;
            case 10: mesExtenso = "outubro"; break;
            case 11: mesExtenso = "novembro"; break;
            case 12: mesExtenso = "dezembro"; break;
            default: System.out.println("Mês inválido."); return;
        }
        System.out.println(dia + " de " + mesExtenso + " de " + ano);
    }
}