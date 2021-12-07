package Lesson6;

public class Person implements Comparable{
    public String name;
    public int id;
    public int age;

    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int result;
        if (o instanceof Person){
            int i = ((Person)o).id;
            if ( i < this.id){
                result = 1;
            } else {
                result = -1;
            }
            if (i == this.id){
                result = 0;
            }
            return result;
        } else {
            throw new ClassCastException();
        }

    }
}
