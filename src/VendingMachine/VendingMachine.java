package VendingMachine;

import HotDrinkDrink.Drink;

public interface VendingMachine<T extends Drink>  {

    void deviceGaveDrink();

    void  deviceMoney();


}
