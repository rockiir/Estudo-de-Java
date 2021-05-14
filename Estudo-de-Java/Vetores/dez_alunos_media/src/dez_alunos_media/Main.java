package dez_alunos_media;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double notas[] = new double[5];//{80, 60, 50, 70, 30};
		 double soma = 0;
		 double media;

		 for (int i = 0; i < notas.length; i++){
		 System.out.print("Digite a nota do aluno " + (i+1) + ": ");
		 notas[i] = sc.nextDouble();
		 soma = soma + notas[i];
		 }

		 media = soma/notas.length;
		 System.out.format("Média das notas: %.2f\n", media);

		 System.out.println("Alunos abaixo da média...");
		 for (int i = 0; i < notas.length; i++){
		 if (notas[i] < media)
		 System.out.println("Aluno: " + (i+1) + " nota: " + notas[i]);
		 }

		 System.out.println("Alunos com nota igual ou acima da média...");
		 for (int i = 0; i < notas.length; i++){
		 if (notas[i] >= media)
		 System.out.println("Aluno: " + (i+1) + " nota: " + notas[i]);
		 }
	}
}
