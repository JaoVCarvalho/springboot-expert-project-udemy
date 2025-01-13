package io.github.jaovcarvalho.springarchitecture.automaker;

import java.awt.*;

public class Car {

    private Automaker automaker;
    private String model;
    private Integer year;
    private Color color;
    private Engine engine;
    private Key key;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Automaker getAutomaker() {
        return automaker;
    }

    public void setAutomaker(Automaker automaker) {
        this.automaker = automaker;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public CarStatus ignition(Key key){
        if(!key.equals(this.key)){
            return new CarStatus("Invalid key! Unable to start the car!");
        }

        return new CarStatus("Started car!" + this.engine);
    }
}
