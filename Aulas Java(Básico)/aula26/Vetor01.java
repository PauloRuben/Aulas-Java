package aula26;

public class Vetor01 {
	public static void main(String[] args) {
		//AULA DE VETORES
		
		//objeto n
		//objeto tem atributos e metodos 
		//atributo=caracterustucas metodos=acoes
		
		int n[]= {3,2,8,7,5,4}; //vector n, 6 posições de vetores comecando com 0
		System.out.println("Total de casa de N " + n.length);
		//lenght comprimento do objeto mostrando 6 casas
		for(int c=0; c<=n.length-1; c++) {//contador de 0 a 5, c<=5 tambem serve
			System.out.println("Na posição " + c + " temos valor " + n[c]);
			// n esta na posicao c 
			
		}
	}
}
