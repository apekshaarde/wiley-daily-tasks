package com.onepoint8;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionWithCollection {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Javed","Lokesh","Karan"));


        names.add("Bob");
        names.add("Lokesh");
        names.add("Karan");

        names.set(1, "John");

        names.forEach(v-> System.out.println(v.toUpperCase()));

    }
}
