public interface AnggotaDao {
    void insert(Anggota anggota);
    void update(int index, Anggota anggota);
    void delete(int index);
    Anggota getAnggota(int index);
    List<Anggota> getAll();
}

Kode di atas adalah deklarasi antarmuka (interface) dengan nama `AnggotaDao`. Antarmuka ini mendefinisikan beberapa metode yang harus diimplementasikan oleh kelas-kelas yang menggunakannya untuk mengakses dan memanipulasi data anggota.

Berikut adalah penjelasan singkat mengenai setiap metode dalam antarmuka `AnggotaDao`:

1. `void insert(Anggota anggota)`: Metode ini digunakan untuk memasukkan data anggota baru ke dalam sumber data. Metode ini menerima objek `Anggota` sebagai parameter yang akan dimasukkan ke dalam sumber data.

2. `void update(int index, Anggota anggota)`: Metode ini digunakan untuk memperbarui data anggota pada indeks tertentu di sumber data. Metode ini menerima indeks dan objek `Anggota` baru sebagai parameter yang akan digunakan untuk melakukan pembaruan.

3. `void delete(int index)`: Metode ini digunakan untuk menghapus data anggota pada indeks tertentu dari sumber data. Metode ini menerima indeks sebagai parameter yang menunjukkan data anggota yang akan dihapus.

4. `Anggota getAnggota(int index)`: Metode ini digunakan untuk mendapatkan data anggota pada indeks tertentu dari sumber data. Metode ini menerima indeks sebagai parameter dan mengembalikan objek `Anggota` yang sesuai dengan indeks tersebut.

5. `List<Anggota> getAll()`: Metode ini digunakan untuk mendapatkan semua data anggota dari sumber data. Metode ini mengembalikan daftar (`List`) objek `Anggota` yang berisi semua data anggota yang ada di sumber data.

Dengan menggunakan antarmuka `AnggotaDao`, kita dapat membuat kelas-kelas yang mengimplementasikan metode-metode ini sesuai dengan kebutuhan aplikasi. Antarmuka ini memisahkan definisi akses data dari implementasinya sehingga memudahkan untuk mengganti atau menyediakan implementasi yang berbeda tanpa mengubah kode yang menggunakannya.

public class AnggotaDaoImpl implements AnggotaDao {
    private List<Anggota> data = new ArrayList<>();
    
    public AnggotaDaoImpl(){
        data.add(new Anggota("A001", "Asrivo MKP", "Padang", "P"));
        data.add(new Anggota("A002", "Andri JL", "Sijunjung", "L"));
        data.add(new Anggota("A003", "Melida Sari", "Pariaman", "P"));
    }
    
    public void insert(Anggota anggota) {
        data.add(anggota);
    }
    public void update(int index, Anggota anggota){
        data.set(index, anggota);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    public List<Anggota> getAll(){
        return data;
    }
}

Kode di atas adalah implementasi dari antarmuka `AnggotaDao` dalam kelas `AnggotaDaoImpl`. Kelas ini bertanggung jawab untuk mengakses dan memanipulasi data anggota menggunakan struktur data List.

Pada baris ke-2, terdapat deklarasi variabel `data` dengan tipe List<Anggota>, yang akan digunakan untuk menyimpan data anggota.

Pada baris ke-4 hingga ke-8, terdapat konstruktor `AnggotaDaoImpl()` yang digunakan untuk menginisialisasi data anggota dengan nilai awal. Dalam konstruktor ini, beberapa objek `Anggota` dibuat dan ditambahkan ke dalam `data`. Hal ini digunakan untuk menginisialisasi beberapa data anggota secara langsung.

Pada baris ke-11 hingga ke-13, terdapat implementasi metode `insert(Anggota anggota)`. Metode ini digunakan untuk memasukkan objek `Anggota` baru ke dalam list `data` dengan menggunakan metode `add(anggota)`.

Pada baris ke-15 hingga ke-17, terdapat implementasi metode `update(int index, Anggota anggota)`. Metode ini digunakan untuk memperbarui objek `Anggota` pada indeks tertentu dalam list `data` dengan menggunakan metode `set(index, anggota)`.

Pada baris ke-19 hingga ke-21, terdapat implementasi metode `delete(int index)`. Metode ini digunakan untuk menghapus objek `Anggota` pada indeks tertentu dari list `data` dengan menggunakan metode `remove(index)`.

Pada baris ke-23 hingga ke-25, terdapat implementasi metode `getAnggota(int index)`. Metode ini digunakan untuk mendapatkan objek `Anggota` pada indeks tertentu dari list `data` dengan menggunakan metode `get(index)`.

Pada baris ke-27 hingga ke-29, terdapat implementasi metode `getAll()`. Metode ini digunakan untuk mengembalikan seluruh data anggota yang ada dalam list `data`.

Dengan menggunakan kelas `AnggotaDaoImpl` yang mengimplementasikan antarmuka `AnggotaDao`, kita dapat mengakses dan memanipulasi data anggota melalui metode-metode yang didefinisikan dalam antarmuka tersebut. Implementasi ini menggunakan struktur data List untuk menyimpan data anggota secara sederhana.