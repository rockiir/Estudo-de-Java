/*Dados três valores X,Y,Z, verificar se eles podem ser os comprimentos dos lados de um triângulo. Se eles não formarem um triângulo escrever uma mensagem. Considerar que o comprimento de cada lado de um triângulo é menor que a soma dos outros dois lados.*/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		double x, y, z;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o lado x do triangulo ");
		x = sc.nextDouble();
		System.out.println("Digite o lado y do triangulo ");
		y = sc.nextDouble();
		System.out.println("Digite o lado z do triangulo ");
		z = sc.nextDouble();
				
		if(x + y > z && x + z > y && y + z > x ) {
	        System.out.println("os tres lados formam um triângulo "); 
	        if (x == y && x == z)
		        System.out.println("Equilatero"); 
	        else if (x == y && x == z && y == z) {
		        System.out.println("Isoceles"); 
		        }
		        else {
			        System.out.println("Escaleno"); 
		        }
		}
		else {
	        System.out.println("Não é um triangulo"); 
        }

		sc.close();
		
		}
	}
