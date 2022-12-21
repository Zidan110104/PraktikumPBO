package com.zidanfathannul.pbo.pertemuan3;


public class main {
public static void main(String[] args) {

        //Membuat object dari class Animal
        animal cat = new animal("dewa",20,"White");
        animal dog = new animal("aldi",22,"Pink");
        animal rabbit = new animal("rehan",19,"Green");
        animal dragon = new animal("regi",19,"Red");


        //Memanggil Method
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
        dragon.showProfile();

        System.out.println("Dog's name (before) : " + dog.getName());
        dog.setName("good dog");
        System.out.println("Dog's name (before) : " + dog.getName());
 }
}
