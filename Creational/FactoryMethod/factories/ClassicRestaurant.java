package Creational.FactoryMethod.factories;

import Creational.FactoryMethod.products.Burger;
import Creational.FactoryMethod.products.ClassicBurger;
public class ClassicRestaurant extends Restaurant {

    @Override
    protected Burger createBurger() {
        System.out.println("Creating Classic Burger...");
        return new ClassicBurger();
    }

}
