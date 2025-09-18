package aula10;

public class OperadoresTernarios {
	public static void main(String[] args) {
		int  n1, n2 , r;
		n1 = 14;
		n2 = 18;
		
		/*
	 	aqui o resultado dependera de qual variavel for maior
		sendo assim ou ele vai somar(true) as variaveis ou diminuir(false)
		*/
		
		r = (n1>n2)?n1+n2:n1-n2 ;
		System.out.println(r);
	}
}
