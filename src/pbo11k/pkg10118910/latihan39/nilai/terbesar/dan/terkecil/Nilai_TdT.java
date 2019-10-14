/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan39.nilai.terbesar.dan.terkecil;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Muhamad Syifa Amruloh
 * KELAS    : IF11K
 * NIM      : 10118910
 * 
 * Deskripsi Program : Program ini berisi program untuk Menampilkan Nilai Terbesar dan Terkecil
 * dari nilai hasil inputan dengan konsep Objek
 */
public class Nilai_TdT {

    
    Scanner input = new Scanner(System.in);
    ArrayList nilai = new ArrayList();
    private int ninput;
    private String namap;
    
    private void input_nilai(int i, String Nama_p) {
        int n, l, h = 0;
        for (int j = 0; j < i; j++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + (j + 1) + " = ");
            n = input.nextInt();
            nilai.add(n);
        }
        System.out.println("\n==========Hasil Nilai Mahasiswa ==========");
        for (int k = 0; k < i; k++) {
            System.out.println("Nilai Mahasiwa ke-" + (k + 1) + " " + nilai.get(k));            
        }
        
        for (int j = 0; j < i; j++) {
            if((int)nilai.get(j) > h)
               h = (int)nilai.get(j);
        }
        
        l = (int)nilai.get(0);
        for (int j = 0; j < i; j++) {
            if((int)nilai.get(j) < l)
                l = (int)nilai.get(j);
        }
        System.out.println("\nNilai terbesar adalah : " + h);
        System.out.println("Nilai terkecil adalah : " + l);
        System.out.println("\nNama Petugas : " + Nama_p);
        
    }
    public void show(){
        System.out.println("========== Program Nilai Terbesar dan Nilai Terkecil Nilai Mahasiswa ==========");
        System.out.print("Masukan nama Petugas : ");
        namap = input.nextLine();
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        ninput = input.nextInt();
        input_nilai(ninput,namap);
    }

    public static void main(String[] args) {
        Nilai_TdT nlt= new Nilai_TdT();
        nlt.show();
    }
    
}
