package Structural.Composite;

import Structural.Composite.products.Book;
import Structural.Composite.products.VideoGame;

public class MainApp {
    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
                new CompositeBox(
                        new VideoGame("1", 100)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("2", 200),
                                new Book("3", 300)
                        ),
                        new VideoGame("4", 400),
                        new VideoGame("5", 500)
                )
        );
        System.out.println(deliveryService.calculateOrderPrice());

    }

}
/*Le Composite Pattern est un modèle structurel qui permet de 
traiter de manière uniforme des objets simples et des groupes 
d'objets (composites).
En Java, on l’utilise pour construire des structures d'arbres 
(comme les menus, dossiers/fichiers) où les objets individuels 
et les groupes sont manipulés de la même façon.

Interface ou classe abstraite (Component) → définit les opérations communes aux objets simples et composites.
Classe concrète (Leaf) → représente les objets simples (sans enfants).
Classe concrète (Composite) → contient des enfants (d'autres Component) et délègue les opérations à ses sous-objets.
*/