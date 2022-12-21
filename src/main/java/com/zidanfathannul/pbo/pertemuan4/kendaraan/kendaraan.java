
package com.zidanfathannul.pbo.pertemuan4.kendaraan;

    
public class kendaraan {
    //Atrribute(variabel)
    String nama;
    int jmlroda;
    
    //method (fungsi)
    public void nyalakanMesin(){
        System.out.println("Mesin" + nama + "telah dinayalakan!");
    }
    
    public void showInfo(){
        System.out.println("Nama     : " + nama );
        System.out.println("jml roda : " + jmlroda);
        extraInfo();
    }
    
    public void extraInfo(){
    }
}
