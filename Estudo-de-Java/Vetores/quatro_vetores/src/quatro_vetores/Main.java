package quatro_vetores;
public class Main {

	public static void main(String[] args) {
		double vet1[] = {10, 20, 30, 40, 50, 20, 4, 5, 48, 58};
		 double vet2[] = {3, 4, 70, 5, 20, 9, 12, 56, 64, 88};
		 double vet3[] = new double[10];
		 double vet4[] = new double[10];

		 for (int i = 0; i < vet1.length; i++){
		 vet3[i] = vet1[i] * vet2[i];
		 vet4[i] = vet1[i] / vet2[i];
		 }

		 System.out.println("Imprimindo o vetor 1...");
		 for (int i = 0; i < vet1.length; i++){
		 System.out.print(vet1[i] + "\t");
		 }

		 System.out.println("\nImprimindo o vetor 2...");
		 for (int i = 0; i < vet2.length; i++){
		 System.out.print(vet2[i] + "\t");
		 }

		 System.out.println("\nImprimindo o vetor 3...");
		 for (int i = 0; i < vet3.length; i++){
		 System.out.print(vet3[i] + "\t");
		 }

		 System.out.println("\nImprimindo o vetor 4...");
		 for (int i = 0; i < vet4.length; i++){
		 System.out.print(vet4[i] + "\t");
		 }
	}
}