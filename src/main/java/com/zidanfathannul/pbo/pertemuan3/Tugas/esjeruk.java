
package com.zidanfathannul.pbo.pertemuan3.Tugas;

public class esjeruk {

 //Atrribute
    String nama;
    String keadaan;
    int jml;
    
    //method
    public void disclamer(){
        System.out.println("Soda itu berbahaya, " + keadaan + "!");
    }
    
    public void showInfo(){
        System.out.println(nama + "  ada : " + jml);
        extraInfo();
    }
    
    //penambah method
    public void extraInfo(){}
}
