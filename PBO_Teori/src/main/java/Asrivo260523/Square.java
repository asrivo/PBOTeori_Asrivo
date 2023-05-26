/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asrivo260523;

/**
 *
 * @author Asrivo MKP
 */
public class Square extends Shape {
    public Square() {
          System.out.println("Konstruktor Square");
    }
    private int s;
    
    Square(int s) {
        this.s=s;
      }
          
     public void setSisi(int s){
         this.s =s;
       }
       
       public int getSisi(){
           return s;
        }
 
    @Override
    public String getNama(){
        String nama = "Persegi";
        return nama;
    }

    @Override
    public float getArea(){
    float area;
    area = s*s;
    return area;
    }
    
    public static void main (String[] args){
        Square bangun1 = new Square();
        bangun1.setSisi(3);
        
        System.out.println("Nama  = " + bangun1.getNama());
        System.out.println("Luas Persegi = " + bangun1.getArea());
            
        
        
    }
}
