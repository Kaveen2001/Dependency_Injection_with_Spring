package lk.ijse.spring.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Sadamali implements GoodGirl{

    @Override
    public void chat() {
        System.out.println("Sadamali is Chatting..!");
    }
}
