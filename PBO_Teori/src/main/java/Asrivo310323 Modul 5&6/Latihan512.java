/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asrivo310323;

/**
 *
 * @author Asrivo MKP
 */
import javax.swing.JOptionPane;
public class Latihan512 {
    public static void main ( String[] args) {
        String word1 = "";
        String word2 = "";
        String word3 = "";
        
        word1 = JOptionPane.showInputDialog("enter word1");
        word2 = JOptionPane.showInputDialog("enter word2");
        word3 = JOptionPane.showInputDialog("enter word3");
       
        String msg = word1 + " "  + word2 + " " + word3;
               JOptionPane.showMessageDialog(null, msg);
    }  
}
