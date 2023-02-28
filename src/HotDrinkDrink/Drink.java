package HotDrinkDrink;

public class Drink {

    private String name;
    private double volume;

    private int  money;

    public Drink() {
    }

    public Drink(String name, double volume, int money) {
        this.name = name;
        this.volume = volume;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public int getMoney() {return money; }
}

