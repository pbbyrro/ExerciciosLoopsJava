package exerciciosLoops;

import java.util.Scanner;

//Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento e precisam de um sistema para analisar os dados.
//Escreva um algoritmo em Java, que leia via teclado as seguintes informações de cada colaborador:
//Idade (Número inteiro)
//Identidade de Gênero (Número Inteiro): 
//1 – Mulher Cis
//2 - Homem Cis
//3 - Não Binário
//4 - Mulher Trans
//5 - Homem Trans
//6 - Outros
//Pessoa Desenvolvedora (Número Inteiro):
//1 – Backend
//2 - Frontend
//3 - Mobile
//4 - FullStack
//Após digitar a categoria, o sistema deverá perguntar ao usuário se ele deseja continuar a leitura dos dados de um novo colaborador ou não (S/N).
//Caso seja pressionada a tecla N, mostre na tela:
//O número de pessoas desenvolvedoras Backend
//O número de Mulheres Cis e Trans desenvolvedoras Frontend
//O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
//O número de Não Binários desenvolvedores FullStack menores de 30 anos
//O número total de pessoas que responderam à pesquisa
//A média de idade das pessoas que responderam à pesquisa

public class ExercicioWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		int idade = 0, identidadeGenero = 0, pessoaDesenvolvedora = 0;
		String continuar = "S";
		int mulherCis = 0;
		int homemCis = 0;
		int naoBinario = 0;
		int mulherTrans = 0;
		int homemTrans = 0;
		int outros = 0;
		int backend = 0;
		int frontend = 0;
		int mobile = 0;
		int fullStack = 0;
		int totalPessoas = 0;
		int totalIdade = 0;

		while (continuar.equals("S")) {
			System.out.println("Idade: ");
			idade = ler.nextInt();
			totalPessoas++;
			totalIdade += idade;
			ler.nextLine();

			System.out.println("Identidade de Gênero:");
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			identidadeGenero = ler.nextInt();
			ler.nextLine();

			switch (identidadeGenero) {
			case 1:
				mulherCis++;
				break;
			case 2:
				homemCis++;
				break;
			case 3:
				naoBinario++;
				break;
			case 4:
				mulherTrans++;
				break;
			case 5:
				homemTrans++;
				break;
			case 6:
				outros++;
				break;
			}

			System.out.println("Pessoa Desenvolvedora:");
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			pessoaDesenvolvedora = ler.nextInt();
			ler.nextLine();

			switch (pessoaDesenvolvedora) {
			case 1:
				backend++;
				break;
			case 2:
				frontend++;
				break;
			case 3:
				mobile++;
				break;
			case 4:
				fullStack++;
				break;
			}

			System.out.println("Deseja continuar (S/N): ");
			continuar = ler.nextLine();
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
		
		if((identidadeGenero == 1 || identidadeGenero == 4) && pessoaDesenvolvedora == 2) {
			System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + (mulherCis + mulherTrans));
		} else {
			System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: 0");
		}
		if((identidadeGenero == 2 || identidadeGenero == 5) && pessoaDesenvolvedora == 3 && idade > 40) {
			System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + (homemCis + homemTrans));
		} else {
			System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: 0");
		}
		if(identidadeGenero == 3 && pessoaDesenvolvedora == 4 && idade < 30) {
			System.out.println("Total de pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBinario);
		} else {
			System.out.println("Total de pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: 0");
		}
		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
		System.out.println("A media de idade das pessoas que responderam à pesquisa: " + (double) totalIdade/totalPessoas);
		
	}

}


