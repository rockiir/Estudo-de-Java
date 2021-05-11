/*Faça um programa que receba dois números e mostre o maior e o menor. Emita uma mensagem, caso os dois sejam iguais.*/
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
	        System.out.println(a + " é igual que " + b );       
		}
		
		else if (a > b) {
	        	 System.out.println(b + " é maior que " + a );       

			}
	         else {
	 	        System.out.println(a + " é menor que " + b );       

	 		}
		sc.close();

		}
	}
