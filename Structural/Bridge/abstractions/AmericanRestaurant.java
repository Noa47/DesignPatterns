package Structural.Bridge.abstractions;

import Structural.Bridge.implementations.Pizza;
public class AmericanRestaurant extends Restaurant {

    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        pizza.setToppings("Everything");
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Super Secret Recipe");
    }

    @Override
    public void makeCrust() {
        pizza.setCrust("Thick");
    }

}

