package org.example;

public class ToyCar extends Toy{


    public ToyCar(String name, int probability) {
        super(name, probability);
    }

    @Override
    public String toString() {
        return "ToyCar{" +
                "name='" + name + '\'' +
                '}';
    }
}
