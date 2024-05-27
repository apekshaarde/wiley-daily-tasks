
final class Person{
    private final String name;
    private final int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

public class FinalClassEx {
    public static void main(String[] args) {
        Person person = new Person("Apeksha",23);
        System.out.println("Name is : "+person.getName());
        System.out.println("Age is : "+person.getAge());


        //person.setAge(33);
    }
}
