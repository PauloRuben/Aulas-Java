package aula13;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a Primeira Nota:");
		float n1 = teclado.nextFloat();
		System.out.println("Segunda Nota:");
		float n2 = teclado.nextFloat();
		System.out.println("Terceira Nota:");
		float n3 = teclado.nextFloat();
		System.out.println("Quarta Nota:");
		float n4 = teclado.nextFloat();
		
		float media = (n1 + n2 + n3 + n4) /4;
		float m = media;
		System.out.println("Sua média: " + m);
		if(m>= 7){
			System.out.println("Parabéns você tem uma boa nota!!");
		}
		else if(m >= 5) {
			System.out.println("Você ainda pode melhorar, más muito bem!");
		}
		else if(m >= 3) {
			System.out.println("Você está de recuperação");
		}
		else{
			System.out.println("Sinto muito, você está de reprovado");
		}
		teclado.close();
	}
}
