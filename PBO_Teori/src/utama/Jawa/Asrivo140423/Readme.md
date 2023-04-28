Penjelasan Modul 7


public class latihan71 {
     public static void main(String[] args){
        
        String days[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
         int i = 0;
         do
         {
             System.out.println(days[i]);
             i++;
             
         }while(i<days.length);
    
}
}

Kodingan di atas adalah program Java yang menggunakan perulangan do-while untuk mencetak nama-nama hari dalam bahasa Indonesia.

Program ini memiliki struktur yang mirip dengan kodingan sebelumnya. Pertama, program mendefinisikan sebuah array String bernama `days` yang berisi nama-nama hari dalam bahasa Indonesia.

Selanjutnya, variabel integer `i` diinisialisasi dengan nilai 0. Variabel `i` akan digunakan sebagai indeks untuk mengakses elemen-elemen dalam array `days`.

Perulangan do-while digunakan untuk mengiterasi melalui array `days` dan mencetak setiap elemennya. Di dalam perulangan, program mencetak elemen array `days` pada indeks `i`, kemudian `i` ditambah 1. Setelah itu, program melakukan pengecekan apakah `i` kurang dari panjang array `days` menggunakan `days.length` sebagai kondisi perulangan. Perulangan akan terus berlanjut selama `i` kurang dari panjang array `days`.

Output dari program ini juga akan berupa nama-nama hari dalam bahasa Indonesia yang dicetak secara berurutan:

```
Senin
Selasa
Rabu
Kamis
Jumat
Sabtu
Minggu
```

Kode ini telah menggunakan `days.length` sebagai kondisi perulangan, sehingga jika jumlah elemen dalam array `days` berubah di masa depan, perulangan tetap akan berjalan dengan benar.


public class latihan71dowhile 
{
     public static void main (String [] args){
        String hari [] = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
        
        int i =0;
        do
        {
            System.out.println(hari[i]);
            i++;
        }while (i<7);
    }
}


Kodingan di atas adalah program Java yang menggunakan perulangan do-while untuk mencetak nama-nama hari dalam bahasa Indonesia.

Program ini memiliki struktur yang mirip dengan kodingan sebelumnya. Pertama, program mendefinisikan sebuah array String bernama `days` yang berisi nama-nama hari dalam bahasa Indonesia.

Selanjutnya, variabel integer `i` diinisialisasi dengan nilai 0. Variabel `i` akan digunakan sebagai indeks untuk mengakses elemen-elemen dalam array `days`.

Perulangan do-while digunakan untuk mengiterasi melalui array `days` dan mencetak setiap elemennya. Di dalam perulangan, program mencetak elemen array `days` pada indeks `i`, kemudian `i` ditambah 1. Setelah itu, program melakukan pengecekan apakah `i` kurang dari panjang array `days` menggunakan `days.length` sebagai kondisi perulangan. Perulangan akan terus berlanjut selama `i` kurang dari panjang array `days`.

Output dari program ini juga akan berupa nama-nama hari dalam bahasa Indonesia yang dicetak secara berurutan:

```
Senin
Selasa
Rabu
Kamis
Jumat
Sabtu
Minggu
```

Kode ini telah menggunakan `days.length` sebagai kondisi perulangan, sehingga jika jumlah elemen dalam array `days` berubah di masa depan, perulangan tetap akan berjalan dengan benar.


import javax.swing.*;

public class latihan72JoptionPane 
{
    public static void main (String [] args){
      int[] nomor = new int [11];
      int max,i; 
      
      
      for (i=1;i+1<=nomor.length;i++){
          nomor[i]=Integer.parseInt(JOptionPane.showInputDialog("Masukan nomor" + i));
      }
      max=nomor[0];
      for (i=1;i+1<=nomor.length;i++){
      if(nomor[i]>max){
                    max=nomor[i];
                }
      }
       JOptionPane.showMessageDialog(null,"nilai tertinggi adalah = " +max);
    }
}


​JOptionPaneuntuk

Pnomordengan

Selforuntuk mengnomor.JOptionPane.showInputDialoguntuk memnomor.Integer.parseIntdan

Mengaturmaxdengan nilainomor(ynomor[0]).forlaginomor. Dmax.max,maxakan diperbarui dengan

AkJOptionPane.showMessageDialoguntuk

Kucingforyangi<nomor.lengthsebagaii+1<=nomor.lengthsebagaii<nomor.lengthuntuk


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


Kodingan di atas adalah program Java yang menggunakan `BufferedReader` untuk meminta input dari pengguna melalui keyboard dan menemukan nilai tertinggi di antara input tersebut.

Pertama, program mengimpor kelas `BufferedReader` dan `InputStreamReader` dari paket `java.io`. Ini diperlukan untuk membaca input dari pengguna melalui `System.in` (keyboard).

Selanjutnya, program menggunakan `BufferedReader` untuk membaca input dari pengguna. Baris ini menginisialisasi objek `dataIn` yang digunakan untuk membaca input melalui `System.in`.

Program juga mendefinisikan sebuah array integer bernama `nomor` dengan panjang 10. Array ini akan digunakan untuk menyimpan input dari pengguna.

Kemudian, program menggunakan perulangan `for` untuk mengiterasi melalui array `nomor`. Dalam setiap iterasi, program mencetak pesan "Masukan nomor <i> = " dan menggunakan `Integer.parseInt(dataIn.readLine())` untuk membaca input dari pengguna dan mengubahnya menjadi tipe data integer. Nilai tersebut kemudian disimpan di elemen yang sesuai dalam array `nomor`.

Selanjutnya, program menginisialisasi variabel `max` dengan nilai elemen pertama array `nomor` (yaitu `nomor[0]`). Kemudian, program menggunakan perulangan `for` lagi untuk mencari nilai tertinggi dalam array `nomor`. Dalam setiap iterasi, program membandingkan nilai elemen saat ini dengan `max`. Jika nilai elemen tersebut lebih besar dari `max`, maka `max` akan diperbarui dengan nilai tersebut.

Setelah itu, program menggunakan perulangan `for` untuk mencetak isi array `nomor` dengan menggunakan `System.out.println`.

Terakhir, program mencetak nilai tertinggi yang ditemukan dengan menggunakan `System.out.println`.

Penting untuk memperhatikan bahwa dalam blok `try`, program menangani kemungkinan terjadi `IOException` saat membaca input dengan `BufferedReader`. Jika terjadi kesalahan, program akan mencetak "Error!".

Ini adalah contoh penggunaan `BufferedReader` untuk membaca input dari pengguna melalui keyboard dan melakukan operasi perhitungan sederhana pada input tersebut.
  
  
  public class latihan73 
{
    public static void main (String [] args){
        String [][] entry = {{"Florence", "735-1234", "Manila"},{"Joyce", "983-3333", "Quezon City"}, {"Becca", "456-3322", "Manila"}};
        
        int i=0;
        do{
            System.out.println("Name : " + entry[i][0]);
            System.out.println("Tel.# : " +entry [i][1]);
            System.out.println("Address : " + entry[i][2]);
            i++;
        
        }while(i<3);
        
    }
}

                     
The given code is a Java program that uses a do-while loop to print the entries stored in a 2-dimensional array.

The program defines a 2-dimensional array named `entry`. Each row in the array represents a set of data consisting of a name, telephone number, and address.

The do-while loop is used to iterate through the `entry` array and print each entry. Within the loop, the program prints the name (`entry[i][0]`), telephone number (`entry[i][1]`), and address (`entry[i][2]`) of each entry. After that, the variable `i` is incremented by 1. The loop continues as long as `i` is less than 3.

The output of this program will print the entries in the following format:

```
Name : Florence
Tel.# : 735-1234
Address : Manila

Name : Joyce
Tel.# : 983-3333
Address : Quezon City

Name : Becca
Tel.# : 456-3322
Address : Manila
```

The do-while loop is used here because the program wants to perform at least one iteration, which is to print at least one entry. After that, the program checks the loop condition after each iteration, and it will continue as long as the condition is true (i.e., `i` is less than 3 in this case).
