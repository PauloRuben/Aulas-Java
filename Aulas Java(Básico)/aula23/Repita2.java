package aula23;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Repita2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;
        int soma = 0;
        int qtdPares = 0;
        int qtdImpares = 0;
        int acimaDe100 = 0;

        do {
            String input = JOptionPane.showInputDialog("Digite um número inteiro (0 para parar):");
            if (input == null) break; // Cancelar se não tiver nada escrito
            numero = Integer.parseInt(input);

            if (numero != 0) {
                numeros.add(numero);
                soma += numero;

                if (numero % 2 == 0) {
                    qtdPares++;//Decrementa para mostrar quantos pares tem
                } else {
                    qtdImpares++;//Decrementa para mostrar quantos impares tem
                }

                if (numero >= 100) {
                    acimaDe100++;//Decrementa para mostrar quantos numeros 100 tem
                }
            }

        } while (numero != 0);

        if (numeros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum número foi digitado.");
        } else {
            double media = (double) soma / numeros.size();//size mostra quantos numeros tem de acordo

            String mensagem = "<html>"
                    + "Números digitados: " + numeros + "<br>"
                    + "Quantidade de pares: " + qtdPares + "<br>"
                    + "Quantidade de ímpares: " + qtdImpares + "<br>"
                    + "Números maiores ou iguais a 100: " + acimaDe100 + "<br>"
                    + "Soma dos números: " + soma + "<br>"
                    + String.format("Média dos números: %.2f", media)
                    + "</html>";

            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}