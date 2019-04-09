public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    void info() {
        System.out.println(name + " сыт на " + appetite + ".\n" + name + " кушает.");
        String fullBelly = !satiety ? " Сытый!!!" : " будет голодать, так как закончилась еда!!!";
        System.out.println(name + fullBelly);
    }

    public void eat(Plate a) {
        if (satiety == true && a.diminutionFood(appetite) == true) {
            satiety = false;
        }
        System.out.println("********************");
    }
}

