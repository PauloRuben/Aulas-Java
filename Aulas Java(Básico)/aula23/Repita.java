package aula23; 

import javax.swing.JOptionPane; 

public class Repita { 
    public static void main(String[] args) { 
        
        int n, s = 0; 
        
        do { 
           
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um Numero:  <br> <em> (Valor 0 Interrompe)<em> </html>"));
            
            s += n;
            
        } while (n != 0); 
        
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr> <br> Somatório vale " + s + "<html>");
        
    }    
}