/*Uma rede de lojas de departamento classifica seus clientes em 1, 2 e 3, de acordo com 
sua freqüência de compras e com isto recebe descontos. Ler o valor total da compra e 
classificação. Exibir o valor da compra, desconto e valor a ser pago. Sendo que clientes 
1 – 20% de desconto, clientes 2 – 15% de desconto e clientes 3 – 5%. */
import java.util.Scanner;

public class Exercicio4{
    public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Digite o valor total da compra: ");
       double valorCompra = input.nextDouble();
       System.out.print("Digite a classificação do cliente (1, 2 ou 3): ");
       int classificacao = input.nextInt();
       double desconto = 0.0;
       if (classificacao == 1) {
           desconto = valorCompra * 0.20;
       } else if (classificacao == 2) {
           desconto = valorCompra * 0.15;
       } else if (classificacao == 3) {
           desconto = valorCompra * 0.05; 
       }
       double valorAPagar = valorCompra - desconto;
       System.out.println("Valor da compra: " + valorCompra);
       System.out.println("Desconto: " + desconto);
       System.out.println("Valor a ser pago: " + valorAPagar);
       input.close();
    }
}