package HotDrinkDrink;

public class HotDrink extends Drink{

    int temperature;

    public HotDrink(String name, double volume, int temperature, int money) {
        super(name, volume, money);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "\n\nname = " + super.getName() + "\nvolume = " + super.getVolume() + "\ntemperature = " + temperature + "\nmoney = " + getMoney();
    }


}
