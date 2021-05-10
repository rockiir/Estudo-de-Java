/* 3.	Faça um programa que receba a cotação do dólar em reais, e um valor que o usuário possui em dólares. Imprima este valor em reais.
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
	    double cotacao_dolar, valor_dolar,valor_real;

	    System.out.print("Conversor de dólar em real\n\n");

	    System.out.print("Digite a cotação do dolar: ");
	    cotacao_dolar = entrada.nextDouble();

	    System.out.print("Digite o valor em dolar: ");
	    valor_dolar = entrada.nextDouble();

	    valor_real = cotacao_dolar * valor_dolar;

	    System.out.print("O Valor em reais é " + valor_real + "\n");


		
	}

}
