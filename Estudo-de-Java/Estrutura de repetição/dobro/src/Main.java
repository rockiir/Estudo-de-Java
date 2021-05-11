/*Faça um programa que faça a leitura de 5 valores, e para cada valor, mostre o seu dobro na tela. */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int i, numero, dobro = 0;
		 Scanner sc = new Scanner(System.in);		
		
		
		for (i=1 ; i<=5 ; i++) {
		System.out.println("Escreva um numero");
		numero = sc.nextInt();	
			
		dobro = numero * 2;
		System.out.println("O dobro é " + dobro);
			
		}
		System.out.println("Fim do programa ");
		sc.close();
		
	}
}
