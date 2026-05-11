/* Ler diversas palavras e determinar:
- qual a palavra mais longa  e qual é esse comprimento
- O comprimento médio de todas as palavras lidas
- Quantas palavras iniciam pela letra a ou A
Usar a palavra fim para indicar o fim da entrada de dados , sendo que ela não entra nos calculos */
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palavra;
        int comprimentoTotal = 0;
        int quantidadePalavras = 0;
        int comprimentoMaximo = 0;
        String palavraMaisLonga = "";
        int quantidadeIniciaA = 0;

        do {
            System.out.print("Digite uma palavra (ou 'fim' para encerrar): ");
            palavra = input.nextLine();

            if (!palavra.equalsIgnoreCase("fim")) {
                quantidadePalavras++;
                comprimentoTotal += palavra.length();

                if (palavra.length() > comprimentoMaximo) {
                    comprimentoMaximo = palavra.length();
                    palavraMaisLonga = palavra;
                }

                if (palavra.toLowerCase().startsWith("a")) {
                    quantidadeIniciaA++;
                }
            }
        } while (!palavra.equalsIgnoreCase("fim"));

        if (quantidadePalavras > 0) {
            double comprimentoMedio = (double) comprimentoTotal / quantidadePalavras;
            System.out.println("A palavra mais longa é: " + palavraMaisLonga + " com comprimento " + comprimentoMaximo);
            System.out.println("O comprimento médio das palavras é: " + comprimentoMedio);
            System.out.println("Quantidade de palavras que iniciam com 'a' ou 'A': " + quantidadeIniciaA);
        } else {
            System.out.println("Nenhuma palavra foi digitada.");
        }
    }
}
