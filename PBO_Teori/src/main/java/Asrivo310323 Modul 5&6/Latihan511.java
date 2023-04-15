/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asrivo310323;

/**
 *
 * @author Asrivo MKP
 */
import java.io.*;
public class Latihan511 {
    public static void main ( String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        String word1= "";
        String word2= "";
        String word3= "";
            
        
               
        try {
            System.out.print ("enter word1 :");
            word1 = dataIn.readLine();
            System.out.print ("enter word2 :");
            word2 = dataIn.readLine();
            System.out.print ("enter word3 :");
            word3 = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }
        System.out.println(word1 + " " + word2 + " "  + word3);
    }
    
}
