package org.example;

public abstract class Toy {
    public String name;
    private int probability;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }


    public Toy(String name, int probability) {
        this.name = name;
        this.probability = probability;

    }

}
