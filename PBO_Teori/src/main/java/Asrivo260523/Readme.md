Readme Modul 11

StudentRecord.java

public class StudentRecord {
    protected String name;
    protected String address;
    protected String age;
        
    public StudentRecord(){
        System.out.println("SuperClass");
    }
    
    public StudentRecord(String name, String address, String age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    public StudentRecord(String name){
        this.name = name;
        this.address = "";
        this.age ="";
    }
    
    public String getName(){
        System.out.println("StudentRecord name:" + name);
        return name;
    }
    public String getAddress(){
        return address;
    }
     public String getAge(){
        return age;
    }
     
      
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setAge(String age){
        this.age= age;
    }
}

Kode di atas adalah contoh dari kelas Java yang disebut `StudentRecord`. Kelas ini memiliki beberapa atribut (name, address, dan age) yang mewakili informasi tentang seorang siswa. Berikut adalah penjelasan mengenai setiap bagian kode:

1. Deklarasi Atribut:
   - `name`, `address`, dan `age` adalah variabel yang digunakan untuk menyimpan informasi tentang nama, alamat, dan usia siswa. Ketiga variabel ini dijelaskan menggunakan tipe data `String` dan dideklarasikan sebagai variabel protected, yang berarti mereka dapat diakses oleh kelas-kelas turunan.

2. Konstruktor:
   - Terdapat tiga konstruktor yang digunakan untuk membuat objek `StudentRecord` dengan berbagai argumen.
   - Konstruktor pertama (`public StudentRecord()`) adalah konstruktor default yang mencetak pesan "SuperClass" saat objek dibuat.
   - Konstruktor kedua (`public StudentRecord(String name, String address, String age)`) digunakan untuk menginisialisasi atribut `name`, `address`, dan `age` dengan nilai yang diberikan.
   - Konstruktor ketiga (`public StudentRecord(String name)`) menginisialisasi `name` dengan nilai yang diberikan, sedangkan `address` dan `age` diatur sebagai string kosong ("").

3. Metode Getter:
   - `getName()`, `getAddress()`, dan `getAge()` adalah metode getter yang mengembalikan nilai atribut `name`, `address`, dan `age` masing-masing.
   - Metode `getName()` juga mencetak pesan "StudentRecord name:" diikuti dengan nilai `name` sebelum mengembalikan nilai tersebut.

4. Metode Setter:
   - `setName(String name)`, `setAddress(String address)`, dan `setAge(String age)` adalah metode setter yang digunakan untuk mengubah nilai atribut `name`, `address`, dan `age` masing-masing.

Kelas `StudentRecord` ini dapat digunakan untuk membuat objek dan mengakses/mengubah informasi siswa seperti nama, alamat, dan usia menggunakan metode getter dan setter yang disediakan.

StudentComputer.java

public class StudentComputer extends StudentRecord {
   double network;
   double pbo;
   double web;
   double average;
   
   //******NETWORK******//
   public double getNetwork (){
        return network;
    }
    public void setNetwork (double network){
        this.network = network;
    }
    
    //******PBO******//
     public double getPbo (){
        return pbo;
    }
    public void setPbo (double pbo){
        this.pbo = pbo;
    }
    
     //******WEB******//
    public double getWeb (){
        return web;
    }
    public void setWeb (double web){
        this.web = web;
    }
    
    
     public double getAverage (){
         average = (web + pbo + network)/3;
        return average;
    }
    public void setAverage (double average){
        this.average = average;
    }
       
    @Override
    public String getName(){
        System.out.println("StudentComputer = " + name);
        return name;
    }
    
