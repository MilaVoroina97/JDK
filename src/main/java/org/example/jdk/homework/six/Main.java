package org.example.jdk.homework.six;

import  org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;

public class Main {

    public static double[] numbersList = new double[]{10d, 4d, 120d, 6d, 100d, 783d, 2345d};

    public static void main(String[] args) {
        DescriptiveStatistics ds = new DescriptiveStatistics();
        ds.addValue(5);
        ds.addValue(4);
        ds.addValue(3);
        ds.addValue(3);
        System.out.println("Была использована внешняя библиотека commons.math3 которую использовалась на семинаре.");
        System.out.print(ds.getMean() + " - среднее арифметическое.");

        System.out.println(CombinatoricsUtils.factorial(3));
        System.out.println(ArithmeticUtils.lcm(2, 3));
        System.out.println(ArithmeticUtils.gcd(2, 3));
        System.out.println(ArithmeticUtils.isPowerOfTwo(2));
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics(numbersList);
        System.out.println(descriptiveStatistics.getMean());
    }
}