README MODUL 12 - Penanganan Exception dalam Java Repository ini berisi program Java yang menunjukkan penanganan exception menggunakan blok try-catch-finally. Program ini dirancang untuk menangani ArrayIndexOutOfBoundsException ketika mengakses elemen array di luar ukurannya.

Prasyarat Untuk menjalankan program ini, pastikan Anda memiliki yang berikut ini terpasang:

Java Development Kit (JDK) - versi 8 atau yang lebih tinggi Antarmuka baris perintah atau Integrated Development Environment (IDE) Cara Menjalankan Clone repository ini atau unduh file Exception.java. Buka antarmuka baris perintah atau IDE dan arahkan ke direktori tempat file Exception.java berada. Kompilasi file Java dengan menjalankan perintah berikut: php

javac Exception.java Setelah kompilasi berhasil, jalankan program menggunakan perintah berikut: php

java Exception arg1 arg2 arg3 ... Ganti arg1, arg2, arg3, dan seterusnya dengan argumen baris perintah yang diinginkan. Deskripsi Program Program Java Exception.java ini menjelaskan penggunaan penanganan exception. Program mencoba mengakses argumen baris perintah yang dilewatkan saat runtime menggunakan perulangan berbasis indeks. Namun, karena perulangan ini berjalan tanpa batas (for (int i = 0; true; i++)), pada akhirnya akan menimbulkan ArrayIndexOutOfBoundsException ketika mencoba mengakses elemen array di luar ukurannya.

Untuk menangani exception ini, program menggunakan blok try-catch. Blok try berisi kode yang mungkin menimbulkan exception. Di dalam blok try, setiap argumen baris perintah dicetak bersama dengan indeks yang sesuai.

Jika terjadi ArrayIndexOutOfBoundsException, program menangkap exception tersebut di blok catch. Program mencetak pesan kesalahan yang menunjukkan bahwa exception telah ditangkap dan mencetak informasi exception tersebut. 

Kelas Modul12Latihan java

public class Modul12Latihan {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
Kelas Modul12Latihan memiliki metode main yang sederhana. 
Program ini hanya mencetak pesan "Hello World!" ke konsol.


Kelas Exception java

public class TestExceptions {
    public static void main(String[] args) {
        try {
            for (int i = 0; true; i++) {
                System.out.println("args[" + i + "]=" + args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException i) {
            System.out.println("Exception caught:");
            System.out.println(i);
            System.out.println("Quitting...");
        }
    }
}

Kelas Exception memiliki metode main sebagai titik masuk program. Dalam metode ini, terdapat sebuah blok try-catch-finally untuk menangani exception. Program mencoba untuk mengakses elemen-elemen array args menggunakan perulangan for. Namun, perulangan ini tidak memiliki batas (true), sehingga pada akhirnya akan menimbulkan ArrayIndexOutOfBoundsException ketika mencoba mengakses elemen array di luar ukurannya.

Dalam blok try, setiap elemen array args dicetak bersama dengan indeks yang sesuai. Jika terjadi ArrayIndexOutOfBoundsException, program menangkap exception tersebut di blok catch dan mencetak pesan kesalahan yang menunjukkan bahwa exception telah ditangkap beserta informasi exceptionnya. Terakhir, dalam blok finally, program mencetak pesan "Quitting..." yang menandakan bahwa program selesai.


Kelas TestExceptions java

public class TestExceptions {
    public static void main(String[] args) {
        try {
            for (int i = 0; true; i++) {
                System.out.println("args[" + i + "]=" + args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException i) {
            System.out.println("Exception caught:");
            System.out.println(i);
            System.out.println("Quitting...");
        }
    }
}

Kelas TestExceptions juga memiliki metode main. Program ini mirip dengan kelas Exception, di mana program mencoba mengakses elemen-elemen array args menggunakan perulangan for tanpa batas (true). 
Namun, dalam blok catch, parameter exception yang digunakan diberi nama i, bukan e seperti yang umum digunakan. Pesan kesalahan dan pesan "Quitting..." dicetak ke konsol.
Perlu diperhatikan bahwa pada kelas Exception dan TestExceptions, penggunaan nama kelas yang sama dengan Exception bawaan Java tidak disarankan karena dapat menimbulkan kebingungan. 
Sebaiknya gunakan nama kelas yang berbeda untuk menghindari konflik dengan kelas bawaan Java.
