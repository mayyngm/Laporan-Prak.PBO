# Laporan Praktikum 1 - Pengantar Konsep PBO<br>
# Kompetensi <br>
Setelah menempuh materi percobaan ini, mahasiswa mampu mengenal:<br>
1. Perbedaan paradigma berorientasi objek dengan paradigma struktural<br>
2. Konsep dasar PBO<br>

## Ringkasan Materi<br>
1. Di lingkaran merah bawah output menampilkan "warna: null". karena pada dasar nya method warna di objek "spd1" tidak di beri data dan otomatis akan menampilkan output "null" meskipun method warna tidak dipanggil.<br>
![ringkasan materi](https://github.com/mayyngm/laporan-praktikum-pbo-2019/blob/master/docs/1_Pengantar_Konsep_PBO/img/img/materi.PNG) 
2. Extends antara cucu ke kakek. class di cucu dapat di extends ke class bapak. di [SepedaKhusus.java](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/src/1_Pengantar_Konsep_PBO/SepedaKhusus1841720003Mayang.java) class tersebut di extends ke class SepedaGunung,kenapa? ya karena agar dapat mengakses method yang ada di class SepedaGunung. 
<br>fungsi dari modifier "protected" adalah agar objek tersebut hanya bisa di akses oleh class itu sendiri. kode "super" sendiri adalah kode yang di pakai untuk mewakili class induknya.
berikut contohnya:<br>
![Sepeda Khusus](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/docs/1_Pengantar_Konsep_PBO/img/img/SepedaKhusus.PNG)<br>
dan di bawah ini adalah main beserta hasil outputnya:
![extend 3 turunan](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/docs/1_Pengantar_Konsep_PBO/img/img/extends3.PNG)
<br>

## <b>Percobaan</b><br>
### Percobaan 1
Didalam percobaan ini, kita akan mendemonstrasikan bagaimana membuat class, membuat object, kemudian mengakses method didalam class tersebut.<br>
![script sepeda](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/docs/1_Pengantar_Konsep_PBO/img/img/Sepeda.PNG)<br>
Link menuju script --> [klik disini](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/src/1_Pengantar_Konsep_PBO/Sepeda1841720003Mayang.java)<br><br>
Lalu kita akan membuat class main yang dimana berisi code untuk memanggil method yang ada di class Sepeda.
![script sepeda demo](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/docs/1_Pengantar_Konsep_PBO/img/img/SepedaDemo1.PNG)<br>
Link menuju script --> [klik disini](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/src/1_Pengantar_Konsep_PBO/SepedaDemo1841720003Mayang.java)
<br><br>

### Percobaan 2<br>
Didalam percobaan ini, akan didemonstrasikan salah satu fitur yang paling penting dalam PBO, yaitu inheritance. Disini kita akan membuat class SepedaGunung yang mana adalah turunan/warisan dari class Sepeda. Pada dasarnya class SepedaGunung adalah sama dengan class Sepeda, hanya saja pada sepeda gunung terdapat tipe suspensi. Untuk itu kita tidak perlu membuat class Sepeda Gunung dari nol, tapi kita wariskan saja class Sepeda ke class SepedaGunung.<br>
![script sepeda gunung](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/docs/1_Pengantar_Konsep_PBO/img/img/SepedaGunung.PNG)<br>
Link menuju script --> [klik disini](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/src/1_Pengantar_Konsep_PBO/SepedaGunung1841720003Mayang.java)<br><br>
Lalu kita ubah sedikit dibagian Class main SepedaDemo, kita tambahi code untuk memanggil method dari class SepedaGunung yang dimana merupakan extends dari class Sepeda
![script sepeda demo 1](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/docs/1_Pengantar_Konsep_PBO/img/img/SepedaDemo2.PNG)<br>
Link menuju script --> [klik disini](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/src/1_Pengantar_Konsep_PBO/SepedaDemo1841720003Mayang.java)
<br><br>

## <b>Pertanyaan</b>
1.  Sebutkan dan jelaskan aspek-aspek yang ada pada pemrograman berorientasi objek!<br>
    Jawab:<br>
    - Object adalah suatu rangkaian dalam program yang terdiri dari state dan behaviour.<br>
    - Class adalah kumpulan fungsi-fungsi<br>
    - Enkapsulasi adalah mekanisme pemrograman yang membungkus kode dan data yang di manipulasi. Caranya yaitu dengan membentuk objek.<br>
    - Inheritance disebut juga pewarisan.<br>
    - Polimorfisme juga meniru sifat objek di dunia nyata, dimana sebuah objek dapat memilik bentuk, atau menjelma menjadi bentuk-bentuk lain.<br>
2.	Apa yang dimaksud dengan object dan apa bedanya dengan class?<br>
    Jawab:<br>
    Objek adalah suatu rangkaian dalam program yang terdiri dari state dan behavior yang di modelkan sedemikian rupa sehingga mirip dengan objek yang ada di dunia nyata. Bedanya dengan class adalah class sebagai bungkusnya atau tempatnya. Setiap program harus dibungkus di dalam class agar nanti bisa dibuat menjadi objek. <br>
3.	Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan dengan pemrograman struktural!<br>
    Jawab:<br>
    Penggunaan kembali kode program lebih tinggi, jadi lebih ringkas.<br>
4.	Pada class Sepeda, terdapat state/atribut apa saja?<br>
    Jawab:<br>
    spd1, spd2, spd3<br>
5.	Tambahkan atribut warna pada class Sepeda.<br>
    Jawab:<br>
    penambahan method warna di class sepeda<br>
    ![script tambahan warna](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/docs/1_Pengantar_Konsep_PBO/img/img/Warna.PNG)<br>
    Link menuju script --> [klik disini](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/src/1_Pengantar_Konsep_PBO/SepedaGunung1841720003Mayang.java)<br><br>
    yang lalu method warna di panggil ke class SepedaDemo<br>
    ![script tambahan warna ](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/docs/1_Pengantar_Konsep_PBO/img/img/Warna2.PNG)<br>
    Link menuju script --> [klik disini](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/src/1_Pengantar_Konsep_PBO/SepedaDemo1841720003Mayang.java)<br>
6.	Mengapa pada saat kita membuat class SepedaGunung, kita tidak perlu membuat class nya dari nol?<br>
    Jawab:<br>
    Karena kita hanya memperluas fungsi dari fungsi yang sebelumnya, dalam artian kita hanya menambahkan fungsi lain karena objek tersebut adalah turunan dari objek yang sebelumnya.<br><br>

## <b>Tugas</b>
Buatlah program yang merupakan class dari objek yang ada dunia nyata sesuai dengan imajinasi anda. Silahkan merujuk pada kode program praktikum yang sudah kita lakukan sebelumnya untuk sintak-sintak nya<br>
Pertama, kita harus membuat method di class Laptop yang terdiri dari merk, series, windows, microsoft, biaya.<br>
![script laptop](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/docs/1_Pengantar_Konsep_PBO/img/img/Laptop.PNG)<br>
Link menuju script --> [klik disini](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/src/1_Pengantar_Konsep_PBO/Laptop1841720003Mayang.java)<br>
ini adalah class turunan dari class Laptop.<br>
![script inheritance laptop](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/docs/1_Pengantar_Konsep_PBO/img/img/LaptopColor.PNG)<br>
Link menuju script --> [klik disini](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/src/1_Pengantar_Konsep_PBO/LaptopColor1841720003Mayang.java)<br>
dan ini adalah class main berserta hasil outputnya.<br>
![script output](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/docs/1_Pengantar_Konsep_PBO/img/img/LaptopAhoyy.PNG)<br>
Link menuju script --> [klik disini](https://github.com/mayyngm/Laporan-Prak.PBO/blob/master/src/1_Pengantar_Konsep_PBO/LaptopAhoy1841720003Mayang.java)
<br>

## <b>Kesimpulan</b>
Kita ketahui bahwa SepedaGunung pada dasarnya adalah sama dengan Sepeda (memiliki gear, memiliki kecepatan, dapat menambah kecepatan, dapat mengerem, pindah gigi, dsb) namun ada fitur tambahan yaitu tipe suspensi. Maka kita tidak perlu membuat class SepedaGunung dari nol, kita extends atau wariskan saja dari class Sepeda, kemudian kita tinggal tambahkan fitur yang sebelumnya belum ada di class Sepeda. Inilah salah satu kelebihan PBO yang tidak ada di pemrograman struktural.<br>

## <b>Pernyataan Diri</b>
Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.<br><br>
Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.<br>

Ttd,<br>
***(Mayang Muria Cahyaningsih)***
