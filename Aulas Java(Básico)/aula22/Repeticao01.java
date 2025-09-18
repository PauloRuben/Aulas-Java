package aula22;

import java.util.Scanner;

public class Repeticao01 {
	public static void main(String[] args) {
		//ESTRUTURA DE REPETIÇAO COM DO WHILE
		//TESTE LOGICO FEITO NO FINAL
		
		/*int cc = 0;
		do {
			System.out.println("Cambalhota");
			cc++;
			
		}while (cc<4);*/
		
	
	int n, s=0; // n é o numero e s é a soma
		String resp;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Digite o numero: ");
			n = teclado.nextInt();
			s += n;// s = s + n;
			System.out.print("Quer continuar? [S/N] ");
			resp = teclado.next();
		}while (resp.equalsIgnoreCase("S")); //senha letra maiuscula ou minuscula.
		System.out.println("A soma de todos os valores é" + s);
		teclado.close();//fecha o metodo scanner
		}
}
