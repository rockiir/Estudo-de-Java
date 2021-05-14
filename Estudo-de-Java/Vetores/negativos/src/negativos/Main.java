package negativos;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[] vet = new int[10];
		int i;
		Scanner sc = new Scanner(System.in);		
		
		for (i=0 ; i< vet.length ; i++) {
		System.out.printf("Escreva o %d numero %n", (i+1));
        vet[i] = sc.nextInt();
		
		}
		for ( i = 1; i < vet.length; i++) {
            if (vet[i] <= 0) {
                vet[i] = 0;
        }
    	System.out.println( vet[i]);
        sc.close();	
		}
	}
}
	

