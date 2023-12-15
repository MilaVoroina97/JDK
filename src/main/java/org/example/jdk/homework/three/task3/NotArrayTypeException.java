package org.example.jdk.homework.three.task3;

public class NotArrayTypeException extends RuntimeException{

    public NotArrayTypeException(){
        super("Types of these arrays are not equal");
    }
}
