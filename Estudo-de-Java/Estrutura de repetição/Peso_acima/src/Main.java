/*Faça um programa que leia a idade e peso de sete pessoas. Calcule e mostre:
	- a quantidade de pessoas com mais de 90 kg
	- a média das idades das sete pessoas
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int i, idade = 0, idadeTotal = 0, peso = 0, pesoTotal= 0, media = 0, contador= 0;

		for (i=1 ; i<=7 ; i++) {
		System.out.println("Escreva seu peso");
		peso = sc.nextInt();	
		if  (peso > 90 ) {
			contador = contador + 1;
		}
		System.out.println("Escreva sua idade");
		idade = sc.nextInt();
		idadeTotal = idadeTotal + idade;
			
		}
		media = idadeTotal/ 7;
		System.out.println("A media  de idade é " + media);
		System.out.println("A quantidade de pessoas pesando mais que 90KG é " + contador);

		sc.close();
		
	}
}

