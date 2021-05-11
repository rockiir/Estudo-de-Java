/*A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados sobre o salário e o número de filhos. A prefeitura deseja saber: 
a ) A média do salário da população; 
b ) A média do número de filhos. 
O final da leitura de dados dar-se-á com a entrada de salários negativos. 
*/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario = 0, salarioTotal = 0, mediaA= 0, mediaB = 0;
		int filhos = 0,filhosTotal = 0, contadorA = 0, contadorB = 0;
		
		System.out.println("Digite seu salario");
	     salario = sc.nextDouble();
	     
		while ( salario > 0 ) {
			
		contadorA = contadorA + 1 ;
		filhosTotal = filhosTotal + filhos;
		System.out.println("Digite a quantidade de filhos");
		filhos = sc.nextInt();
		
		contadorB = contadorB + 1;
		salarioTotal = salarioTotal + salario;
		System.out.println("Digite seu salario");
		salario = sc.nextDouble();
		
		
	     		
		}
		
		mediaA = salarioTotal / contadorB;
		mediaB = filhosTotal / contadorA ;
		
		System.out.format("Media dos salarios é %.2f \n" ,mediaA ) ;
	    System.out.format("Media do numero de filhos %.1f \n" ,mediaB ) ;
		
	
		}
	}

