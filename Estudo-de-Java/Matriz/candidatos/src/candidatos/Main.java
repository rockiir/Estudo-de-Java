package candidatos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dados[][] = new int[6][4];
		int i = 0, j = 0, mesMaior = 0, mesMenor = 9999;
		int  votoMaior = 0, votoMenor = 9999;
		int  candidatoMaior = 0, candidatoMenor = 9999;
		
		Scanner input = new Scanner(System.in);

		for ( i = 0; i < dados.length; i++)
		{
			for ( j = 0; j < dados[j].length; j++)
			{
				System.out.format("Digite o voto do mês %d do candidato %d]: ", (i+1), (j+1));
				dados[i][j] = input.nextInt();
			}
		}
		
		
		for( i = 0; i < dados.length; i++) {
			System.out.printf("Candidato %d - ", i);
			for(j = 0; j < dados[i].length; j++) {
				System.out.printf(dados[i][j] + "%n");
				
				if(dados[i][j] > votoMaior) {
					candidatoMaior = i;
					mesMaior = j;
					votoMaior = dados[i][j];
				} else if(dados[i][j] < votoMenor) {
					candidatoMenor = i;
					mesMenor = j;
					votoMenor = dados[i][j];
				}
				
			}
			
			
		}
		System.out.println();
		System.out.format("o candidato %d e o mês %d tiveram mais votos e  a maior quantidade de votos registrada foi %d %n",(candidatoMaior+1), (mesMaior+1) ,votoMaior);
		System.out.format("o candidato %d e o mês %d tiveram mais votos e  a maior quantidade de votos registrada foi %d %n",(candidatoMenor+1), (mesMenor+1) ,votoMenor);

		
		input.close();
	}
}



