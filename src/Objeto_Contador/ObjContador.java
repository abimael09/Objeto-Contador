package Objeto_Contador;

import javax.swing.*;

public class ObjContador {

    public static void main(String[] args) {
        // Base de prática POO
        Contador obj = new Contador();
        
        int op = 0;
        while ((op == 4) == false) {
            op = Integer.parseInt(JOptionPane.showInputDialog("Informe a Opcão:\n\n1 - Número Contador\n2 - Incrementa Número\n3 - Descrementa Número\n4 - Sair\n\n"));
            if (op == 0){
                JOptionPane.showMessageDialog(null, "        Opção Inválida.");        
            } else {
                switch(op){
                    case 1:{
                        obj.Construtor();
                    }
                    break;
                    case 2:{
                        obj.setIncrementaNum();
                    }
                    break;
                    default:{
                        obj.setDecrementaNum();
                    }
                    break;
                }
            }
        }
    }  
}
