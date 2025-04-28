package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.products.Burger;
import Creational.AbstractFactory.products.Pizza;
import Creational.AbstractFactory.products.ClassicBurger;
import Creational.AbstractFactory.products.ClassicPizza;

public class ClassicRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new ClassicBurger();
    }

    @Override
    public Pizza createPizza() {
        return new ClassicPizza();
    }

}
