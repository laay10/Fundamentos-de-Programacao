/* Elaborar um programa que leia uma frase. Pesquisar na frase a existencia de caracteres especiais. Caso eles existam mostrar a quantidade de vezes que cada caractere especial aparece na frase. Caso não haja ocorrência de algum dos caracteres especiais, mostrar mensagem informando isso. */
public class Exercicio06 {
    public static void main(String[] args) {
        String frase = "Olá, como você está? #$%&";
        char[] caracteresEspeciais = {'#', '$', '%', '&'};
        for (char caractere : caracteresEspeciais) {
            int quantidade = contarOcorrencias(frase, caractere);
            if (quantidade > 0) {
                System.out.println("O caractere '" + caractere + "' aparece " + quantidade + " vezes na frase.");
            } else {
                System.out.println("O caractere '" + caractere + "' não existe na frase.");
            }
        }
    }

    public static int contarOcorrencias(String frase, char caractere) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caractere) {
                contador++;
            }
        }
        return contador;
    }
}
// Refazer sem o uso de array