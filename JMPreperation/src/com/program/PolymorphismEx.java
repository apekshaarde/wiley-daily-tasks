package com.program;

abstract class Value{
    int a,b;

    public Value(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("Hello");
    }

    abstract int getResult();
}

class Addition extends Value{
    public Addition(int a,int b){
        super(a,b);
    }

    @Override
    int getResult() {
        return a+b;
    }
}
class Multiplication extends Value{

    public Multiplication(int a,int b){
        super(a,b);
    }

    public int getResult(){
        return a * b;
    }
}
class Calculator{
    private Value v;
    public Calculator(Value v){
        this.v = v;
    }

    public void getOperation(){
        int result = v.getResult();
        System.out.println("Result is : "+result);
    }
}
public class PolymorphismEx
{
    public static void main(String[] args) {
        Value v = new Addition(10,20);
        Calculator c = new Calculator(v);
        c.getOperation();

        v = new Multiplication(2,3);
        Calculator c1 = new Calculator(v);
        c1.getOperation();

    }
}
