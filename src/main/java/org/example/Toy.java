package org.example;

public abstract class Toy {
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int weight;
    private int id;
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
