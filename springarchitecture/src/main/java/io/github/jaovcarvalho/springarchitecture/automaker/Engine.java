package io.github.jaovcarvalho.springarchitecture.automaker;

public class Engine {

    private Integer number;
    private String model;
    private EngineType type;
    private Integer power;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", type=" + type +
                ", power=" + power +
                '}';
    }
}
