package com.classmodelling;

public class RegularInnerClassExample {
    public static void main(String[] args) {
       // new Outer().func();

//        Outer out = new Outer();
//        Outer.Inner ref = out.new Inner();
//        ref.in();

        new Outer().new Inner().in();
    }
}

class Outer{
    private boolean flag; //Outer instance variable

    class Inner{    //Regular inner class...name should anything
        private boolean flag;  //Inner instance variable
        void in(){
            boolean flag = true;  //inner local variable
            System.out.println("In inner class in().... method");
            System.out.println(flag);  // regular inner class local variable
            System.out.println(this.flag);  // regular inner class instance variable
            System.out.println(Outer.this.flag); // this is outer class instance variable
        }
    }

    void func(){
        Inner inner = new Inner();  //can create the object of inner class in outesider class means the class in
                                    // which inner class is declared
        inner.in();
    }
}
