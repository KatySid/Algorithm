public class Main {
    public static void main(String[] args) {
        int a= 14;
        String s ="Barsik";
        Cat cat = new Cat(s, a);
        Cat[] cats = { new Cat ("Tom", 5), new Cat("Jerry", 10), new Cat("Barsik", 14)};
        long t1= System.nanoTime();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].getName() == cat.getName() && cats[i].getAge() == cat.getAge()){
                System.out.println("Cat "+ cats[i].getName());
            }
        }
        long t2 = System.nanoTime()-t1;
        System.out.println("t2 = "+t2);
        System.out.println(a);
        System.out.println(s);
        System.out.println(cat.toString());


    }
}
