/* Faça um programa que receba uma data no formato dd/mm/aaaa e mostre com o mês por extenso. Por exemplo: 15/03/2023 -> 15 de março de 2023 */
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = input.nextLine();
        String[] partes = data.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);
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