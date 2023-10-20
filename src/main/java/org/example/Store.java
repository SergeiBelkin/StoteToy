package org.example;

import java.util.ArrayList;
import java.util.List;

public class Store implements ToyIn{
    List toys = new ArrayList<>();

    @Override
    public void addToy(Toy toy, int qantity) {
        int id = toy.getId();
        for(int i = 0; i<qantity; i++){
            System.out.println(id);
                toys.add(toy);
                toy.setId(id++);

        }

    }

    @Override
    public void removeToy(Toy toy, int qantity) {
        int id = toy.getId();
        for(int i = qantity; i>0; i--){
            if(toys.contains(toy)){
                toys.remove(toy);
                toy.setId(id--);
            }else{
                System.out.println("нет еще"+ i + toy.toString());
                break;
            }
        }

    }

    public Object getToy(int index){
        return toys.remove(index);

    }

    public void printList(){
        for (Object toy: toys
             ) {
            System.out.println(toy.toString());
        }
    }
}
