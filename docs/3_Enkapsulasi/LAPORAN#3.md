# Laporan Praktikum 3 - ENKAPSULASI
# Kompetensi <br>
Setelah melakukan percobaan pada modul ini, mahasiswa memahami konsep:
1. Konstruktor
2. Akses Modifier
3. Atribut/method pada class
4. Intansiasi atribut/method
5. Setter dan getter
6. Memahami notasi pada UML Class Diagram

## Ringkasan Materi
- enum (enumeration) adalah tipe data yang memiliki nilai atau literal yang terbatas
, contoh:<br>
Enum color{<br>
    Red=#.....;<br>
    Blue....;<br>
    Green....;    
    }
    
    A=Color.Red;
    B=Color.Blue;

- Ada 2 jenis method yaitu:
Void dan Tipe data
- Notasi akses modifier pada UML class diagram adalah sebagai berikut:
1. Tanda plus (+) untuk public
2. Tanda pagar (#) untuk protected
3. Tanda minus (-) untuk private
4. Untuk default, maka tidak diberi notasi
## <b>Percobaan</b><br>

### Percobaan 1: Enkapsulasi
Didalam percobaan enkapsulasi, buatlah class Motor yang memiliki atribut kecepatan dan kontakOn,
dan memiliki method printStatus() untuk menampilkan status motor

![class motor](img/motor1841720003.png)

Kemudian buat class MotorDemo, ketikkan kode berikut ini

![class motor](img/motor11.png)

Dari gambar diatas, 
kecepatan motor berubah dari 0 ke 50. dan posisi kontak motor
masih dalam kondisi OFF.
Nah dalam hal ini, akses ke atribut motor ternyata tidak terkontrol. Padahal, objek di dunia nyata
selalu memiliki batasan dan mekanisme bagaimana objek tersebut dapat digunakan. Kita bisa
pertimbangkan beberapa hal berikut ini:
1. Menyembunyikan atribut internal (kecepatan, kontakOn) dari pengguna (class lain)
2. Menyediakan method khusus untuk mengakses atribut.

### Percobaan 2: Access Modifier
- Ubah access modifier kecepatan dan kontakOn menjadi private
- Tambahkan method nyalakanMesin, matikanMesin, tambahKecepatan,
kurangiKecepatan <br>
[class Motor.java](../../src/3_Enkapsulasi/Motor1841720003Mayang.java)

- Kemudian pada class main MotorDemo, ubah code menjadi seperti berikut:
[class MotorDemo.java](../../src/3_Enkapsulasi/MotorDemo1841720003Mayang.java)

    Output dari class di atas adalah<br>
    ![class Barang](img/motor2.PNG)

    Dapat kita amati sekarang atribut kecepatan tidak bisa diakses oleh pengguna dan diganti nilainya secara sembarangan. Bahkan ketika mencoba menambah kecepatan saat posisi kontak masih OFF, maka akan muncul notifikasi bahwa mesin OFF. Untuk mendapatkan kecepatan yang diinginkan, maka harus dilakukan secara gradual, yaitu dengan memanggil method tambahKecepatan() beberapa kali. Hal ini mirip seperti saat kita mengendarai motor.

<b>Pertanyaan</b>
1. Pada class TestMotor, saat kita menambah kecepatan untuk pertama kalinya, mengapa
muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?<br>
    Jawab:<br>
    Karena pada class MotorDemo method nyalakan mesin belum di terpanggil.
2. Mengapa atribut kecepatan dan kontakOn diset private?<br>
    Jawab:<br>
    Agar tidak bisa di akses oleh class lain.
3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!<br>
    Jawab:<br>
    ![Motormax100](img/max100.PNG)<br>
    Maka hasilnya seperti di bawah ini
    ![Motormax100](img/max100..PNG)<br>

### Percobaan 3: Getter dan Setter
Di sebuah sistem informasi koperasi, terdapat class Anggota. Anggota memiliki atribut nama, alamat dan simpanan, dan method setter, getter dan setor dan pinjam.<br>
![class anggota](img/classanggota.PNG)<br>
Jika diperhatikan pada class Anggota, atribut nama dan alamat memiliki masing-masing 1 getter dan setter. Sedangkan atribut simpanan hanya memiliki getSimpanan() saja, karena seperti tujuan awal, atribut simpanan akan berubah nilainya jika melakukan transaksi setor() dan pinjam/tarik()<br>

Selanjutnya buatlah class KoperasiDemo untuk mencoba class Anggota<br>
![class anggota](img/outputanggota.PNG)<br>
Maka hasil seperti gambar di atas. Dapat dilihat pada hasil percobaan diatas, untuk mengubah simpanan tidak dilakukan secara langsung dengan mengubah atribut simpanan, melainkan melalui method setor() dan pinjam(). Untuk menampilkan nama pun harus melalui method getNama(), dan untuk menampilkan simpanan melalui getSimpanan().

### Percobaan 4: Konstruktor, Instansiasi
- Langkah pertama percobaan 4 adalah ubah class KoperasiDemo seperti berikut<br>
    ![](img/passing.PNG)
    Dapat dilihat hasil running program, ketika dilakukan pemanggilan method getNama() hasilnya hal ini terjadi karena atribut nama belum diset nilai defaultnya. Hal ini dapat ditangani dengan membuat kontruktor.

- Ubah class Anggota menjadi seperti berikut
    ![](img/konstruktor.PNG)
    Pada class Anggota dibuat kontruktor dengan access modifier default yang memiliki 2 parameter nama dan alamat. Dan didalam konstruktor tersebut dipastikan nilai simpanan untuk pertama kali adalah Rp. 0.

- Selanjutnya ubah class KoperasiDemo dengan mempassing nilai sebagai berikut
    ![](img/passnilai.PNG)
    Setelah menambah konstruktor pada class Anggoata maka atribut nama dan alamat secara otomatis harus diset terlebih dahulu dengan melakukan passing parameter jika melakukan instansiasi class Anggota. 

### <b>Pertanyaan percobaan 3 dan 4</b>
1. Apa yang dimaksud getter dan setter?<br>
    jawab:<br>
    Getter adalah public method dan memiliki tipe data return, yang berfungsi untuk mendapatkan nilai dari atribut private. Sedangkan setter adalah public method yang tidak memliki tipe data return, yang berfungsi untuk memanipulasi nilai dari atribut private.
2. Apa kegunaan dari method getSimpanan()?<br>
    jawab:<br>
    Untuk menampilkan hasil dari method pinjam dan setor, maka dari itu atribut simpanan di set 0 agar nilai nya dapat berubah-ubah.
3. Method apa yang digunakan untk menambah saldo?<br>
    jawab:<br>
    void setorMayang();
4. Apa yand dimaksud konstruktor?<br>
    jawab:<br>
    Konstruktor mirip dengan method cara deklarasinya akan tetapi tidak memiliki tipe return. Dan konstruktor dieksekusi ketika instan dari objek dibuat.
5. Sebutkan aturan dalam membuat konstruktor?<br>
    jawab:<br>
    - Nama konstruktor harus sama dengan nama class
    - Konstruktor tidak memiliki tipe data return
    - Konstruktor tidak boleh menggunakan modifier abstract, static, final, dan syncronized
6. Apakah boleh konstruktor bertipe private?<br>
    jawab:<br>
    Boleh
7. Kapan menggunakan parameter dengan passsing parameter?<br>
    jawab:<br>
    Pada saat suatu class menggunakan konstruktor
8. Apa perbedaan atribut class dan instansiasi atribut?<br>
    jawab:<br>
    Atribut merupakan nilai data yang terdapat pada suatu object yang ada di suatu class. Atribut merepresentasikan karakteristik dari suatu object. Atau Atribut adalah sesuatu yang dimiliki oleh objek. Sedangkan instansiasi atribut adalah 
9. Apa perbedaan class method dan instansiasi method?<br>
    jawab:<br>
    class method adalah fungsi-fungsi yang berada dalam class seperti parameter, mengembalikan nilai(return) dll. Sedangkan Instansiasi method adalah 

## <b>Tugas<br></b>
1. Cobalah program dibawah ini dan tuliskan hasil outputnya
    ![](img/encap.PNG)
    ![](img/encapdemo.PNG)
2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada saat ditampilkan ke layar nilainya 30, jelaskan mengapa?<br>
    Jawab:<br>
    Karena pada class encap terdapat kode<br>
    ![](img/age.PNG)<br>
    yang artinya jika nilai umur nya lebih dari 30 maka outputnya akan tetap 30, jika nilai umur nya lebih kecil dari 30 maka output nya sesuai nilai yang di isi di variabel umur tersebut.
3. Ubah program diatas agar atribut age dapat diberi nilai maksimal 30 dan minimal 18<br>
    Jawab:<br>
    ![](img/min.PNG)<br>
    Pada gambar di atas kita akan menambahkan umur maximum dan minimum seperti gambar di atas.
    ![](img/max.PNG)<br>
    Setelah kita jalankan maka hasil nya akan seperti gambar diatas ini. bisa di simpulkan jika nilai yang ada di variabel age kurang dari 18 dan lebih dari 30 maka output nya akan mengikuti nilai max/min tersebut. begitupun sebaliknya.
4.
5.
6.
## <b>Kesimpulan</b>
Dari percobaan diatas, telah dipelajari kosep dari enkapsulasi, kontruktor, access modifier yang terdiri dari 4 jenis yaitu public, protected, default dan private. Konsep atribut atau method class yang ada di dalam blok code class dan konsep instansiasi atribut atau method. Cara penggunaan getter dan setter beserta fungsi dari getter dan setter. Dan juga telah dipelajari atau memahami notasi UML.

## <b>Pernyataan Diri</b>
Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.<br><br>
Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.
<br><br>
Ttd,
<br>
***(Mayang Muria Cahyaningsih)***