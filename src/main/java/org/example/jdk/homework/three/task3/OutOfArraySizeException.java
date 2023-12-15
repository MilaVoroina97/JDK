package org.example.jdk.homework.three.task3;

public class OutOfArraySizeException extends RuntimeException{

    public OutOfArraySizeException(){
        super("Sizes of arrays are not equal");
    }
}
