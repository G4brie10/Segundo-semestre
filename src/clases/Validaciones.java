/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

//import javax.swing.JOptionPane;

/**
 *
 * @author gaodg
 */
public class Validaciones {
    public String validarEnteros(String numero){
        int c=0 ;
        String a;
        for(int x=0;x<numero.length();x++){
            //JOptionPane.showMessageDialog(null, numero.charAt(x));
            if (numero.charAt(x)=='.'){
                c++;
            
            } 
            }
        if (c==1){
            a = "decimal";
        }else{
            a = "entero";
        }
        
        return a;
    }
}
