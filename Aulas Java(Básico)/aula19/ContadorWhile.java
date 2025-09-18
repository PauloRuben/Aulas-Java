package aula19;

public class ContadorWhile {
	/*
	 ESTRUTURA DE REPETIÇÃO NO INÍCIO COM WHILE
	 CC E CONTADOR DE CAMBALHOTA
	 */
	public static void main(String[] args) {

		/*
		 int cc = 1;
		
		while(cc<20) {
			System.out.println("Cambalhota: " + cc);
			cc++;
		}
		*/
		
		int cc = 0;
		while(cc<10) {
			cc++;
			if(cc == 5 || cc == 7 || cc == 9) {
				//ou seja aqui nao vai mostrar o 5, 7 e 9 e vai continuar com o comando continue
				continue;
			}
			if(cc== 8) {
				break;//a partir daqui o codigo para como o breakw
				
			}
			System.out.println("Cambalhota: " + cc);
			
		}
	}

}
