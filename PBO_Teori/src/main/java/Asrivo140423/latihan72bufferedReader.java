/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asrivo140423;

/**
 *
 * @author Asrivo MKP
 */

import java.io.*;
public class latihan72bufferedReader 
{
    public static void main (String [] args)
    {
      BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
      
      int[] nomor = new int [10];
      int max,i;
    
      
     try {
          
          max=nomor[0];
            for (i=1;i+1<=nomor.length;i++){
                System.out.print("Masukan nomor "+i+" = ");
                nomor[i] = Integer.parseInt(dataIn.readLine());
                
                if(nomor[i]>max){
                    max=nomor[i];
                }
                      
          }
            
          //System.out.println("isi array");
            for (i=0;i+1<=nomor.length;i++){
                
                System.out.println(" " + nomor[i] + " ");
              }
          System.out.println("max = "+ max);
      }catch (IOException e) {
          System.out.println("Error!");
      }
  }
}
