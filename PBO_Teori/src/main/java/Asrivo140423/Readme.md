Penjelasan Modul 7

kelas publik latihan71 { public static void main(String[] args){

    String days[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
    
     int i = 0;
     do
     {
         System.out.println(days[i]);
         i++;
         
     }while(i<days.length);
} }

Kodingan di atas adalah program Java yang menggunakan perulangan do-while untuk mencetak nama-nama hari dalam bahasa Indonesia.

Program ini memiliki struktur yang mirip dengan kodingan sebelumnya. Pertama, program mendefinisikan sebuah array bernama String daysyang berisi nama-nama hari dalam bahasa Indonesia.

Selanjutnya variabel integer idiinisialisasi dengan nilai 0. Variabel iakan digunakan sebagai indeks untuk mengakses elemen-elemen dalam array days.

Perulangan do-while digunakan untuk mengiterasi melalui array daysdan mencetak setiap elemennya. Di dalam perulangan, program mencetak elemen array dayspada indeks i, kemudian iditambah 1. Setelah itu, program melakukan pengecekan apakah ikurang dari panjang array daysmenggunakan days.lengthsebagai kondisi perulangan. Perulangan akan berlanjut selama ikurang dari panjang array days.

Keluaran dari program ini juga akan berupa nama-nama hari dalam bahasa Indonesia yang dicetak secara berurutan:

Senin
Selasa
Rabu
Kamis
Jumat
Sabtu
Minggu
Kode ini telah menggunakan days.lengthsebagai kondisi perulangan, sehingga jika jumlah elemen dalam array daysberubah di masa depan, perulangan tetap akan berjalan dengan baik.

public class latihan71dowhile { public static void main (String [] args){ String hari [] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

    int i =0;
    do
    {
        System.out.println(hari[i]);
        i++;
    }while (i<7);
}
}

Kodingan di atas adalah program Java yang menggunakan perulangan do-while untuk mencetak nama-nama hari dalam bahasa Indonesia.

Program ini memiliki struktur yang mirip dengan kodingan sebelumnya. Pertama, program mendefinisikan sebuah array bernama String daysyang berisi nama-nama hari dalam bahasa Indonesia.

Selanjutnya variabel integer idiinisialisasi dengan nilai 0. Variabel iakan digunakan sebagai indeks untuk mengakses elemen-elemen dalam array days.

Perulangan do-while digunakan untuk mengiterasi melalui array daysdan mencetak setiap elemennya. Di dalam perulangan, program mencetak elemen array dayspada indeks i, kemudian iditambah 1. Setelah itu, program melakukan pengecekan apakah ikurang dari panjang array daysmenggunakan days.lengthsebagai kondisi perulangan. Perulangan akan berlanjut selama ikurang dari panjang array days.

Keluaran dari program ini juga akan berupa nama-nama hari dalam bahasa Indonesia yang dicetak secara berurutan:

Senin
Selasa
Rabu
Kamis
Jumat
Sabtu
Minggu
Kode ini telah menggunakan days.lengthsebagai kondisi perulangan, sehingga jika jumlah elemen dalam array daysberubah di masa depan, perulangan tetap akan berjalan dengan baik.

impor javax.swing.*;

public class latihan72JoptionPane { public static void main (String [] args){ int[] nomor = new int [11]; int maks,i;

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

penomoranmaxdengan nilainomor(ynomor[0]).untuklaginomor. Dmax.max,maxakan diperbarui dengan

AkJOptionPane.showMessageDialoguntuk

Kucingforyangi<nomor.panjangsebagaii+1<=nomor.panjangsebagaii<nomor.panjanguntuk

impor java.io.*; public class latihan72bufferedReader { public static void main (String [] args) { BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));

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
} }

Kodingan di atas adalah program Java yang menggunakan BufferedReaderuntuk meminta input dari pengguna melalui keyboard dan menemukan nilai tertinggi di antara input tersebut.

Pertama, program mengimpor kelas BufferedReaderdan InputStreamReaderdari paket java.io. Ini diperlukan untuk membaca input dari pengguna melalui System.in(keyboard).

Selanjutnya, program menggunakan BufferedReaderuntuk membaca masukan dari pengguna. Baris ini menginisialisasi objek dataInyang digunakan untuk membaca input melalui System.in.

Program juga mendefinisikan sebuah array integer bernama nomordengan panjang 10. Array ini akan digunakan untuk menyimpan input dari pengguna.

Kemudian, program menggunakan perulangan foruntuk mengiterasi melalui array nomor. Dalam setiap iterasi, program mencetak pesan "Masukan nomor = " dan menggunakan Integer.parseInt(dataIn.readLine())untuk membaca input dari pengguna dan mengubahnya menjadi tipe data integer. Nilai tersebut kemudian disimpan di elemen yang sesuai dalam array nomor.

Selanjutnya program menginisialisasi variabel maxdengan elemen nilai array pertama nomor(yaitu nomor[0]). Kemudian, program menggunakan perulangan forlagi untuk mencari nilai tertinggi dalam larik nomor. Dalam setiap iterasi, program membandingkan nilai elemen saat ini dengan max. Jika nilai elemen tersebut lebih besar dari max, maka maxakan diperbarui dengan nilai tersebut.

Setelah itu, program menggunakan perulangan foruntuk mencetak isi array nomordengan menggunakan System.out.println.

Terakhir, program mencetak nilai tertinggi yang ditemukan dengan menggunakan System.out.println.

Penting untuk diperhatikan bahwa dalam blok try, program menangani kemungkinan terjadi IOExceptionsaat membaca masukan dengan BufferedReader. Jika terjadi kesalahan, program akan mencetak "Error!".

Ini adalah contoh penggunaan BufferedReaderuntuk membaca input dari pengguna melalui keyboard dan melakukan operasi perhitungan sederhana pada input tersebut.

public class latihan73 { public static void main (String [] args){ String [][] entry = {{"Florence", "735-1234", "Manila"},{"Joyce", "983-3333", "Kota Quezon"}, {"Becca", "456-3322", "Manila"}};

    int i=0;
    do{
        System.out.println("Name : " + entry[i][0]);
        System.out.println("Tel.# : " +entry [i][1]);
        System.out.println("Address : " + entry[i][2]);
        i++;
    
    }while(i<3);
    
}
}

Kode yang diberikan adalah program Java yang menggunakan loop do-while untuk mencetak entri yang disimpan dalam array 2 dimensi.

Program mendefinisikan array 2 dimensi bernama entry. Setiap baris dalam array mewakili satu set data yang terdiri dari nama, nomor telepon, dan alamat.

Do-while loop digunakan untuk melakukan iterasi melalui entryarray dan mencetak setiap entri. Di dalam loop, program mencetak nama ( entry[i][0]), nomor telepon ( entry[i][1]), dan alamat ( entry[i][2]) dari setiap entri. Setelah itu, variabel ibertambah 1. Pengulangan berlanjut selama ikurang dari 3.

Output dari program ini akan mencetak entri dalam format berikut:

Name : Florence
Tel.# : 735-1234
Address : Manila

Name : Joyce
Tel.# : 983-3333
Address : Quezon City

Name : Becca
Tel.# : 456-3322
Address : Manila
Perulangan do-while digunakan di sini karena program ingin melakukan setidaknya satu iterasi, yaitu mencetak setidaknya satu entri. Setelah itu, program memeriksa kondisi perulangan setelah setiap iterasi, dan akan berlanjut selama kondisinya benar (yaitu ikurang dari 3 dalam kasus ini).