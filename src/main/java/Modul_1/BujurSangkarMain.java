package Modul_1;//deklarasi package Modul_1

import java.util.Scanner;//import scanner

public class BujurSangkarMain {//deklarasi class BujurSangkarMain

    public static void main(String[] args) {//deklarasi metode main sebagai metode utama 
        BujurSangkar bujur1 = new BujurSangkar();
        BujurSangkar bujur2 = new BujurSangkar();

        Scanner tombol = new Scanner(System.in);
        System.out.print("Masukkan sisi bujur sangkar I : ");
        bujur1.sisi = tombol.nextInt();

        System.out.print("Masukkan sisi bujur sangkar II : ");
        bujur2.sisi = tombol.nextInt();

        System.out.println("Luas Bujur Sangkar dengan sisi = " + bujur1.sisi + " adalah " + bujur1.luas());
        System.out.println("Luas Bujur Sangkar dengan sisi = " + bujur2.sisi + " adalah " + bujur2.luas());

    }
}
