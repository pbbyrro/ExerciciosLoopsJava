package exerciciosLoops;

import java.util.Scanner;

//Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado.
// Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3

public class ExercicioDoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int numero, somaMultiplosDe3 = 0, quantidadeMultiplosDe3 = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			
			if(numero % 3 == 0) {
				somaMultiplosDe3 += numero;
				quantidadeMultiplosDe3++;
			}
		} while (numero != 0);
		
		if (quantidadeMultiplosDe3 != 0) {
            float media = (float) somaMultiplosDe3 / quantidadeMultiplosDe3;
            System.out.println("A média de todos os números múltiplos de 3 é: " + media);
        } else {
            System.out.println("Nenhum número múltiplo de 3 foi digitado.");
        }
	}

}
