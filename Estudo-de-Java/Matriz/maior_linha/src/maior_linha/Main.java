package maior_linha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 int dados[][] = new int[4][4];
			int vetor[] = new int[dados.length];
			int maior = -99999;

			Scanner input = new Scanner(System.in);

			for (int linha = 0; linha < dados.length; linha++)
			{
				for (int coluna = 0; coluna < dados[linha].length; coluna++)
				{
					System.out.printf("\n Digite o número que ocupará a posição [%d, %d] ", linha, coluna);
					dados[linha][coluna] = input.nextInt();
				}
			}

			for (int linha = 0; linha < dados.length; linha++)
			{
				for (int coluna = 0; coluna < dados[linha].length; coluna++)
				{
					if (dados[linha][coluna] > maior)
						maior = dados[linha][coluna];
				}
				vetor[linha] = maior; 
				maior = -99999;
			}

			System.out.println("Imprimindo os maiores elementos de cada linha...");
			for (int i = 0; i < vetor.length; i++)
				System.out.println(vetor[i]);

			input.close();
}
}