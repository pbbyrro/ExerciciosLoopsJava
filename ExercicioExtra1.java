package exerciciosLoops;

import java.util.Scanner;
import java.util.Random;

//Escreva um programa que sorteie um número aleatório entre 0 e 100 e peça ao usuário para adivinhar.
//Enquanto o usuário não acertar o número, o programa não termina o jogo,
//mas diz se o número está muito longe ou mais perto do número escolhido no sorteio.

public class ExercicioExtra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();
		
		int numSorteado = gerador.nextInt(101);
		int numAdivinhado = 0;
		
		while (numSorteado != numAdivinhado) {
			System.out.println("Adivinhe o número sorteado: ");
			numAdivinhado = ler.nextInt();
			
			if(numAdivinhado < 0 || numAdivinhado > 100) {
				System.out.println("Insira um número entre 0 e 100.");
			}
			if (Math.abs(numSorteado - numAdivinhado) > 10) {
				System.out.println("Você está muito longe!");
			} else if(numSorteado != numAdivinhado) {
				System.out.println("Você está mais perto!");
			}
		}
		if(numSorteado == numAdivinhado) {
			System.out.println("Você acertou!");
		}
	}

}
