/*Faça um programa que receba 3 notas de um aluno, calcule e mostre uma mensagem de acordo com sua média:*/
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
		System.out.print("digite a terceira nota do aluno ");
		double c;
		c = sc.nextDouble();
		
		double d = (a + b + c) / 3;
		
		if(d >= 0 && d <3) {
	        System.out.println("Reprovado ");       

		}
		else if (d >= 3 && d < 7){
	        System.out.println("Exame "  );       

		}
		else {
	        System.out.println("Aprovado " );       

		}
	    

		sc.close();
		
		}
	}
