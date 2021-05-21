package multiplication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double[][] numeros = new double[3][3];
		double numero;
		double[][] numerosMult = new double[3][3];

		Scanner input = new Scanner(System.in);

		//atribuindo valores a matriz
		for(int i = 0; i < numeros.length; i++) { // for percorrendo linhas
			for(int j = 0; j < numeros[i].length; j++) { //for percorrendo colunas, cada linha tem uma quantidade de colunas
				System.out.printf("Digite o valor que ficará na linha %d, coluna %d: ", (i+1), (j+1));
				numeros[i][j] = input.nextDouble();
			}
		}

		//

		System.out.print("Digite outro valor: ");
		numero = input.nextDouble();

		//multiplicando a matriz
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				numerosMult[i][j] = numero * numeros[i][j];
			}
		}

		System.out.println();

		//percorrendo a matriz mult
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				System.out.print(numerosMult[i][j] + "\t");
			}
			System.out.print("\n" + "=======================");
			System.out.println();
		}

		input.close();


	}

}
