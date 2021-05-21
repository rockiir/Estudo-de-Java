package teste;

public class Main {

	public static void main(String[] args) {
		
int vet[] = new int[6];
int numerosJogados[] =   {11,22, 35, 38, 47, 22};
int numerosSorteados[] = {7, 22, 35, 38, 47, 11};
int contador = 0;

for (int i = 0; i < numerosJogados.length; i++){
    for (int j = 0; j < numerosSorteados.length; j++){
        if (numerosJogados[i] == numerosSorteados[j])
            contador++;
    }
}

if (contador == 0)
    System.out.println("Você não teve sorte pois não acertou nenhum número!!");
else if (contador == 6)
    System.out.println("Parabéns!! Você é o novo milionário da sala!!!");
else 
    System.out.println("Você fez " + contador + " ponto(s) na Mega-Sena!!");
    

if(contador==0)System.out.println("Você não teve sorte pois não acertou nenhum número!!");else if(contador==6)System.out.println("Parabéns!! Você é o novo milionário da sala!!!");else System.out.println("Você fez "+contador+" ponto(s) na Mega-Sena!!");

}

}
