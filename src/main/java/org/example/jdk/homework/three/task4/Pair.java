package org.example.jdk.homework.three.task4;


/**
 * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь
 * методы getFirst(), getSecond() для получения значений пары, а также переопределение метода toString(),
 * возвращающее строковое представление пары.
 */

public class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("First -> %s : Second -> %s", first.toString(), second.toString());
    }

}
