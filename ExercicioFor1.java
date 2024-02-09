package exerciciosLoops;

import java.util.Scanner;

//Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
//onde o primeiro número deve ser menor do que o segundo número.
//Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
//No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.

public class ExercicioFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int a, b, i;
		
		System.out.println("Insira o primeiro número: ");
		a = ler.nextInt();
		System.out.println("Insira o segundo número (deve ser maior que o primeiro: ");
		b = ler.nextInt();
		
		if(a > b) {
			System.out.println("Intervalo inválido!");
			System.exit(0);
		}
		
		System.out.println("No intervalo entre " + a + " e " + b + ": ");
		for (i = a; i <= b; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

}
