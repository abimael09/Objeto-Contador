package Objeto_Contador;

import javax.swing.*;

public class Contador {
    
    int num;
    
    public void Construtor() {
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Informe um Número:"));
        System.out.println("N° = " + num);
    }
    
    public void setIncrementaNum() {
        
        num++;
        System.out.println("N° = " + num);
    }
    
    public void setDecrementaNum() {
        
        --num;
        System.out.println("N° = " + num);
    }
    
    
}
