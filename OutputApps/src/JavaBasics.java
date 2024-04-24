//class A {
//    int i;
//    int j;
//
//    public String toString() {
//        return "Class A";
//    }
//}
//public class StringQuiz {
//    public static void main(String... args) {
//        String str = null;
//        System.out.println(str);
//
//
//        Object obj = new Object();
//        System.out.print(obj.getClass());
//
//        A obj1;
//        System.out.println(obj1);
//
//
//        A a1 = new A();
//        System.out.println(a1);
////        a1.i=10;
////        A a2 = new A();
////        a2.i=10;
////
////        System.out.println(a1==a2);
////        System.out.println(a1.equals(a2));
//    }
//}

//public class StringQuiz{
//    public static void print(Integer i) {
//        System.out.println(2 * i);
//    }
//    public static void print(String s) {
//        System.out.println(s);
//    }
//    public static void main(String[] args) {
//        print("5");
//        byte b = 50;
//        b = (byte) (b * 50);
//    }
//}
//class A {
//    public void test() {
//        System.out.println("testA ");
//    }
//    public void test(String args) {
//        this.test();
//        System.out.println("testA " + args);
//    }
//}
//public class StringQuiz extends A {
//    public void test() {
//        System.out.println("testB ");
//    }
//    public static void main(String args[]) {
//        A obj = new StringQuiz();
//        obj.test("check");
//    }
//}
//
//class A{
//    int b=20;
//    private A(){
//        this.b=8;
//    }
//    int f(){
//        return b;
//    }
//}
//class B extends A{
//    int b;
//}
//public class StringQuiz{
//    public static void main(String[] args){
//        A a = new B();
//        System.out.println(a.f());
//    }
//}
//
//class A {
//    public void test() {
//        System.out.println("testA ");
//    }
//    public void test(String args) {
//        this.test();
//        System.out.println("testA " + args);
//    }
//}
//public class StringQuiz extends A {
//    public void test() {
//        System.out.println("testB ");
//    }
//    public static void main(String args[]) {
//        A obj = new StringQuiz();
//        obj.test("check");
//    }
//}

class Mammal{
    void eat(Mammal m){
        System.out.println("Mammal eats food");
    }
}
class Cattle extends Mammal{
    void eat(Cattle c){
        System.out.println("Cattle eats hay");
    }
}
class Horse extends Cattle{
    void eat(Horse h){
        System.out.println("Horse eats hay");
    }
}
public class JavaBasics {
    public static void main(String[] args){
        Mammal h = new Horse();
        Cattle c = new Horse();
        Horse s = new Horse();
        c.eat(s);
    }
}