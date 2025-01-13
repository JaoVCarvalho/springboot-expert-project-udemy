package io.github.jaovcarvalho.springarchitecture.automaker;

import java.awt.*;

public class Corolla extends Car{

    public Corolla(Engine engine) {
        super(engine);
        setModel("Corolla Altis Hybrid");
        setYear(2025);
        setAutomaker(Automaker.TOYOTA);
        setColor(Color.WHITE);
        setKey(new Key(Automaker.TOYOTA, KeyType.PROXIMITY));

    }
}
