package org.example;

import java.util.ArrayList;
import java.util.List;

public class Store implements ToyIn{
    List toys = new ArrayList<>();

    @Override
    public void addToy(Toy toy, int qantity) {
        for(int i = 0; i<qantity; i++){

                toys.add(toy);

        }

    }

    @Override
    public void removeToy(Toy toy, int qantity) {

        for(int i = qantity; i>0; i--){
            if(toys.contains(toy)){
                toys.remove(toy);
            }else{
                System.out.println("нет еще"+ i + toy.toString());
                break;
            }
        }

    }
    public void printList(){
        for (Object toy: toys
             ) {
            System.out.println(toy.toString());
        }
    }
}
