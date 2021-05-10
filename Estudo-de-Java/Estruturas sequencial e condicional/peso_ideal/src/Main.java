/*
 Faça um programa que, tendo como dados de entrada a altura (H - em metros) de um homem, calcule e apresente seu peso ideal utilizando a seguinte fórmula: 
Peso ideal (P) = (72,7 * H) – 58. 
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua altura ");
		double altura;
		altura = sc.nextDouble();
		
	    double pesoIdeal = (72.7 * altura) - 58;
	
        System.out.printf("O peso ideal é %.2f ", pesoIdeal);
       
		
		}
	}
