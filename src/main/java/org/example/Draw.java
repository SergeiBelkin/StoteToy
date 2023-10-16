package org.example;

import java.util.ArrayDeque;
import java.util.Queue;

public class Draw {
    Queue queueToy = new ArrayDeque();

    public void addDraw (Object toy){
        queueToy.add(toy);

        System.out.println("Приз  " + toy.toString());
    }
    public Object takeToy (){
        return queueToy.poll();
    }
}
