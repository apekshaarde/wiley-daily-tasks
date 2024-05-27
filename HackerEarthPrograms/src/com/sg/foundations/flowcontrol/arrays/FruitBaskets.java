package com.sg.foundations.flowcontrol.arrays;

public class FruitBaskets {
    public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
                "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
                "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
                "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
                "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
                "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
                "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
                "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
                "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;

        for (String countFruits : fruitBasket){
            if(countFruits.equals("Orange"))
                numOranges++;
            else if (countFruits.equals("Apple"))
                numApples++;
            else
                numOtherFruit++;
        }

        System.out.println("numOranges count : "+numOranges);
        System.out.println("numApples count : "+numApples);
        System.out.println("numOtherFruits count : "+numOtherFruit);

    }
}
