/*Fa�a um programa que solicite ao usu�rio que informe os coeficientes a, b e c de uma equa��o de segundo grau, e que imprima as ra�zes desta equa��o (considere que os valores informados sempre retornar�o ra�zes reais para a equa��o). */
import java.util.Scanner;
import java.lang.Math;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o coeficiente A ");
		double a;
		a = sc.nextDouble();

		System.out.print("digite o coeficiente B ");
		double b;
		b = sc.nextDouble();

		System.out.print("digite o coeficiente C ");
		double c;
		c = sc.nextDouble();
		
		
		
		double delta = Math.pow(b,2.0) - 4 * a * c;
		double x1 = (-b + Math.sqrt(delta) )/(2*a);
		double x2 = (-b - Math.sqrt(delta) )/(2*a);
		
		if(delta > 0) {
			System.out.println("A ra�z x1 vale: "+ x1);
	        System.out.println("A ra�z x2 vale: "+ x2);
	        System.out.printf("S = { %.2f , %.2f}%n", x1, x2);
			
	       
	    } else {
	    	 System.out.println("A equa��o de 2� grau n�o possui ra�zes reais!");
	    }
		
		sc.close();
		
	}

}

