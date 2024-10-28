
package sección34mendietaed_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;


public class Sección34MendietaED_pilas {

    
    public static void main(String[] args) {
        // Declaracion de fila 
        Stack<Integer> pilaMendieta =new  Stack<>();
        
        pilaMendieta.push(100);
        pilaMendieta.push(150);
        pilaMendieta.push(230);
        pilaMendieta.push(10);
        pilaMendieta.push(160);
        
        
        JOptionPane.showMessageDialog(null,"Datos en pila ordenados es :\n"+pilaMendieta);
        JOptionPane.showMessageDialog(null,"Autor: Kenya Mendieta Rodriguez  :\n"+pilaMendieta);
    }
    
}
