/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asrivo310323;
import java.io.*;
/**
 *
 * @author Asrivo MKP
 */
public class Latihan652 //no1 statement if-else bufferedReader
{
     public static void main (String [] args){
          BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
          String x = "";
          
          try {
              System.out.print("masukan angka 1-10 = ");
              x = dataIn.readLine();
          }catch (IOException e){
              System.out.println("Error!");
          }
          int a;
          a = Integer.parseInt(x);
          if (a == 1)
          {
            System.out.println("SATU");
          }else if(a == 2)
          {
              System.out.println("DUA");
          }else if(a == 3)
          {
              System.out.println("TIGA");
          }else if(a == 4)
          {
              System.out.println("EMPAT");
          }else if(a == 5)
          {
              System.out.println("LIMA");
          }else if(a == 6)
          {
              System.out.println("ENAM");
          }else if(a == 7)
          {
              System.out.println("TUJUH");
          }else if(a == 8)
          {
              System.out.println("DELAPAN");
          }else if(a == 9)
          {
              System.out.println("SEMBILAN");
          }else if(a == 10)
          {
              System.out.println("SEPULUH");
          }
          else 
          {
              System.out.println("Invalid Number");
          }
      }
}
