package Collectionz.list;

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void isName(String name) {
        this.name = name;
    }

    public void isAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return getName() + " : " + getAge();
    }

}

public class clss {
    public static void main(String[] args) {
        Person p = new Person("Rabin", 21);
        System.out.println("Name " + p.getName() + " : " + " age " + p.getAge());
        p.isName("Amit");
        System.out.println("Name " + p.getName() + " : " + " age " + p.getAge());
        System.out.println(p);

    }
}
