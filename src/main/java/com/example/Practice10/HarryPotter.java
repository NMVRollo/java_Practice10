package com.example.Practice10;

import org.springframework.stereotype.Component;

@Component
public class HarryPotter implements Magican {
    @Override
    public void doMagic() {
        System.out.println("Гарри колдует магию.");
    }
}
