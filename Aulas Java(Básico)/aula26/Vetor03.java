package aula26;

import java.util.Arrays;

public class Vetor03 {

	public static void main(String[] args) {
		double v[] = {3.5, 3.75, 9, -4.5};
		for(double valor:v) {
			Arrays.sort(v);//o sort arruma a ordem dos numeros,coloca o vetor em ordem
			System.out.println(valor + "");
		}

	}

}
