package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    public void myWriter(String text){

        try(FileWriter rec = new FileWriter("Readme.txt")){
            rec.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
