public abstract class MakhlukHidup {
    public void bernafas(){
        System.out.println("Bernafas");
    }
    public abstract void jalan();
}

Kode di atas adalah sebuah contoh implementasi dasar dari pewarisan dan penggunaan kelas abstrak dalam bahasa pemrograman Java.

Pada baris ke-5, kita memiliki deklarasi package yaitu `Asrivo230623`. Package digunakan untuk mengorganisir dan mengelompokkan kelas-kelas dalam satu kesatuan.

Kemudian pada baris ke-9, kita memiliki deklarasi kelas abstrak `MakhlukHidup`. Kelas abstrak adalah kelas yang tidak dapat diinstansiasi, tetapi dapat diwarisi oleh kelas-kelas turunannya. 
Kelas abstrak ini memiliki dua metode, yaitu `bernafas()` dan `jalan()`.

Pada baris ke-10, terdapat implementasi metode `bernafas()` yang hanya mencetak teks "Bernafas" ke layar.

Pada baris ke-12, terdapat deklarasi metode abstrak `jalan()`. Metode abstrak tidak memiliki implementasi di kelas abstrak ini, sehingga kelas turunan yang mengimplementasikan kelas ini harus menyediakan implementasi untuk metode `jalan()`.

Kelas ini bertujuan untuk menjadi blueprint atau kerangka dasar untuk kelas-kelas turunan yang mewakili makhluk hidup. Dalam implementasi yang sebenarnya, kelas-kelas turunan ini akan mengimplementasikan metode `jalan()` sesuai dengan perilaku dan 
karakteristik unik dari setiap jenis makhluk hidup yang direpresentasikan.

public class Manusia extends MakhlukHidup {
    public void jalan(){
        System.out.println("Berjalan Manusia");
    }
    
    public static void main(String[] args) {
        Manusia m = new Manusia();
        m.bernafas();
        m.jalan();
    }
}

Kode di atas adalah contoh implementasi pewarisan dan penggunaan kelas dalam bahasa pemrograman Java. 

Pada baris-baris awal, terdapat komentar yang memberikan petunjuk untuk mengubah bagian lisensi dan template file.

Pada baris ke-9, kita memiliki deklarasi kelas `Manusia` yang merupakan turunan dari kelas abstrak `MakhlukHidup`. Dengan menggunakan kata kunci `extends`, kelas `Manusia` mewarisi semua metode dan properti dari kelas `MakhlukHidup`.

Pada baris ke-11, terdapat implementasi metode `jalan()` yang mengoverride metode yang sama dari kelas `MakhlukHidup`. Implementasi ini mencetak teks "Berjalan Manusia" ke layar.

Pada baris ke-15 hingga 18, terdapat metode `main()` yang merupakan metode utama dalam program Java. Pada metode ini, objek `Manusia` dengan nama variabel `m` diinisialisasi dan dibuat menggunakan operator `new`. Kemudian, metode `bernafas()` dan `jalan()` dipanggil pada objek `m` untuk mencetak teks "Bernafas" dan "Berjalan Manusia" ke layar.

Dengan demikian, program ini menciptakan objek `Manusia` dan menggunakan metode yang diwarisi dari kelas abstrak `MakhlukHidup` untuk menunjukkan perilaku dan karakteristik khusus dari manusia.

public class PersegiPanjang implements Relation{
    private float panjang;
    private float lebar;

    public PersegiPanjang() {
    }

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public float getLuas(){
        return panjang * lebar;
    }
    
    public float getKeliling(){
        return (2*panjang)+(2*lebar);
    }

    @Override
    public boolean isGreater(Object a, Object b) {
        float luas_a = ((PersegiPanjang) a).getLuas();
        float luas_b = ((PersegiPanjang) b).getLuas();
        return luas_a > luas_b;
    }

    @Override
    public boolean isLess(Object a, Object b) {
        float luas_a = ((PersegiPanjang) a).getLuas();
        float luas_b = ((PersegiPanjang) b).getLuas();
        return luas_a < luas_b;
    }

    @Override
    public boolean isEqual(Object a, Object b) {
        float luas_a = ((PersegiPanjang) a).getLuas();
        float luas_b = ((PersegiPanjang) b).getLuas();
        return luas_a == luas_b;
    }
    
    public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang(5, 2);
        PersegiPanjang p2 = new PersegiPanjang(4, 3);
        Relation r = new PersegiPanjang();
        System.out.println("Luas p1 > luas p2" + r.isGreater(p1, p2) );
        System.out.println("Luas p1 < luas p2" + r.isLess(p1, p2) );
    }

