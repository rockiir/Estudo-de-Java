/*Faça um programa que leia as notas de 5 alunos, e que exiba a maior e menor notas entre elas.*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[] nota = new int[5];
		int i, maior = 0, menor = 99;
		Scanner sc = new Scanner(System.in);		
		
		for (i=1 ; i< nota.length ; i++) {
		System.out.println("Escreva sua nota");
        nota[i] = sc.nextInt();
		
		}
		for ( i = 1; i < nota.length; i++) {
            if (nota[i] < menor) {
                menor = nota[i];
            }
            if (nota[i] > maior) {
                maior = nota[i];
            }
        }
		
		System.out.println("A maior nota é: " + maior);
        System.out.println("A menor nota é: " + menor);
		sc.close();	
		}
	}

