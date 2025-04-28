package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.products.Burger;
import Creational.AbstractFactory.products.Pizza;

public abstract class Restaurant {

    // Business logic can be added here or in another class

    public abstract Burger createBurger();

    public abstract Pizza createPizza();

}
