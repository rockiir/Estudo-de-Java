package mega_sena;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0, j = 0;
		int nJogados[] = new int[6], contador = 0;
		int nSorteados[] = new int[6];

		for (i = 0; i < nJogados.length; i++) {
			System.out.printf("Digite o %d  sorteado: ", (i + 1));
			nSorteados[i] = sc.nextInt();
		}
		for (j = 0; j < nSorteados.length; j++) {
			System.out.printf("Digite o %d jogado: ", (j + 1));
			nJogados[j] = sc.nextInt();

		}

		for (i = 0; i < nJogados.length; i++) {
			for (j = 0; j < nSorteados.length; j++) {
				if (nJogados[i] == nSorteados[j])
					contador++;
			}
		}

		if (contador == 0)
			System.out.println("Voc� n�o acertou nenhum n�mero!!");
		else if (contador == 6)
			System.out.println("Parab�ns!! Voc� � o novo milion�rio!!!");
		else
			System.out.println("Voc� fez " + contador + " ponto(s) na MegaSena!!");
	}
}
