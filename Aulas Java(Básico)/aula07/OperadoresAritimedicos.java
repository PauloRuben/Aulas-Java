package aula07;

public class OperadoresAritimedicos {
	public static void main(String[] args) {
		int n1 = 12;
		int n2 = 5;
		float m = (n1 + n2)/2;
		System.out.println("A média é igual a :" + m);
		
		int numero = 10;
		int valor = 4 + numero--;// -- diminui para 1 é o ++ aumento para 1, dependendo da ordem ele pode funcinar na int se fosse no lado direto ex: --numero 
		System.out.println(valor);
		System.out.println(numero);
		
		int x = 4;
		x *= 2; //x = x * 2; de forma abrevida de vezes(*) 2 no caso x = 4 então resultara em 8 porque 2*4 = *8 
		System.out.println(x);
		
		float y = 8.9f;
		int ar = (int) Math.floor(y);//Está arredondanda para um número para abaixo no caso 8
		int er = (int) Math.ceil(y);//Está arredondanda para um número para cima no caso 9
		int ir = (int) Math.round(y);//Está arredondada aritimeticamente ou seja o mais logico no caso 9
		System.out.println(y);
		System.out.println(ar);
		System.out.println(er);
		System.out.println(ir);
		
		double aleatorio = Math.random();// coloca qualquer numero randomico
		System.out.println(aleatorio);
		
		int alo =(int)(Math.random() * 10);//gera numero aleatorio de 0 a 9
		System.out.println(alo);
		
		double ale = Math.random();
		int n = (int) (5 + ale * (10-5));//numero de 5 a 10
		System.out.println(n);
		
	}
}
