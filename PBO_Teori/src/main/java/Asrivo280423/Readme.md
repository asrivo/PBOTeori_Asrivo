Readme Modul 8


public class Latihan841 {
    public static void main ( String[]args){
        for(int i=0; i<=4; i++)
        System.out.println("\n" +args[i]);
         
    }


Kodingan di atas merupakan contoh program Java dengan menggunakan class `Latihan841`. Program tersebut memiliki method `main` yang akan dieksekusi saat program dijalankan.

Pada baris pertama di dalam method `main`, terdapat sebuah perulangan `for` yang akan berjalan selama variabel `i` memiliki nilai mulai dari 0 hingga 4. Setiap iterasi perulangan, baris selanjutnya akan dieksekusi.

Pada baris kedua di dalam perulangan, terdapat perintah `System.out.println("\n" + args[i])`. Perintah ini bertujuan untuk mencetak (print) argumen ke layar. Argumen yang dicetak adalah nilai dari elemen array `args` pada indeks `i`.

Sebagai contoh, jika program dijalankan dengan memberikan argumen sebagai berikut:
```
java Latihan841 arg1 arg2 arg3 arg4 arg5
```
Maka program akan mencetak nilai argumen satu per satu pada setiap iterasi perulangan, dengan dipisahkan oleh baris baru (dikarenakan karakter escape `\n` yang ada sebelum mencetak argumen). Output yang dihasilkan akan seperti ini:
```
arg1
arg2
arg3
arg4
arg5
```

Namun, perlu diingat bahwa program di atas perlu memastikan bahwa terdapat setidaknya 5 argumen yang diberikan saat menjalankan program. Jika argumen kurang dari 5, maka akan terjadi `ArrayIndexOutOfBoundsException`, karena mencoba mengakses indeks yang tidak ada dalam array `args`.


import java.util.Scanner;
public class AritmaticOperasi {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);

      Scanner in=new Scanner(System.in);

      //aritmatika tambah
      int sum;
      sum= a + b;

      //aritmatika kurang
      int difference;
      difference = a - b;

      //aritmatika kali
      int product;
      product = a * b;

      //aritmatika bagi
      int quotient;
      quotient = a / b;

      //output
      System.out.println("Sum       ="+sum);
      System.out.println("Different ="+difference);
      System.out.println("Product   ="+product);
      System.out.println("Quotient  ="+quotient);
                                   }
}


Kodingan di atas adalah contoh program Java yang melakukan operasi aritmatika sederhana menggunakan dua argumen yang diberikan saat menjalankan program. 

Pada baris pertama di dalam method `main`, nilai argumen pertama (`args[0]`) diubah menjadi tipe data `int` dan disimpan dalam variabel `a`. Nilai argumen kedua (`args[1]`) juga diubah menjadi tipe data `int` dan disimpan dalam variabel `b`. Ini diasumsikan bahwa program dijalankan dengan memberikan dua argumen saat menjalankannya.

Selanjutnya, program menggunakan kelas `Scanner` untuk membaca input dari pengguna. Ini memungkinkan pengguna untuk memasukkan nilai `a` dan `b` selain melalui argumen saat menjalankan program. Namun, dalam kodingan yang diberikan, objek `Scanner` tidak digunakan lebih lanjut dan tidak ada input yang diminta dari pengguna. Jadi, bagian ini tidak berpengaruh pada hasil program.

Setelah itu, program melakukan beberapa operasi aritmatika sederhana:
- Penjumlahan: Variabel `sum` akan berisi hasil penjumlahan `a + b`.
- Pengurangan: Variabel `difference` akan berisi hasil pengurangan `a - b`.
- Perkalian: Variabel `product` akan berisi hasil perkalian `a * b`.
- Pembagian: Variabel `quotient` akan berisi hasil pembagian `a / b`.

Selanjutnya, program mencetak hasil operasi aritmatika ke layar menggunakan perintah `System.out.println`. Setiap hasil operasi aritmatika dicetak dengan pesan yang sesuai.

Misalnya, jika program dijalankan dengan argumen `20` dan `4`, maka output yang dihasilkan akan menjadi:
```
Sum       = 24
Different = 16
Product   = 80
Quotient  = 5
```
Output tersebut merupakan hasil dari operasi aritmatika yang dilakukan terhadap nilai `a` dan `b`.

