package com.onepoint8;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionWithCollection {
    static List<String> getValidNames(List<String> names){
        List<String> validNames = new ArrayList<>();

        for(String str : names){
            int count = 0;
            String word[] = str.split(" ");
            for(String s : word){
                count++;
            }
            if(count>=2){
                validNames.add(str);
            }
        }
        return validNames;
    }

    static List<String> getShortNames(List<String> names){
        List<String> shortNames = new ArrayList<>();
        for (String s : names){
            String words[] = s.split(" ");
            StringBuilder getInitials = new StringBuilder();
            for (String word : words) {
                getInitials.append(word.charAt(0));
            }
            shortNames.add(getInitials.toString());
        }
        return shortNames;
    }

    public static void main(String[] args) {


        List<String> list = List.of("Harsh Kumar","Virat Kohli","Mahendra Singh Dhoni","Akash","Karan Chopra");

        List<String> validNames = getValidNames(list);
        validNames.forEach(v-> System.out.println(v));

        List<String> shortNamesList = getShortNames(list);
        shortNamesList.forEach(v-> System.out.println(v));
    }
}
