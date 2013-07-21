/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author desjava
 */
public class test {
    
        public static void main(String args[]) {
           
          SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");

            Date dataDeHoje = new Date();
            
            if(1 == dataDeHoje.getDay()){
                            JOptionPane.showMessageDialog(null, "erro ao listar Jtable");

            }
            
           

            
            
              }
    
    
    
}
