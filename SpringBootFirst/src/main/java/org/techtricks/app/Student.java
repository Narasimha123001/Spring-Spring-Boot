package org.techtricks.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    
    Laptop laptop;

    @Autowired  //constructor injections
    public Student(Laptop laptop) {
        this.laptop = laptop;
    }

    public void code(){
        laptop.compile();
    }
}
