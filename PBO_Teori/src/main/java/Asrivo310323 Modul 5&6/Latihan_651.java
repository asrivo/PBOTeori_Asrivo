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
public class Latihan_651 //no2
{
    public static void main (String [] args) {
        int nilai1,nilai2,nilai3;
        double average;
        
       String a = JOptionPane.showInputDialog("enter nilai 1");
        nilai1 = Integer.parseInt(a);
        System.out.println(nilai1);
       String b = JOptionPane.showInputDialog("enter nilai 2");
        nilai2 = Integer.parseInt(b);
        System.out.println(nilai2);
       String c = JOptionPane.showInputDialog("enter nilai 3");
        nilai3 = Integer.parseInt(c);
        System.out.println(nilai3);
        
        average = (nilai1 + nilai2 + nilai3)/3;
            if (average >= 60.0) {
                String msg = "rata-rata anda adalah " + average + ":-)";
                JOptionPane.showMessageDialog(null, msg);
            }else{
              String msg = "rata-rata anda adalah" + average + ":-(";
               JOptionPane.showMessageDialog(null, msg);  
            }
  }
}
