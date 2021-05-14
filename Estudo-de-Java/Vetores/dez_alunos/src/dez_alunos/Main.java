package dez_alunos;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 int vet[] = new int[5];

		 for (int i = 0; i < vet.length; i++){
		 System.out.print("Digite o elemento da posição " + (i+1) + ": ");
		 vet[i] = input.nextInt();
		 }
		 for (int i = 0; i < vet.length; i++){
		 System.out.print(vet[i] + "\t");
		 }
	}

}
