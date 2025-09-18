package aula13;

import java.util.Scanner;

public class SistemaIdade {

	public static void main(String[] args) {
		//AULA CONDICIONAL COMPOSTA
		
		Scanner t = new Scanner(System.in);//usando a função da classe scanner
		System.out.println("Em que ano você nasceu?:");
		int nasc = t.nextInt();//usando a função next da classe scanner
		//para colocar o numero intero
		int i = 2025 - nasc;
		System.out.println("Sua idade é: " + i);
		if(i >=18) {
			System.out.println("Você é maior de idade.");
		}
		else {
			System.out.println("Você é menor de idade.");
		}
		
		t.close();
	}

}
