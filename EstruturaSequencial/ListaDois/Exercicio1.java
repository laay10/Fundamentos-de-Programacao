/*Escreva um programa para ler a quantidade de cavalos de uma fazenda e escreva quantas ferraduras são 
necessárias para equipar todos os cavalos da fazenda. */
import java.util.Scanner;

public class Exercicio1{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a quantidade de cavalos na fazenda: ");
        int quantidadeCavalos = input.nextInt();
        int quantidadeFerraduras = quantidadeCavalos * 4;
        System.out.println("São necessárias " + quantidadeFerraduras + " ferraduras para equipar
    todos os cavalos da fazenda.");
        input.close();
    }
}