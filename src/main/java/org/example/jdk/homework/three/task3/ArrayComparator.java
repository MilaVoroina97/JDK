package org.example.jdk.homework.three.task3;

import java.util.Arrays;

/**
 * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
 * если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
 * но должны иметь одинаковую длину и содержать элементы одного типа.
 */

public class ArrayComparator {
    public <E, T> boolean compareArrays(E[] array1, T[] array2) throws OutOfArraySizeException, NotArrayTypeException {
        if (array1.length != array2.length) throw new OutOfArraySizeException();
        if (array1.getClass() != array2.getClass()) throw new NotArrayTypeException();
        return Arrays.equals(array1, array2);
    }
}
