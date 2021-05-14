package dez_vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int vet[] = new int[10];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite o elemento da posição " + (i + 1) + ": ");
			vet[i] = input.nextInt();
		}
		System.out.println("Digite um numero para a busca no vetor: ");
		int n = input.nextInt();

		int cont = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == n) {
				if (cont == 0)
					System.out.println("Esse número está na(s) posição(ões):");

				System.out.format("%d\n", i + 1);
				cont++;
			}
		}
	}
}
