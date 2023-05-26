/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asrivo260523;

/**
 *
 * @author Asrivo MKP
 */
public class Circle extends Shape{
    private int r;
    
    public Circle() {
        System.out.println("Konstruktor Circle");
    }
    Circle(int r) {
        this.r=r;
      }
    public void setJari(int r){
         this.r=r;
       }
       
       public int getJari(){
           return r;
        }
    @Override
    public String getNama(){
        String nama = "Lingkaran";
        return nama;
    }
       @Override
    public float getArea(){
    float area;
    area = (float)(3.14 *r*r);
    return area;
    }
    
    public static void main (String[] args){
        Circle bangun1 = new Circle();
        bangun1.setJari(3);
        
        System.out.println("Nama  = " + bangun1.getNama());
        System.out.println("Jari-Jari Linkaran = " + bangun1.getArea());
            
        
        
    }
}
