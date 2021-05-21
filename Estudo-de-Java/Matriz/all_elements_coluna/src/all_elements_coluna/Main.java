package all_elements_coluna;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
int dados[][] = new int[3][2];
		
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < dados.length; i++)
		{
			for (int j = 0; j < dados[j].length; j++)
			{
				System.out.format("Digite o valor de coordenada [%d,%d]: ", i, j);
				dados[i][j] = input.nextInt();
			}
		}

		System.out.println("Digite o número da coluna: ");

		int numeroColuna;
		numeroColuna = input.nextInt();

		for (int i = 0; i < dados[numeroColuna].length; i++)
		{
			System.out.format("\t %d", dados[numeroColuna][i]);
		}
		System.out.println();
		
		input.close();
	}
}



