package org.techtricks;

public class Alien {

    int age;


    private Laptop laptop;


    public Alien() {
        System.out.println("object create");
    }


    public Alien(Laptop laptop) {
        this.laptop = laptop;
    }





    public void code(){

        System.out.println("Coding");

        laptop.run();
    }

}
