package com.onepoint8;

interface CalculateLength{
    int getLength(String name);
}

interface FindMax{
    int getMax(int a,int b);
}

interface CheckStringBlankOrNot{
    boolean checkString(String str);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {

        CalculateLength calculateLength = (name) -> name.length();

        int lengthOfName = calculateLength.getLength("Apeksha");
        System.out.println("Length of Name is : "+lengthOfName);

        FindMax findMax = (a,b) -> a > b ? a : b;
        int getMax = findMax.getMax(10,34);
        System.out.println("Max is: "+getMax);

        CheckStringBlankOrNot checkStringBlankOrNot = (str) -> str.isBlank();
        boolean result = checkStringBlankOrNot.checkString(" GHJH");
        if(result){
            System.out.println("Blank");
        }else{
            System.out.println("Not blank");
        }
    }
}
