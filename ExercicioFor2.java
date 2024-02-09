package exerciciosLoops;

import java.util.Scanner;

//Escreva um algoritmo em Java que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número são ímpares

public class ExercicioFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int numerosPares = 0, numerosImpares = 0, i, entrada;
		
		
		for (i = 0; i < 10; i++) {
			System.out.println("Insira o número:");
			entrada = ler.nextInt();
			if(entrada % 2 == 0) {
				numerosPares++;
			} else {
				numerosImpares++;
			}
		}
		System.out.println("Total de números pares: " + numerosPares);
		System.out.println("Total de números impares: " + numerosImpares);
		
	}

}
