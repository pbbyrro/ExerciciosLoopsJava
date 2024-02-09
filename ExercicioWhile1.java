package exerciciosLoops;

//Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
//via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos.
//A leitura dos dados deve ser finalizada ao digitar uma idade negativa.

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int idadeMenorDe21 = 0, idadeMaiorDe50 = 0, idade;
		
		System.out.println("Digite uma idade: ");
		
		while (true) {
			idade = ler.nextInt();
			if (idade < 0) {
				break;
			} if (idade < 21) {
				idadeMenorDe21++;
			} else if (idade > 50) {
				idadeMaiorDe50++;
			}
			System.out.println("Digite uma idade: ");
		
		}
		System.out.println("Total de pessoas menores de 21 anos: " + idadeMenorDe21);
		System.out.println("Total de pessoas maiores de 50 anos: " + idadeMaiorDe50);
		
	}

}
