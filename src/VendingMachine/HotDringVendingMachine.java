package VendingMachine;

import HotDrinkDrink.Drink;
import HotDrinkDrink.HotDrink;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotDringVendingMachine<T extends Drink> implements VendingMachine {

    protected List<HotDrink> hotDrinks;


    public HotDringVendingMachine() {
        this.hotDrinks = new ArrayList<>();

    }


    public void addHotDrink(HotDrink hotDrink){
        hotDrinks.add(hotDrink);
    }
    public List<HotDrink> getHotDrinks(){
        return hotDrinks;
    }

    @Override
    public void deviceGaveDrink(){
        System.out.println("Аппарат выдал напиток -->");
    }
    @Override
    public void  deviceMoney(){
        System.out.println("Принять деньги");
    }

    public void buyHotDrinks() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("\nВведите названия напитка :\n");
        for (HotDrink hD : hotDrinks) {
            System.out.print(hD.getName() + "  ");
        }
        System.out.print("\nВвести : ");
        String insertHotDrink = iScanner.nextLine();
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getName().equals(insertHotDrink)) {
                System.out.println("Внесите деньги : " + hotDrink.getMoney());
                System.out.print("Внесение суммы: ");
                String gave = iScanner.nextLine();
                int gaveName = Integer.parseInt(gave);
                if (gaveName == hotDrink.getMoney()) {
                    deviceMoney();
                    deviceGaveDrink();
                    System.out.println(hotDrink);

                }
            }
        }
    }
}
