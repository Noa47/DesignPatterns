package Creational.FactoryMethod;

import Creational.FactoryMethod.factories.ClassicRestaurant;
import Creational.FactoryMethod.factories.OrientalRestaurant;
import Creational.FactoryMethod.factories.Restaurant;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/EdFq_JIThqM
     */
    public static void main(String[] args) {

        Restaurant orientalRestaurant = new OrientalRestaurant();
        orientalRestaurant.orderBurger();

        System.out.println("==========================================");

        Restaurant classicRestaurant = new ClassicRestaurant();
        classicRestaurant.orderBurger();

    }

}
/* Le Factory Method est un modèle de création d'objets qui 
permet de créer des objets sans spécifier la classe exacte de 
l'objet créé. Ça sert à éviter de répéter du code commun. En Java, 
on l'utilise pour faire des bases solides et personnalisables. 

Classe abstraite ou interface (Creator) → déclare la factory method.

Classe concrète (ConcreteCreator) → implémente la factory method pour retourner un objet spécifique.

Interface ou classe (Product) → type des objets créés.

Classe concrète (ConcreteProduct) → implémentation réelle du produit.
*/