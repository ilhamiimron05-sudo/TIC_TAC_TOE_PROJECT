Tic Tac Toe - Konsol (Java)
Ringkasan
Program ini merupakan game Tic Tac Toe sederhana berbasis konsol yang dibuat menggunakan Java. Game ini dirancang untuk menerapkan konsep-konsep Pemrograman Berorientasi Objek (OOP), seperti:
> Inheritance melalui penggunaan kelas abstrak Player
> Polymorphism melalui metode makeMove yang dioverride pada HumanPlayer dan AIPlayer
> Encapsulation dengan penggunaan atribut private dan metode getter/setter
> Method Overloading, diimplementasikan pada metode placeMove(int) dan placeMove(int, int)
> Hubungan antar kelas, seperti:
> Composition: GameMain membuat dan memiliki objek Board
> Association: GameMain menggunakan objek Player
> Dependency: HumanPlayer memerlukan objek Scanner untuk input

Daftar File
=>Program terdiri dari beberapa file Java berikut:
  > Player.java
  > HumanPlayer.java
  > AIPlayer.java
  > Board.java
  > GameMain.java

Cara Kompilasi & Menjalankan Program
Kompilasi program dengan perintah:
javac *.java
Jalankan program dengan perintah:
java GameMain

Catatan
Input angka 1 sampai 9 digunakan untuk memilih posisi pada papan permainan, dengan layout sebagai berikut:
 1 | 2 | 3
 ---+---+---
 4 | 5 | 6
 ---+---+---
 7 | 8 | 9
Jika ingin bermain melawan komputer, ketik AI saat diminta memasukkan nama Player kedua.