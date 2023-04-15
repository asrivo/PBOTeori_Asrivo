/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asrivo310323;

/**
 *
 * @author Asrivo MKP
 */
import javax.swing.*;
public class Latihan_652_JOptionPane // JoptionPane statement switch
{
    public static void main (String [] args){
    
        String x ="";
        x = JOptionPane.showInputDialog("Masukan Angka 1-10 :");
       int a = Integer.parseInt(x);
       String msg;
       switch (a)
       {
           case 1:
               msg = "SATU";
               JOptionPane.showMessageDialog(null, msg);
               break;
           case 2:
               msg = "DUA";
               JOptionPane.showMessageDialog(null, msg);
               break;
           case 3:
               msg = "TIGA";
               JOptionPane.showMessageDialog(null, msg);
               break;
           case 4:
               msg = "EMPAT";
               JOptionPane.showMessageDialog(null, msg);
               break;
           case 5:
               msg = "LIMA";
               JOptionPane.showMessageDialog(null, msg);
               break;
           case 6:
               msg = "ENAM";
               JOptionPane.showMessageDialog(null, msg);
               break;
           case 7:
               msg = "TUJUH";
               JOptionPane.showMessageDialog(null, msg);
               break;
           case 8:
               msg = "DELAPAN";
               JOptionPane.showMessageDialog(null, msg);
               break;
           case 9:
               msg = "SEMBILAN";
               JOptionPane.showMessageDialog(null, msg);
               break;
           case 10:
               msg = "SEPULUH";
               JOptionPane.showMessageDialog(null, msg);
               break;
           default:
               msg = "INVALID NUMBER";
               JOptionPane.showMessageDialog(null, msg);
               
       
       }
    }
}
