/*Fa�a um programa que solicite ao usu�rio que informe a matr�cula e as tr�s notas de um conjunto de alunos. O programa dever� exibir a mensagem informando se o aluno foi aprovado (m�dia maior ou igual a 70), exame (nota maior ou igual a 60 e menor que 70) ou reprovado (nota inferior a 60). O programa ir� terminar quando o usu�rio informar uma matr�cula negativa. */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double total = 1;
		int mat = 1;
		while ( mat > 0 ) {
		
		System.out.println("Digite uma nota");
		double num2;
		num2 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double num3;
		num3 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota");
		double num4;
		num4 = sc.nextDouble();
			total = num2+ num3 + num4;
			if (total > 70) {
				System.out.println("aluno aprovado. Nota: "+ total);
				}
			
			 else if ( total < 70 && total >60){
				  System.out.println("Exame. Nota: "+ total);
				  }
			   
			 else  if (total < 60){
				  System.out.println("reprovado. Nota: "+ total);
			}
			 else {}
			
			System.out.println("Digite o numero da matricula");
			int matricula;
			matricula = sc.nextInt();
			mat = matricula;
		}
		
		System.out.println("Fim do programa ");
		sc.close();
	
		}
	}