Kode di atas merupakan contoh implementasi kelas `PersegiPanjang` yang mengimplementasikan antarmuka `Relation`. 

Pada baris ke-1, deklarasi kelas `PersegiPanjang` dimulai dengan kata kunci `public`. Kelas ini juga mengimplementasikan antarmuka `Relation` dengan menggunakan kata kunci `implements`.

Pada baris ke-2 dan ke-3, terdapat deklarasi dua variabel instance `panjang` dan `lebar` dengan tipe data `float`, yang digunakan untuk menyimpan panjang dan lebar persegi panjang.

Pada baris ke-5 hingga ke-8, terdapat konstruktor default `PersegiPanjang()` yang tidak mengambil parameter. Konstruktor ini tidak melakukan operasi apa pun karena tidak ada kode di dalamnya.

Pada baris ke-11 dan ke-12, terdapat konstruktor `PersegiPanjang(int panjang, int lebar)` yang menerima dua parameter `panjang` dan `lebar` dengan tipe data `int`. Konstruktor ini digunakan untuk menginisialisasi nilai panjang dan lebar persegi panjang.

Pada baris ke-15 dan ke-19, terdapat metode `getLuas()` dan `getKeliling()` yang mengembalikan nilai luas dan keliling persegi panjang berdasarkan panjang dan lebar yang disimpan dalam variabel instance.

Pada baris ke-22 hingga ke-24, terdapat implementasi metode `isGreater(Object a, Object b)`, `isLess(Object a, Object b)`, dan `isEqual(Object a, Object b)` yang diwarisi dari antarmuka `Relation`. Metode-metode ini membandingkan luas persegi panjang `a` dan `b` dengan menggunakan metode `getLuas()`. Jika kondisi yang sesuai terpenuhi, maka metode-metode tersebut mengembalikan `true`, jika tidak maka mengembalikan `false`.

Pada baris ke-27 hingga ke-31, terdapat metode `main()` yang merupakan metode utama dalam program Java. Pada metode ini, objek `PersegiPanjang` dengan nama variabel `p1` dan `p2` diinisialisasi dan dibuat menggunakan konstruktor `PersegiPanjang()`. Kemudian, objek `PersegiPanjang` juga diinisialisasi dengan menggunakan variabel `r` dengan tipe `Relation`. Selanjutnya, metode `isGreater()` dan `isLess()` dipanggil pada objek `r` untuk membandingkan luas `p1` dan `p2`, dan hasil perbandingan dicetak ke layar.

Dengan demikian, program ini melakukan perbandingan luas antara dua objek `PersegiPanjang` menggunakan metode yang diimplementasikan dari antarmuka `Relation`.

public interface Relation {
    public boolean isGreater( Object a, Object b); 
    public boolean isLess( Object a, Object b); 
    public boolean isEqual( Object a, Object b);
}

Kode di atas merupakan deklarasi antarmuka (interface) bernama `Relation`. Antarmuka adalah kumpulan metode yang tidak memiliki implementasi dan digunakan untuk menyatakan kontrak yang harus diterapkan oleh kelas-kelas yang mengimplementasikannya.

Antarmuka `Relation` terdiri dari tiga metode yang harus diimplementasikan oleh kelas-kelas yang menggunakannya:

1. `isGreater(Object a, Object b)`: Metode ini menerima dua objek (`a` dan `b`) sebagai parameter dan mengembalikan nilai boolean (`true` atau `false`). Metode ini digunakan untuk membandingkan apakah `a` lebih besar dari `b` berdasarkan suatu kriteria perbandingan yang ditentukan.

2. `isLess(Object a, Object b)`: Metode ini juga menerima dua objek (`a` dan `b`) sebagai parameter dan mengembalikan nilai boolean. Metode ini digunakan untuk membandingkan apakah `a` lebih kecil dari `b` berdasarkan suatu kriteria perbandingan yang ditentukan.

3. `isEqual(Object a, Object b)`: Metode ini juga menerima dua objek (`a` dan `b`) sebagai parameter dan mengembalikan nilai boolean. Metode ini digunakan untuk membandingkan apakah `a` sama dengan `b` berdasarkan suatu kriteria perbandingan yang ditentukan.

Dengan menggunakan antarmuka `Relation`, kita dapat membuat kelas-kelas yang mengimplementasikan metode-metode tersebut dan memperoleh kemampuan untuk melakukan perbandingan antara objek-objek berdasarkan kriteria yang diinginkan.
