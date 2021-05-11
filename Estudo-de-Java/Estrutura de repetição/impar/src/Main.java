/*Faça um programa que leia um número e que imprima os números ímpares de 1 até o número informado. */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int i, numero, impar = 0;

		System.out.println("Escreva um numero");
		numero = sc.nextInt();	
		for (i=1 ; i< numero ; i++) 
		{	
            if (i % 2 != 0){
                impar = i;
                
        System.out.println("Os numeros impar são " + impar);
			
		}
            
		sc.close();
		
		}
	}
}
