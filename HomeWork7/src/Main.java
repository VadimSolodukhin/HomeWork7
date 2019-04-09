public class Main {
    public static void main(String[] args) {
        Cat[] arrCats = new Cat[5];
        arrCats[0] = new Cat("Simon", 25);
        arrCats[1] = new Cat("Dimon", 20);
        arrCats[2] = new Cat("Anton", 20);
        arrCats[3] = new Cat("Timon", 15);
        arrCats[4] = new Cat("Ibragim", 30);

        Plate a = new Plate(100);

        for (Cat cat : arrCats) {
            cat.eat(a);
            cat.info();
        }
        a.info();
        a.addFood(100);
        a.info();
    }
}

