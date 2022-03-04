/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class SuperClass { 
    Scanner input = new Scanner(System.in);
    public String nama;
    private String makanan, jenis, tipe;
    private double berat;
    
    void food () {
        System.out.print("Masukkan Makanan : ");
        makanan = input.nextLine();
        
    }
    void type () {
        System.out.print("Masukkan Tipe (hanya : jinak/liar) : ");
        tipe = input.nextLine();
    }
    void character () {
        System.out.print("Masukkan Jenis (hanya herbivora/karnivora) : ");
        jenis = input.nextLine();
    }
    String name () {
        System.out.print("Masukkan Nama Hewan(huruf harus kecil semua) : ");
        nama = input.nextLine();
        return nama;
    }
    void weight () {
        System.out.print("Masukkan Berat Hewan : ");
        berat = input.nextDouble();
    }
    void show () {
        System.out.println("Nama Hewan : "+nama);
        System.out.println("Makanan : "+makanan);
        System.out.println("Jenis : "+jenis);
        System.out.println("Tipe : "+tipe);
        System.out.println("Berat : "+berat);
    }
}
