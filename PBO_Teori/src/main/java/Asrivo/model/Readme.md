public class Anggota {
    private String kodeAnggota;
    private String namaAnggota;
    private String alamat;
    private String jenisKelamin;
    
    public Anggota() {
    }

    public Anggota(String kodeAnggota, String namaAnggota, String alamat, String jenisKelamin) {
        this.kodeAnggota = kodeAnggota;
        this.namaAnggota = namaAnggota;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

Kode di atas adalah kelas `Anggota` yang merepresentasikan entitas anggota dalam sistem. Kelas ini memiliki beberapa atribut seperti `kodeAnggota`, `namaAnggota`, `alamat`, dan `jenisKelamin`.

Pada baris ke-2 hingga ke-5, terdapat deklarasi atribut dengan tipe data `String`. Atribut-atribut ini digunakan untuk menyimpan informasi tentang anggota seperti kode anggota, nama anggota, alamat, dan jenis kelamin.

Pada baris ke-7, terdapat konstruktor default `Anggota()`. Konstruktor ini tidak menerima parameter dan tidak melakukan operasi apapun. Digunakan untuk membuat objek `Anggota` tanpa nilai awal.

Pada baris ke-9 hingga ke-13, terdapat konstruktor `Anggota(String kodeAnggota, String namaAnggota, String alamat, String jenisKelamin)`. Konstruktor ini menerima empat parameter yang akan digunakan untuk menginisialisasi nilai dari atribut-atribut anggota sesuai dengan nilai yang diberikan sebagai parameter.

Dengan adanya kelas `Anggota` ini, kita dapat membuat objek-objek `Anggota` dengan atribut-atribut yang sesuai, seperti kode anggota, nama anggota, alamat, dan jenis kelamin. Objek-objek ini kemudian dapat digunakan dalam sistem untuk merepresentasikan data anggota dan melakukan operasi-operasi terkait dengan anggota.

