/*Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit (F = (C*1,8) + 32)
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite a temperatura em celcius ");
		double a;
		a = sc.nextDouble();
		
		double f = (a * 1.8) + 32;
	   
	    

	
        System.out.printf("A temperatura em Fahrenheit é %.2f  %n" , f);       
		
		}
	}

