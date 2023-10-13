package org.example;

public class ToyDoll extends Toy{

    @Override
    public String toString() {
        return "ToyDoll{" +
                "name='" + name + '\'' +
                '}';
    }

    public ToyDoll(String name, int probability) {
        super(name, probability);
    }
}
