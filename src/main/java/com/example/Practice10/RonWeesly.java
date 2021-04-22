package com.example.Practice10;

import org.springframework.stereotype.Component;

@Component
public class RonWeesly implements Magican {
    @Override
    public void doMagic() {
        System.out.println("Рон колдует магию.");
    }
}
