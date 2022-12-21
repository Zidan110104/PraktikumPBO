
package com.zidanfathannul.pbo.pertemuan3.Tugas;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" === SODA ===  ");
        System.out.println("   1. Sprite   ");
        System.out.println("   2. Fanta  ");
        System.out.println("   3. CocaCola       ");
        System.out.println("   4. Keluar       ");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = input.nextInt();
        System.out.println();
        eskelapa ek = new eskelapa();
        esjeruk ej = new esjeruk();
        esteh et = new esteh();
        
        ek.nama = "Sprite";
        ek.jml = 2 ;
        ek.keadaan = "tidak baik untuk kesehatan";
        ek.merk = "Sprite";
        
        ej.nama = "fanta ";
        ej.keadaan = "tidak bagus";
        ej.jml = 3 ;
        
        et.nama = "Coca Cola";
        et.jml = 2;
        et.keadaan = "sangat tidak sehat";
        et.merk = " Coca Cola";
        
        
        
        switch(pilihan){
              case 1:
               ek.disclamer();
               ek.showInfo();
               ek.funfact();
               ek.extraInfo();
            break;
            
            case 2:
                ej.disclamer();
                ej.showInfo();
            break;
            
            case 3:
               et.disclamer();
               et.showInfo();
               et.funfact();
               et.extraInfo();
            break;
            
            case 4:
                System.out.println("Silahkan Keluar");
            break;
        }
    }
    
}
