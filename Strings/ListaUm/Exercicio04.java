/* Faça um programa que leia um número inteiro e, utilizando a classe String,
mostre o número invertido. Ex: Lê 45678 e mostra 87654. */
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Digite um número com até 5 dígitos:");
        String numero = input.next(); // Proposital para pegar apenas a primeira "palavra"

        String invertida = inverteString(numero);

        System.out.println("O numero original é: " + numero);
        System.out.println("Invertido fica: " + invertida);
    }

    public static String inverteString (String numero) {
        String invertida = "";

        for (int i = numero.length() -1; i >= 0; i--){
            invertida += numero.charAt(i);
        }

        return invertida;
    }

}

//Receber uma String numero
// Criar uma String contraria que seja vazia
// Ter uma modularização que inverta a palvra com um for que 
//inicializa com numero.length -1: o mesmo >= 0; i--
// Atribuir dentro do for um incrementação no contrario
// numero.charAt(i)