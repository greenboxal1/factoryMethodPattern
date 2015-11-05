package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.ToppingsDecorator;

/**
 * Created by Salvador on 15/10/2015.
 */
public class Lechuga extends ToppingsDecorator {
    Pozole pozole;

    public Lechuga(Pozole pozole){
        this.pozole = pozole;
        this.name = pozole.name;
    }

    @Override
    public String getToppings() {
        return pozole.getToppings() + "\nLechuga";
    }
}
