/*Fa�a um programa que receba as duas notas de um aluno, calcule sua m�dia, e que imprima a sua situa��o: 
>= 7 -> Aprovado
< 7 -> Reprovado
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite a primeira nota do aluno ");
		double a;
		a = sc.nextDouble();
		System.out.print("digite a segunda nota do aluno ");
		double b;
		b = sc.nextDouble();
		
		double c = (a + b) / 2;
		
		if(c >= 7) {
	        System.out.println("aprovado, M�dia= " + c);       

		}
		else {
	        System.out.println("reprovado, M�dia= " + c );       

		}
	    

		sc.close();

		
		}
	}


