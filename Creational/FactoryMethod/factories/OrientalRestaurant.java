package Creational.FactoryMethod.factories;

import Creational.FactoryMethod.products.Burger;
import Creational.FactoryMethod.products.OrientalBurger;
public class OrientalRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        System.out.println("Creating Oriental Burger...");
        return new OrientalBurger();
    }

}

