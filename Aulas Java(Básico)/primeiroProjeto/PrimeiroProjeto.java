package primeiroProjeto;

import java.util.Date;

public class PrimeiroProjeto {
	
	public static void main(String[] args) {
		
		/*
		 PUBLICA, ESTÁTICA E O RETORNO DA CLASSE PRINCIPAL E VAZIA
		 (CARACTERES E ARGUMENTOS)
		 */
		
		System.out.println("Olá, Mundo!");
		
		Date relogio = new Date();
		System.out.println("A hora do sistema é");
		System.out.println(relogio.toString());
	}
}
