/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio5ques2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Desafio5ques2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int numero, acusimanum;
    Scanner teclado = new Scanner (System.in);
    numero = 1; acusimanum =0;

    while(numero != 0){
        numero = Integer.parseInt(JOptionPane.
                showInputDialog("Informe um numero ou zero para sair:"));
        acusimanum = acusimanum +numero;

                }
  JOptionPane.showMessageDialog(null, "A soma de todos os valores digitados é:"+acusimanum);


   }
}
