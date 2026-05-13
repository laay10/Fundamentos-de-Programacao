/* Efetuar o cálculo da quantidade de litros de combustível gastas em uma viagem, utilizando-se um 
automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deverá fornecer o tempo gasto na 
viagem e a velocidade média durante a mesma. Desta forma, será possível obter a distância percorrida 
com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância, basta calcular a 
quantidade de litros de combustível utilizada na viagem com a fórmula: LITROS = DISTANCIA / 12. O 
programa deverá apresentar os valores da velocidade média, tempo gasto na viagem, à distância 
percorrida e a quantidade de litros utilizada na viagem. */
import java.util.Scanner;

public class Exercicio5{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = input.nextDouble();
        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidade = input.nextDouble();
        double distancia = tempo * velocidade;
        double litros = distancia / 12;
        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Tempo gasto na viagem: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Quantidade de litros utilizada na viagem: " + litros + " litros");
        input.close();
    }
}