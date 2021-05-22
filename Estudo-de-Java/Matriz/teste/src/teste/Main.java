package teste;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int matriz[][] = new int[4][6];
		int maiorVoto = -9999;
		int mesMaior = 0;
		int candidatoMaior = 0;
		int menorVoto = 99999;
		int mesMenor = 0, candidatoMenor = 0;
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.printf("CANDIDATO %d - Votos no %d mês: ", (i+1), (j+1));
				matriz[i][j] = input.nextInt();
			}
		}
		
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.printf("Candidato %d - ", i);
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.printf(matriz[i][j] + "\t");
				
				if(matriz[i][j] > maiorVoto) {
					candidatoMaior = i;
					mesMaior = j;
					maiorVoto = matriz[i][j];
				} else if(matriz[i][j] < menorVoto) {
					candidatoMenor = i;
					mesMenor = j;
					menorVoto = matriz[i][j];
				}
				
			}
			System.out.println();
			
		}
		
		System.out.printf("A maior quantidade de votos registrada foi no mês %d, totalizando %d votos -> Candidato %d \n", (mesMaior+1), maiorVoto, (candidatoMaior+1));
		System.out.printf("A menor quantidade de votos registrada foi no mês %d, totalizando %d votos -> Candidato %d", (mesMenor+1), menorVoto, (candidatoMenor+1));
		input.close();
	}

}
