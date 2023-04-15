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
public class Latihan_652 //no 2 buffredreader statement switch
{
    public static void main (String [] args){
    BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
    
    String x = "";
    
    try {
        System.out.print("Masukan angka 1-10 : ");
        x = dataIn.readLine();
    }catch (IOException e){
        System.out.println("Error!");
    }
    
    int a;
    a = Integer.parseInt(x);
    
    switch(a){
        case 1:
            System.out.println("SATU");
            break;
        case 2:
            System.out.println("DUA");
            break;
        case 3:
            System.out.println("TIGA");
            break;
        case 4:
            System.out.println("EMPAT");
            break;
        case 5:
            System.out.println("LIMA");
            break;
        case 6:
            System.out.println("ENAM");
            break;
        case 7:
            System.out.println("TUJUH");
            break;
        case 8:
            System.out.println("DELAPAN");
            break;
        case 9:
            System.out.println("SEMBILAN");
            break;
        case 10:
            System.out.println("SEPULUH");
            break;
        default:
            System.out.println("Invalid Number");
            
        }
    }
}