    public static void main(String[] args){
        StudentComputer siswa1 = new StudentComputer();
            siswa1.setNetwork(90);
            siswa1.setPbo(80);
            siswa1.setWeb(70);
           
            StudentRecord ref;
            ref = siswa1;
            ref.setName("ALI");
            ref.setAddress("Padang");
            ref.setAge("19 Tahun");
            
            System.out.println("Nama    = " + ref.getName());
            System.out.println("Alamat  = " + ref.getAddress());
            System.out.println("Umur    = " + ref.getAge());
            System.out.println("\nNilai Kompetisi Komputer");
            System.out.println("PBO     = " + siswa1.getPbo());
            System.out.println("NETWORK = " + siswa1.getNetwork());
            System.out.println("WEB     = " + siswa1.getWeb());
            System.out.println("Rata-rata = " + siswa1.getAverage());
    }   
}

Kode di atas adalah contoh kelas Java baru yang disebut `StudentComputer`. Kelas ini merupakan turunan dari kelas `StudentRecord`, sehingga mewarisi semua atribut dan metode dari kelas tersebut. Berikut adalah penjelasan mengenai setiap bagian kode:

1. Deklarasi Atribut:
   - `network`, `pbo`, `web`, dan `average` adalah variabel yang digunakan untuk menyimpan informasi tentang nilai siswa dalam bidang jaringan komputer (`network`), pemrograman berorientasi objek (`pbo`), pemrograman web (`web`), dan nilai rata-rata (`average`) dari ketiga bidang tersebut. Variabel-variabel ini memiliki tipe data `double`.

2. Metode Getter dan Setter:
   - Terdapat metode getter (`getNetwork()`, `getPbo()`, `getWeb()`, `getAverage()`) dan setter (`setNetwork()`, `setPbo()`, `setWeb()`, `setAverage()`) untuk masing-masing atribut.
   - Metode getter mengembalikan nilai dari atribut yang sesuai, sedangkan metode setter digunakan untuk mengubah nilai atribut dengan nilai yang diberikan.

3. Metode Override:
   - Terdapat metode `getName()` yang dioverride dari kelas `StudentRecord`. Metode ini mencetak pesan "StudentComputer = " diikuti dengan nilai `name` yang diwarisi dari kelas `StudentRecord`, dan kemudian mengembalikan nilai tersebut. Dalam hal ini, metode ini mencetak pesan yang membedakan antara metode `getName()` dalam kelas `StudentComputer` dengan metode `getName()` dalam kelas `StudentRecord`.

4. Metode `main()`:
   - Metode `main()` adalah metode utama yang dieksekusi saat program dijalankan.
   - Di dalam metode `main()`, objek `StudentComputer` dengan nama `siswa1` dibuat. Kemudian, nilai-nilai atribut `network`, `pbo`, dan `web` diatur menggunakan metode setter.
   - Variabel `ref` dengan tipe `StudentRecord` diinisialisasi dengan objek `siswa1`, yang menunjukkan polimorfisme, karena objek `siswa1` dari kelas `StudentComputer` bisa dianggap sebagai objek dari kelas `StudentRecord`.
   - Melalui variabel `ref`, metode `setName()`, `setAddress()`, dan `setAge()` dijalankan untuk mengatur nilai atribut yang diwarisi dari kelas `StudentRecord`.
   - Selanjutnya, informasi siswa seperti nama, alamat, dan usia dicetak menggunakan metode getter.
   - Nilai-nilai dalam bidang komputer seperti PBO, network, dan web dicetak menggunakan metode getter yang sesuai.
   - Terakhir, rata-rata nilai siswa (`average`) dicetak menggunakan metode `getAverage()`.

Kelas `StudentComputer` ini menambahkan atribut dan metode spesifik untuk bidang komputer pada kelas `StudentRecord`, dan menggantikan atau menambah perilaku metode tertentu melalui overriding.

Shape.java

public abstract class Shape {
    public abstract String getNama();       
    public abstract float getArea();
}


Kode di atas adalah contoh dari kelas abstrak (abstract class) yang disebut `Shape`. Kelas ini memiliki dua metode abstrak: `getNama()` dan `getArea()`. Berikut adalah penjelasan mengenai setiap bagian kode:

1. Deklarasi Kelas Abstrak:
   - Kode di atas dimulai dengan deklarasi kelas abstrak menggunakan kata kunci `abstract`.
   - Kelas abstrak tidak dapat diinstansiasi secara langsung. Tujuan dari kelas abstrak adalah untuk memberikan kerangka atau blueprint bagi kelas-kelas turunannya.

2. Metode Abstrak:
   - Terdapat dua metode abstrak yang dideklarasikan dalam kelas `Shape`: `getNama()` dan `getArea()`.
   - Metode abstrak tidak memiliki implementasi (kode di dalamnya). Mereka hanya memiliki deklarasi metode tanpa tubuh metode.
   - Metode abstrak dideklarasikan menggunakan kata kunci `abstract` dan tidak memiliki tanda kurung kurawal ({ }) untuk mengimplementasikan kode.

3. `getNama()`:
   - Metode `getNama()` adalah metode abstrak yang harus diimplementasikan oleh kelas turunan dari `Shape`.
   - Metode ini mengembalikan sebuah string yang mewakili nama dari bentuk geometri yang spesifik.

4. `getArea()`:
   - Metode `getArea()` juga merupakan metode abstrak yang harus diimplementasikan oleh kelas turunan dari `Shape`.
   - Metode ini mengembalikan nilai bertipe `float` yang mewakili luas dari bentuk geometri yang spesifik.

Kelas `Shape` ini memberikan kerangka umum untuk berbagai bentuk geometri seperti lingkaran, persegi, segitiga, dan sebagainya. Kelas-kelas turunan yang mewarisi dari `Shape` harus mengimplementasikan metode-metode abstrak tersebut.


Circle.java

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


Kode di atas merupakan contoh dari kelas `Circle` yang merupakan turunan dari kelas `Shape`. Berikut adalah penjelasan mengenai setiap bagian kode:

1. Deklarasi Kelas:
   - Kelas `Circle` merupakan kelas yang mewarisi dari kelas abstrak `Shape` menggunakan kata kunci `extends`.
   - Dalam hal ini, kelas `Circle` mengimplementasikan metode-metode abstrak `getNama()` dan `getArea()` yang dideklarasikan dalam kelas `Shape`.

2. Atribut:
   - Terdapat satu atribut dalam kelas `Circle` yang bertipe `int` dan berlabel `r`, yang mewakili jari-jari lingkaran.

3. Konstruktor:
   - Terdapat dua konstruktor dalam kelas `Circle`.
   - Konstruktor pertama (`public Circle()`) adalah konstruktor default yang mencetak pesan "Konstruktor Circle" saat objek dibuat.
   - Konstruktor kedua (`Circle(int r)`) menerima sebuah argumen `r` dan menginisialisasi atribut `r` dengan nilai tersebut.

4. Metode Setter dan Getter:
   - `setJari(int r)` digunakan untuk mengatur nilai atribut `r`.
   - `getJari()` digunakan untuk mengembalikan nilai atribut `r`.

5. Override Metode:
   - `getNama()` dioverride dari kelas `Shape`. Metode ini mengembalikan string "Lingkaran" yang mewakili nama bentuk geometri yang spesifik (lingkaran).
   - `getArea()` dioverride dari kelas `Shape`. Metode ini menghitung dan mengembalikan luas lingkaran dengan menggunakan rumus 3.14 * r * r.

6. Metode `main()`:
   - Metode `main()` adalah metode utama yang dieksekusi saat program dijalankan.
   - Di dalam metode `main()`, objek `bangun1` dari kelas `Circle` dibuat.
   - Nilai jari-jari lingkaran diatur menggunakan metode setter `setJari(3)`.
   - Menggunakan metode getter dan metode override `getNama()` dan `getArea()`, informasi tentang lingkaran seperti nama dan luasnya dicetak.

Kelas `Circle` ini merupakan implementasi spesifik dari bentuk lingkaran dan menggunakan metode override untuk menghitung luas lingkaran sesuai dengan rumus yang tepat.


Square.java

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


Kode di atas merupakan contoh dari kelas `Square` yang merupakan turunan dari kelas `Shape`. Berikut adalah penjelasan mengenai setiap bagian kode:

1. Deklarasi Kelas:
   - Kelas `Square` merupakan kelas yang mewarisi dari kelas abstrak `Shape` menggunakan kata kunci `extends`.
   - Dalam hal ini, kelas `Square` mengimplementasikan metode-metode abstrak `getNama()` dan `getArea()` yang dideklarasikan dalam kelas `Shape`.

2. Konstruktor:
   - Terdapat dua konstruktor dalam kelas `Square`.
   - Konstruktor pertama (`public Square()`) adalah konstruktor default yang mencetak pesan "Konstruktor Square" saat objek dibuat.
   - Konstruktor kedua (`Square(int s)`) menerima sebuah argumen `s` dan menginisialisasi atribut `s` dengan nilai tersebut.

3. Atribut:
   - Terdapat satu atribut dalam kelas `Square` yang bertipe `int` dan berlabel `s`, yang mewakili panjang sisi persegi.

4. Metode Setter dan Getter:
   - `setSisi(int s)` digunakan untuk mengatur nilai atribut `s`.
   - `getSisi()` digunakan untuk mengembalikan nilai atribut `s`.

5. Override Metode:
   - `getNama()` dioverride dari kelas `Shape`. Metode ini mengembalikan string "Persegi" yang mewakili nama bentuk geometri yang spesifik (persegi).
   - `getArea()` dioverride dari kelas `Shape`. Metode ini menghitung dan mengembalikan luas persegi dengan menggunakan rumus s * s (sisi kuadrat).

6. Metode `main()`:
   - Metode `main()` adalah metode utama yang dieksekusi saat program dijalankan.
   - Di dalam metode `main()`, objek `bangun1` dari kelas `Square` dibuat.
   - Nilai sisi persegi diatur menggunakan metode setter `setSisi(3)`.
   - Menggunakan metode getter dan metode override `getNama()` dan `getArea()`, informasi tentang persegi seperti nama dan luasnya dicetak.

Kelas `Square` ini merupakan implementasi spesifik dari bentuk persegi dan menggunakan metode override untuk menghitung luas persegi sesuai dengan rumus yang tepat.