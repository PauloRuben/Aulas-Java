package aula10;

public class OperadoresLogicos {
	public static void main(String[] args) {
		int x, y , z;
		x = 4;
		y = 7;
		z = 12;
		boolean r;
		//r = (x<y && y<z)?true:false; //Usando tabela verdade
		
		//Atalho para o pipe(|) altL + 1 + 2 + 4(No teclado da calculardora)
		//r =(x<y || y==z)?true:false;
		
		r =(x<y ^ y==z)?true:false;//Simbolo exclusivo 
		
		System.out.println(r);
	}
}
