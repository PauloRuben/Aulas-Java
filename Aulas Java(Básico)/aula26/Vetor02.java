package aula26;

public class Vetor02 {

	public static void main(String[] args) {
		//PORJETO MESES
		
		String mes[] = {"Jan","Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		
		int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		//segundo vetor tot
		for(int c=0; c<mes.length; c++) {//c é contador
			System.out.println("O mes de " + mes[c] + " tem " + tot[c] + " dias ao todo");
			//mes na posição c e tot nma posicao c
		}
	}

}
