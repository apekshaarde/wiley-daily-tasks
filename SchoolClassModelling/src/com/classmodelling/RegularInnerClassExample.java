package com.classmodelling;

public class RegularInnerClassExample {
    public static void main(String[] args) {
       // new Outer().func();

        Outer out = new Outer();
        Outer.Inner ref = out.new Inner();
        ref.in();
    }
}

class Outer{
    private boolean flag;

    class Inner{    //Regular inner class...name should anything
        void in(){
            System.out.println("In inner class in().... method");
        }
    }

    void func(){
        Inner inner = new Inner();  //can create the object of inner class in outesider class means the class in
                                    // which inner class is declared
        inner.in();
    }
}
