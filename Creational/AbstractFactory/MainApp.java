package Creational.AbstractFactory;

import Creational.AbstractFactory.factories.ClassicRestaurant;
import Creational.AbstractFactory.factories.OrientalRestaurant;
import Creational.AbstractFactory.products.Burger;
import Creational.AbstractFactory.products.Pizza;
import Creational.AbstractFactory.factories.Restaurant;
public class MainApp {

    public static void main(String[] args) {

        Restaurant orientalRestaurant = new OrientalRestaurant();
        Restaurant classicRestaurant = new ClassicRestaurant();

        Pizza classicPizza = classicRestaurant.createPizza();
        Burger classicBurger = classicRestaurant.createBurger();
        Pizza orientalPizza = orientalRestaurant.createPizza();
        Burger orientalBurger = orientalRestaurant.createBurger();

        classicPizza.bake();
        classicBurger.prepare();
        orientalPizza.bake();
        orientalBurger.prepare();


    }
}
/* AbstractFactory est un FactoryMethod mais qui contient plusieurs familles. 

Interface ou classe abstraite (AbstractFactory) → définit des méthodes pour créer chaque type de produit.
Classe concrète (ConcreteFactory) → crée les familles spécifiques de produits.
Interface(s) (AbstractProductA, AbstractProductB, etc.) → types abstraits de produits.
Classes concrètes (ConcreteProductA1, ConcreteProductB1, etc.) → produits réels créés.

*/
