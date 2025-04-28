package Structural.Bridge;

import Structural.Bridge.abstractions.*;
import Structural.Bridge.implementations.*;
public class MainApp {

    public static void main(String[] args) {

        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();

    }

}

/*
  Le Bridge Pattern est un modèle structurel qui sépare une abstraction de son 
implémentation pour qu’elles puissent évoluer indépendamment.
En Java, il est utilisé pour éviter une explosion de sous-classes quand il y 
a plusieurs façons de combiner abstraction et implémentation.


Interface ou classe abstraite (Abstraction) → définit les grandes actions que peut faire l'objet.
Classe concrète (RefinedAbstraction) → ajoute plus de détails sur l'abstraction si besoin.
Interface (Implementor) → définit l'interface pour les implémentations concrètes.
Classe(s) concrète(s) (ConcreteImplementor) → fournissent la vraie logique derrière l'implémentation.
 */