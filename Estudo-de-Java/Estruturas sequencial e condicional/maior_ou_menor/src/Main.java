/*Fa�a um programa que receba dois n�meros e mostre o maior e o menor. Emita uma mensagem, caso os dois sejam iguais.*/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite um numero ");
		double a;
		a = sc.nextDouble();
		System.out.print("digite um numero ");
		double b;
		b = sc.nextDouble();
				
		if(a == b ){
	        System.out.println(a + " � igual que " + b );       
		}
		
		else if (a > b) {
	        	 System.out.println(b + " � maior que " + a );       

			}
	         else {
	 	        System.out.println(a + " � menor que " + b );       

	 		}
		sc.close();

		}
	}
