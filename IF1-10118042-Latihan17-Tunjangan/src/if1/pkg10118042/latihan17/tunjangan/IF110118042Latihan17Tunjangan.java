/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan17.tunjangan;

import java.util.Scanner;
/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk menghitung tunjangan
 */
public class IF110118042Latihan17Tunjangan {
    double gaji;
    String status;
    
    public void tunjangan(){
        System.out.println("==========Program Tunjangan==========");
        
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        Scanner gaji1 = new Scanner(System.in);
        
        gaji = gaji1.nextDouble();
        
        System.out.print("Status anda ? (Menikah/Belum)\t: ");
        Scanner status1 = new Scanner(System.in);
        
        status = status1.nextLine();   
    } 
    public void hitung(){
        //variabel lokal
        double tunjangan;
        double total;
        
        tunjangan = status.equals("Menikah")?0.35*gaji:0;
        total = gaji + tunjangan;
        
        System.out.println();
        System.out.println("===========Hasil Perhitungan=========");
        System.out.println("Gaji Pokok\t\t: Rp. " + gaji);
        System.out.println("Tunjangan\t\t: Rp. " + tunjangan);
        System.out.println("Total Gaji\t\t: Rp. " + total);
        System.out.println("(Developed by : Dhimas Aji G)");
        
        
    }
    public static void main(String[] args) {
       IF110118042Latihan17Tunjangan Tunjangan = new IF110118042Latihan17Tunjangan();
       Tunjangan.tunjangan();
       Tunjangan.hitung();
    }
    
}
