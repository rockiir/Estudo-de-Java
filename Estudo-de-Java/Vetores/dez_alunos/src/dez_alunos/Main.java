package dez_alunos;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int[] nota = new int[10];
		int i, maior = 0, menor = 99;
		Scanner sc = new Scanner(System.in);		
		
		for (i=0 ; i< nota.length ; i++) {
		System.out.printf("Escreva a %d nota %n", (i+1));
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

