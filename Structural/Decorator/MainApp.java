package Structural.Decorator;

public class MainApp {

    public static void main(String[] args) {

        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new Notifier("Geekific")));
        notifyAll.send("Like and Subscribe!!!");

        System.out.println("==========================================");

        INotifier notifyFbMail = new FacebookDecorator(new Notifier("Geekific"));
        notifyFbMail.send("Like and Subscribe!!!");

    }

}

/*
Le Decorator Pattern est un modèle structurel qui permet d'ajouter dynamiquement 
des responsabilités à un objet sans modifier son code. En Java, il est utilisé pour 
enrichir les fonctionnalités d'un objet sans avoir besoin d'héritage lourd.


Interface ou classe abstraite (Component) → définit l'interface commune aux objets de base et aux décorateurs.
Classe concrète (ConcreteComponent) → l'objet de base que tu veux décorer.
Classe abstraite (Decorator) → contient une référence vers un Component et implémente l'interface.
Classe(s) concrète(s) (ConcreteDecorator) → ajoutent de nouveaux comportements avant ou après ceux de l'objet décoré.
 */