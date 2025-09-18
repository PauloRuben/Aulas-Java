package aula26;

import java.util.Arrays;

public class Vetor04 {
	public static void main(String[] args) {
		int vet[] = {3, 7, 6, 1, 9, 4, 2};
		Arrays.sort(vet);//ordena primeiro
		for(int v:vet) {//v de valor e vet de vetor

			System.out.println(v + " ");//Vazio no "" e o espaço
		}
		System.out.println("");//Pulando uma linha
		int p =Arrays.binarySearch(vet, 4); //procurando o valor 1 
		System.out.println("Encontrei o valor na posição: " + p);
	}
}
