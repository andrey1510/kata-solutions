package other.t;

public class Cat {
    String name;

    private static Cat renameCat(Cat cat) {
        System.out.print(cat.name);
        Cat cat1 = new Cat();
        cat1.name = "Mia";
        return cat1;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Yuna";
        Cat cat1 = renameCat(cat);
        System.out.print(cat1.name);
    }
}