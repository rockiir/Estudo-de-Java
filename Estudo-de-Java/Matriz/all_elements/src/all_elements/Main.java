package all_elements;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
int dados[][] = new int[4][4];
		
		Scanner input = new Scanner(System.in);

		for (int linha = 0; linha < dados.length; linha++)
		{
			for (int coluna = 0; coluna < dados[linha].length; coluna++)
			{
				System.out.format("Digite o valor de coordenada [%d,%d]: ", linha, coluna);
				dados[linha][coluna] = input.nextInt();
			}
		}

		System.out.println("Digite o número da linha: ");

		int numeroLinha;
		numeroLinha = input.nextInt();

		for (int coluna = 0; coluna < dados[numeroLinha].length; coluna++)
		{
			System.out.format("\t %d", dados[numeroLinha][coluna]);
		}
		System.out.println();
		
		input.close();
	}
}
