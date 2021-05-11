/*Construa um programa para determinar se o indivíduo está com um peso favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida como sendo a relação entre o peso (PESO – em kg) e o quadrado da Altura (ALTURA – em m) do indivíduo. Ou seja,
IMC= PESO/ALTURA2
*/
import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua altura");
		double altura;
		altura = sc.nextDouble();
		System.out.print("Digite o seu peso");
		double peso;
		peso = sc.nextDouble();
		
		double imc= peso/(Math.pow(altura,2));
		
		if (imc < 20) {
			System.out.println("Você está Abaixo do peso");
		}
		else if( imc > 20 && imc < 25) {
			System.out.println("Seu peso está Peso normal");
		}
		else if(imc > 25 && imc < 30) {
			System.out.println("Você está Sobre peso");
		}
		else if (imc > 30 && imc < 40) {
			System.out.println("Você está Obeso");
		}
		else if (imc > 40){
			System.out.println("Você está Obeso morbido");
		}
		else {
			System.out.println("valor invalido ");

		}

		sc.close();
		
		}
	}

