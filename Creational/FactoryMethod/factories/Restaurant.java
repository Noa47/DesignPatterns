package Creational.FactoryMethod.factories;

import Creational.FactoryMethod.products.Burger;
public abstract class Restaurant {

    public void orderBurger() {
        System.out.println("Ordering Burger...");
        Burger burger = createBurger();
        burger.prepare();
    }

    protected abstract Burger createBurger();

}
