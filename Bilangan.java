/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166017.pbo.lat57;

/**
 *
 * @author User
 * Nama : Silky Afina Saly 
 * NIM : 22166017 
 * Mata Kuliah : Pemrograman Berorientasi Objek 1 
 * Program Studi: Sistem Informasi 
 * Semester : 3
 */
// Kelas Bilangan sebagai super Class
public class Bilangan {
    int x;
    int y;
// konstruktor untuk menginisialisasi x, dan y
    public Bilangan(){
        this.x = 3;
        this.y = 4;
    }   
// Metode getter dan setter
    public int getX(){
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
// kelas untuk menghitung penjumlahan bilangan
class jumlahBilangan extends Bilangan{  
} 
    public double TampilHasilJumlah(){
        return x+y;
    }   
// kelas untuk menghitung pengurangan bilangan   
class selisihBilangan extends Bilangan{
    
}
    public double SelisihBilangan(){
        return x-y;
    }

  public static void main(String[] args) {
 // membuat objek bilangan
        Bilangan jumlah = new Bilangan();
        System.out.println("Hasil Penjumlahan = " +jumlah.TampilHasilJumlah());
        System.out.println("Hasil Selisih "+jumlah.getX()+" - " + jumlah.getY() + " = " +jumlah.SelisihBilangan());
    
}
}
