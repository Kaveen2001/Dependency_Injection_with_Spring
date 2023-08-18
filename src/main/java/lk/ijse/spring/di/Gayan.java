package lk.ijse.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Gayan implements DI {

    public Gayan() {
        // System.out.println("Gayan is Chatting..!");
    }

    // Dependency Injection
    /*
       1).Property Injection
       2).Constructor Injection
       3).Setter Method Injection
       4).Interface Through Injection
     */

    // Property Injection
    /*@Autowired
    GoodGirl sadamali;*/

    // Constructor Injection
    /*GoodGirl sadamali;

    @Autowired
    public Gayan(GoodGirl sadamali) {
        this.sadamali = sadamali;
        System.out.println("Gayan is Chatting..!");
    }*/

    // Setter Method Injection
    /*GoodGirl sadamali;

    @Autowired
    public void setSadamali(GoodGirl sadamali) {
        this.sadamali = sadamali;
        System.out.println("Gayan is Chatting..!");
    }*/

    // Interface Through Injection
    GoodGirl sadamali;


    public void chatWithSadamali() {

        // Method Scope Dependency
        /*Sadamali sadamali = new Sadamali(); // Title Coupling
        sadamali.chat();*/

        sadamali.chat();
    }

    @Qualifier("kaveesha")
    @Autowired
    @Override
    public void inject(GoodGirl sadamali) {
        this.sadamali = sadamali;
        System.out.println("Gayan is Chatting..!");
    }
}
