/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asrivo140423;

/**
 *
 * @author Asrivo MKP
 */

import javax.swing.*;

public class latihan72JoptionPane 
{
    public static void main (String [] args){
      int[] nomor = new int [11];
      int max,i; 
      
      
      for (i=1;i+1<=nomor.length;i++){
          nomor[i]=Integer.parseInt(JOptionPane.showInputDialog("Masukan nomor" + i));
      }
      max=nomor[0];
      for (i=1;i+1<=nomor.length;i++){
      if(nomor[i]>max){
                    max=nomor[i];
                }
      }
       JOptionPane.showMessageDialog(null,"nilai tertinggi adalah = " +max);
    }
}
