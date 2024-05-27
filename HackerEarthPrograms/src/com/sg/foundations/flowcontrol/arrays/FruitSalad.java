package com.sg.foundations.flowcontrol.arrays;

public class FruitSalad {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato",
                "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange",
                "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango",
                "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[24];
        int fruitCount = 0;
        int berryCount = 0;
        int appleCount = 0;
        int orangeCount = 0;

        for(String fruitItem : fruit){
            if(fruitItem.contains("berry")){
                if(berryCount<12){
                    fruitSalad[fruitCount] = fruitItem;
                    berryCount++;
                    fruitCount++;
                }
            } else if (fruitItem.contains("Apple")) {
                if(appleCount<3){
                    fruitSalad[fruitCount] = fruitItem;
                    appleCount++;
                    fruitCount++;
                }
            } else if (fruitItem.contains("Orange")) {
                if (orangeCount<2){
                    fruitSalad[fruitCount] = fruitItem;
                    orangeCount++;
                    fruitCount++;
                }
            }else {
                if(!(fruitItem.contains("Tomato"))){
                    fruitSalad[fruitCount] = fruitItem;
                    fruitCount++;
                }
            }
        }
        System.out.println("Total Fruits in Salad : "+fruitCount);
        System.out.println("Display Salad Items : ");
        for(int i=0;i<fruitCount;i++){
            System.out.print(fruitSalad[i]+" ");
        }
    }
}
