/*1.	Receba um n�mero positivo, calcule e mostre:
a.	O n�mero digitado ao quadrado
b.	O n�mero digitado ao cubo
c.	A raiz quadrada do n�mero digitado
d.	A raiz c�bica do n�mero digitado.
*/

import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o numero ");
		int x;
		x = sc.nextInt();
		
		double a = Math.pow(x,2);
		double b = Math.pow(x,3);
		double c = Math.sqrt(x);
		double d = Math.cbrt(x);


		
        System.out.println(x + " elevado ao quadrado" + a);
        System.out.println(x + " elevado ao cubo " + b);
        System.out.println("a raiz quadrada de � " + c);
        System.out.println("a raiz cubica de � " + d);
        

		
		}
	}
