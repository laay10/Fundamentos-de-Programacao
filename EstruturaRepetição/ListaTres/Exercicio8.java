/* Escreva um programa que leia uma quantidade desconhecida de números. A seguir, o programa deve 
contar e escrever a quantidade de valores pertencentes aos seguintes intervalos: [0; 25], [26; 50], [51; 75] 
e [76; 100]. A entrada de dados deve terminar quando for lido um número negativo. Ao final o programa 
deve exibir ainda a quantidade de valores lidos.
Por exemplo, se o usuário digitar os números 4 e 2, esses números pertencem ao intervalo [0; 25]. 
Nos demais intervalos, [26; 50], [51; 75] e [76; 100], a resposta será zero, pois os números digitados pelo 
usuário não fazem parte dos intervalos anteriores. */
import java.util.Scanner;

public class Exercicio8{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int countIntervalo1 = 0; // [0; 25]
        int countIntervalo2 = 0; // [26; 50]
        int countIntervalo3 = 0; // [51; 75]
        int countIntervalo4 = 0; // [76; 100]
        int totalValores = 0;
        int numero;
        do {
            System.out.print("Digite um número (negativo para encerrar): ");
            numero = input.nextInt();
            if (numero >= 0) {
                totalValores++;
                if (numero <= 25) {
                    countIntervalo1++;
                } else if (numero <= 50) {
                    countIntervalo2++;
                } else if (numero <= 75) {
                    countIntervalo3++;
                } else if (numero <= 100) {
                    countIntervalo4++;
                }
            }
        } while (numero >= 0);
        System.out.println("Quantidade de valores no intervalo [0; 25]: " + countIntervalo1);
        System.out.println("Quantidade de valores no intervalo [26; 50]: " + countIntervalo2);
        System.out.println("Quantidade de valores no intervalo [51; 75]: " + countIntervalo3);
        System.out.println("Quantidade de valores no intervalo [76; 100]: " + countIntervalo4);
        System.out.println("Quantidade total de valores lidos: " + totalValores);
        input.close();
    }
}