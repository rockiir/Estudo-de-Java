/*Faça um programa que solicite ao usuário que informe o valor das temperaturas coletadas nos 10 primeiros dias do mês de janeiro de 2021, em Belo Horizonte. Imprima em seguida a média dessas temperaturas.*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		double i, temp, tempTotal = 0, media = 0;
		 Scanner sc = new Scanner(System.in);		
		
		
		for (i=1 ; i<=10 ; i++) {
		System.out.println("Escreva a temperatura do dia");
		temp = sc.nextDouble();	
		tempTotal = tempTotal + temp;
		
		}
		media = tempTotal / 10;
		System.out.println("A media de temperatura total para os 10 primeiros dias do mês de Janeiro é : " + media + " graus");
		sc.close();
		
	}
}

