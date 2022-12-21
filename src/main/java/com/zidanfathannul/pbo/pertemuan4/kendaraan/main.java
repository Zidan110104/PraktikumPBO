
package com.zidanfathannul.pbo.pertemuan4.kendaraan;

public class main {
    public static void main(String[] args) {
        //pembuatan object
        //class object
        mobil mb = new mobil();
        bus bs = new bus();
        kendaraan kn = new kendaraan();
        
        
        //memasukan nilai atribut
        mb.nama = "Mitsubishi";
        mb.jmlroda = 4;
        mb.maxGear = 6;
      
        kn.nama = "Kendaraan Misterius";
        kn.jmlroda = 4;
        
        bs.nama = "Boboboy";
        bs.jmlroda = 6;
        bs.dayaAngkut = 20;
        
        //uji coba pemanggilan method
        mb.showInfo();
        mb.nyalakanMesin();
        mb.belok("Kanan");
        mb.belok();
        
        System.out.println();
        kn.showInfo();
        kn.nyalakanMesin();
        
        System.out.println("\n");
        bs.showInfo();
        bs.nyalakanMesin();
        bs.belok("Kiri");
        bs.belok();
       
        
          }
    
}
