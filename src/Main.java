import HotDrinkDrink.HotDrink;
import VendingMachine.HotDringVendingMachine;

public class Main {

    public static void main(String[] args){

        HotDrink coffee = new HotDrink("coffee", 0.1, 50, 100);
        HotDrink tea = new HotDrink("tea", 0.2, 40, 50);
        HotDrink capushino = new HotDrink("capushino", 0.25, 55, 90);
        HotDrink americano = new HotDrink("americano", 0.15, 60, 120);

        HotDringVendingMachine hotDringVendingMachine = new HotDringVendingMachine();

        hotDringVendingMachine.addHotDrink(coffee);
        hotDringVendingMachine.addHotDrink(tea);
        hotDringVendingMachine.addHotDrink(capushino);
        hotDringVendingMachine.addHotDrink(americano);

        System.out.println(hotDringVendingMachine.getHotDrinks());

        hotDringVendingMachine.buyHotDrinks();


    }
}
