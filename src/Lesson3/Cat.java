package Lesson3;

public class Cat implements Comparable{
    String name;
    int age;
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Cat){
            return this.getAge()-((Cat) o).getAge();
        } else {throw new IllegalArgumentException("wrong type"); }

    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Cat %s age %s", name, age);
    }
}
