package aula10;

public class CompararString {
	
	public static void main(String[] args) {
		String nome1 = "Joao";
		String nome2 = "Joao";
		String nome3 = new String("Joao");
		String res;
		//equals é a mesma coisa que ==
		res =(nome1.equals(nome2))?"igual":"diferente";
		//res = (nome1==nome2)?"igual":"diferente";
		System.out.println();
	}
}
