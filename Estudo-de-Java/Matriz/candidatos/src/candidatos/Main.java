package candidatos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dados[][] = new int[6][4];
		int i, maior = 0, menor = 99;
		int j, maiorb = 0, menorb = 99;

		
		Scanner input = new Scanner(System.in);

		for ( i = 0; i < dados.length; i++)
		{
			for ( j = 0; j < dados[j].length; j++)
			{
				System.out.format("Digite o voto do mês %d do candidato %d]: ", i, j);
				dados[i][j] = input.nextInt();
			}
		}
		
		
		for ( i = 0; i < dados.length; i++)
		{
			if (dados[i][i] < menor) {
                menor = dados[i][i];
            }
			
			System.out.format("o candidato %d e o mês %d tiveram mais votos", menor, menorb);
		}
		System.out.println();
		
		input.close();
	}
}



