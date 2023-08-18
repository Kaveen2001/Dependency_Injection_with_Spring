package lk.ijse.spring.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Kaveesha implements GoodGirl{

    @Override
    public void chat() {
        System.out.println("Kaveesha is Chatting..!");
    }
}
