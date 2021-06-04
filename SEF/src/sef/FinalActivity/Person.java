package sef.FinalActivity;

public class Person {

    private String name;
    private int age;

    public Person(){
        this.name = "unknown";
        this.age = 0;
    }

        public String getName() {
        return name;
    }

        public void setName(String name) {
        this.name = name;
    }

        public int getAge() {
        return age;
    }

        public void setAge(int age) {
        this.age = age;
    }

    public void introducePerson(){
    System.out.println("My name is " + name + " and i am " + age + " years old.");
}
}
