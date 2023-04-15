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
public class Latihan652JOptionPane //JoptionPane statement if-else
{
    public static void main(String [] args){
        String x = "";
        
        x = JOptionPane.showInputDialog("Masukan Angka 1-10 = ");
        int a = Integer.parseInt(x);
        String msg;
        if (a==1)
        {
            msg = "SATU";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (a==2)
        {
            msg = "DUA";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (a==3)
        {
            msg = "TIGA";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (a==4)
        {
            msg = "EMPAT";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (a==5)
        {
            msg = "LIMA";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (a==6)
        {
            msg = "ENAM";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (a==7)
        {
            msg = "TUJUH";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (a==8)
        {
            msg = "DELAPAN";
            JOptionPane.showMessageDialog(null, msg);
        }else if (a==9)
        {
           msg = "SEMBILAN";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if (a==10)
        {
            msg = "SEPULUH";
            JOptionPane.showMessageDialog(null, msg);
        }
        else
        {
          msg = "INVALID NUMBER";
            JOptionPane.showMessageDialog(null, msg);  
        }
       
    }
}
