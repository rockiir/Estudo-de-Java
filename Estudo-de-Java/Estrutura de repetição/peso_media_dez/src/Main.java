/**/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int i, sexo, contF = 0, contM = 0, peso=0;
		 Scanner sc = new Scanner(System.in);		
		
		
		for (i = 1; i < = 10; i++) {
			do {
		System.out.println("Digite o sexo" +i+"a pessoa (1)feminino, (2)Masculino");
		sexo = sc.nextInt();
		System.out.println("Digite o peso");
		peso = sc.nextInt();
		if (sexo != 1 && sexo!= 2)
			System.out.println("Sexo invalido ");
		
		}
		while (sexo != 1 && sexo!= 2);
		if (sexo == 1 && peso> 50 && peso < 70 ) {
			contF++;}
		else if(sexo == 2 && peso > 60 && peso < 80  ) {
			contM++;
		}
					
		}
			
		System.out.println("Quantidade de mulheres com peso entre 50 e 70: " + contF);
		System.out.println("Quantidade de homens com peso entre 60 e 80:  " + contM);
		sc.close();
		
	}
}
