package aula03;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do aluno:");	
		String nome = teclado.nextLine();//Coloca o nome
		System.out.println("Digite a nota do aluno:");
		float nota = teclado.nextFloat();//Coloca a nota
		System.out.printf("A nota de %s é %.2f \n", nome, nota);
	}
}
