package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.products.Burger;
import Creational.AbstractFactory.products.Pizza;
import Creational.AbstractFactory.products.OrientalBurger;
import Creational.AbstractFactory.products.OrientalPizza;

public class OrientalRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new OrientalBurger();
    }

    @Override
    public Pizza createPizza() {
        return new OrientalPizza();
    }

}
