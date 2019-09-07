# Laporan Praktikum 2 - CLASS dan OBJECT
# Kompetensi <br>
- Mahasiswa dapat memahami deskripsi dari class dan object
- Mahasiswa memahami implementasi dari class
- Mahasiswa dapat memahami implementasi dari attribute
- Mahasiswa dapat memahami implementasi dari method
- Mahasiswa dapat memahami implementasi dari proses instansiasi
- Mahasiswa dapat memahami implementasi dari try-catch
- Mahasiswa dapat memahami proses pemodelan class diagram menggunakan UML

## Ringkasan Materi
- Class adalah wadah dari semua method-method. Misalnya kita akan membuat sebuah Mobil. Maka yang perlu kita buatkan adalah beberapa class yang didalamnya berisi fungsi-fungsi yang dapat membuat Mobil itu dapat berjalan sebagaimana mestinya, misalnya class roda, class mesin, dll. Sedangkan objek adalah pemanfaatan class yang telah disiapkan misalnya kita sudah membuat class Roda, yang di dalamnya itu berisi konsep bagaimana Roda itu bisa berjalan

## <b>Percobaan</b><br>

### Percobaan 1: Membuat class diagram
Dalam suatu perusahaan salah satu data yang diolah adalah data karyawan. Setiap
karyawan memiliki id, nama, jenis kelamin, jabatan, jabatan, dan gaji. Setiap mahasiswa
juga bisa menampilkan data diri pribadi dan melihat gajinya

![class diagram](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/docs/2_Class_dan_Object/img/img/karyawan.png)

### Percobaan 2: Membuat dan mengakses anggota suatu class

![mahasiswa](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/docs/2_Class_dan_Object/img/img/mahasiswa.png)

Pertama membuat class Mahasiswa yang isinya terdapat method tampilBiodata(); [class Mahasiswa.java](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/src/2_Class_dan_Object/Mahasiswa1841720003Mayang.java)

Untuk dapat mengakses anggota-anggota dari suatu obyek, maka harus dibuat instance
dari class tersebut terlebih dahulu. Berikut ini adalah cara pengaksesan anggota-anggota dari class Mahasiswa

![Mahasiswa](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/docs/2_Class_dan_Object/img/img/mainMahasiswa.PNG)
1. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!<br>
    jawab:<br>
    public int nimMayang;<br>
    public String namaMayang, alamatMayang, kelasMayang;

2. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!<br>
    jawab:<br>
    public void tampilBiodataMayang(){<br>
        System.out.println("Nim     : "+nimMayang);<br>
        System.out.println("Nama    : "+namaMayang);<br>
        System.out.println("Alamat  : "+alamatMayang);<br>
        System.out.println("Kelas   : "+kelasMayang);<br>
    }

3. Berapa banyak objek yang di instansiasi pada program diatas!<br>
    jawab:<br>
    Ada 1, yaitu Mahasiswa1841720003Mayang mhs1 = new Mahasiswa1841720003Mayang();

4. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?<br>
    jawab:<br>
    Untuk memanggil atribut guna mengisi nilai "101" di data nim .

5. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()” ?<br>
    jawab:<br>
    untuk memanggil method tampilBiodata dan menampilkan isi dari method tersebut

6.  Instansiasi 2 objek lagi pada program diatas!<br>
    jawab:<br>
    ![instansiasi](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/docs/2_Class_dan_Object/img/img/instance.PNG)

### Percobaan 3: Menulis method yang memiliki argument/parameter dan memiliki return
![class Barang](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/docs/2_Class_dan_Object/img/img/classBarang.PNG)
class Barang.java --> [klik disini](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/src/2_Class_dan_Object/Barang1841720003Mayang.java)

Untuk dapat mengakses anggota-anggota dari suatu obyek, maka harus dibuat instance
dari class tersebut terlebih dahulu. Berikut ini adalah cara pengaksesan anggotaanggota dari class Barang.

![main Barang](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/docs/2_Class_dan_Object/img/img/mainBarang.PNG)

1. Apakah fungsi argumen dalam suatu method?<br>
    jawab:<br>
    Fungsinya argumen/parameter untuk memberi suatu nilai pada variabel mempunyai argumen/parameter tersebut.

2. Ambil kesimpulan tentang kegunaan dari kata kunci return , dan kapan suatu method harus memiliki return!<br>
    jawab:<br>
    Pengembalikan nilai agar dapat diolah pada proses berikutnya. method return digunakan pada waktu sebuah method yang memiliki nilai pengembalian.

## <b>Tugas<br></b>
1. Suatu toko persewaan video game salah satu yang diolah adalah peminjaman, dimana
data yang dicatat ketika ada orang yang melakukan peminjaman adalah id, nama
member, nama game, dan harga yang harus dibayar. Setiap peminjaman bisa
menampilkan data hasil peminjaman dan harga yang harus dibayar. Buatlah class
diagram pada studi kasus diatas!
    Penjelasan:
    - Harga yang harus dibayar diperoleh dari lama sewa x harga.
    - Diasumsikan 1x transaksi peminjaman game yang dipinjam hanya 1 game saja<br>
    jawab:<br>
    ![class diagram](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/docs/2_Class_dan_Object/img/img/videogame.jpg)
2. Buatlah program dari class diagram yang sudah anda buat di no 1!<br>
    jawab:<br>
    Dari class diagram di atas. pertama kita akan membuat class VideoGame dahulu. script bisa dilihat di [VideoGame.java](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/src/2_Class_dan_Object/VideoGame1841720003Mayang.java)

    Lalu yang kedua kita akan membuat main nya. seperti gambar di bawah ini
    ![class diagram](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/docs/2_Class_dan_Object/img/img/mainVideo.PNG)
    maka output nya seperti gambar di atas.
3. Buatlah program sesuai dengan class diagram berikut ini:<br>
    ![soal](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/docs/2_Class_dan_Object/img/img/soal3.PNG)<br>
    jawab:<br>
    Dari class diagram di atas. pertama kita akan membuat class Lingkaran dahulu. script bisa dilihat di [Lingkaran.java](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/src/2_Class_dan_Object/Lingkaran1841720003Mayang.java)

    Lalu yang kedua kita akan membuat main nya. seperti gambar di bawah ini
    ![Lingkaran](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/docs/2_Class_dan_Object/img/img/mainLingkaran.PNG)
    maka output nya seperti gambar di atas.
4. Buatlah program sesuai dengan class diagram berikut ini:<br>
    ![soal](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/docs/2_Class_dan_Object/img/img/soal4.PNG)<br>
    jawab:<br>
    Dari class diagram di atas. pertama kita akan membuat class Diskon dahulu. script bisa dilihat di [Diskon.java](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/src/2_Class_dan_Object/Diskon1841720003Mayang.java)

    Lalu yang kedua kita akan membuat main nya. seperti gambar di bawah ini
    ![Diskon](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/docs/2_Class_dan_Object/img/img/mainDiscount.PNG)
    maka output nya seperti gambar di atas.

## <b>Kesimpulan</b>
Dengan adanya class diagram, kita akan dengan mudah membuat sebuah program, karena di class diagram seperti konsep awal sebelum membuat program. jadi kita bisa tau apa saja atribut yang dibutuhkan atau method apa saja yang digunakan, apakah method yang berparameter atau tidak berparameter.

## <b>Pernyataan Diri</b>
Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.<br><br>
Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.
<br><br>
Ttd,
<br>
***(Mayang Muria Cahyaningsih)***

****untuk source code yang lengkap beserta main nya, ada di folder src***
