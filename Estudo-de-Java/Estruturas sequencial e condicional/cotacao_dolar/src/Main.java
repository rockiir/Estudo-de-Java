/* 3.	Fa�a um programa que receba a cota��o do d�lar em reais, e um valor que o usu�rio possui em d�lares. Imprima este valor em reais.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
	    double cotacao_dolar, valor_dolar,valor_real;

	    System.out.print("Conversor de d�lar em real\n\n");

	    System.out.print("Digite a cota��o do dolar: ");
	    cotacao_dolar = entrada.nextDouble();

	    System.out.print("Digite o valor em dolar: ");
	    valor_dolar = entrada.nextDouble();

	    valor_real = cotacao_dolar * valor_dolar;

	    System.out.print("O Valor em reais � " + valor_real + "\n");


		
	}

}
