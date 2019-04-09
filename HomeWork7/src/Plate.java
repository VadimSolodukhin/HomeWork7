public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean diminutionFood(int a) {
        int difference = food - a;
        if (difference < 0) return false;
        food -= a;
        return true;
    }

    public void info() {
        System.out.println("В миске: " + food + " еды!");
    }

    public void addFood(int food) {
        System.out.println("********************\nДобавили еды в миску: " + food);
        this.food += food;
    }
}
