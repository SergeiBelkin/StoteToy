package org.example;

public class ToyConstructor extends Toy{
    @Override
    public String toString() {
        return "ToyConstructor{" +
                "name='" + name + '\'' +
                '}';
    }

    public ToyConstructor(String name, int probability) {
        super(name, probability);
    }
}
