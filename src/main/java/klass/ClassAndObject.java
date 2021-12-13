package klass;

public class ClassAndObject {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
        person.name = "Tarik";
        person1.name = "Roma";
        person.age = 21;
        person1.age = 20;
        person.sayHello();
        person1.speak();
        person1.sayHello();
    }
    static class Person {
        String name;
        int age;

        void sayHello() {
            for (int x = 0; x < 3; x++)
                System.out.println("QQ");
        }

        void speak() {
            System.out.println(" Mne " + age + " я " + name);
        }

    }
}
