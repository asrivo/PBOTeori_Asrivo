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
public class Latihan651 //no1
{
    public static void main(String[] args){
        int nilai1,nilai2,nilai3;
        double average;
        BufferedReader data = new BufferedReader (new InputStreamReader (System.in));
        //System.out.println("enter nilai 1 = ");
      
        try {
            System.out.print("enter nilai 1 : ");
            nilai1 = Integer.parseInt(data.readLine());
            System.out.print("enter nilai 2 : ");
            nilai2 = Integer.parseInt(data.readLine());
            System.out.print("enter nilai 3 : ");
            nilai3 = Integer.parseInt(data.readLine());
            
            average = (nilai1 + nilai2 + nilai3)/3;
            System.out.println("rata-ratanya adalah = " + average);
            if (average > 60) System.out.println(":-)");
             else             System.out.println(":-(");
            
            average = Integer.parseInt(data.readLine());
           }
        catch (IOException e){
            System.out.println("Error!");}
            
    }
    
}
