package Behavioral.Iterator;

public class MainApp {
    public static void main(String[] args) {
        NameCollection names = new NameCollection();
        Iterator<String> it = names.createIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

/*
 Le Iterator Pattern est un modèle comportemental qui permet de parcourir les éléments d'une 
 collection sans exposer sa structure interne. En Java, il est utilisé pour naviguer dans des 
 listes, des ensembles, ou d'autres collections sans se soucier de comment elles sont implémentées.

Interface (Iterator) → définit des méthodes comme hasNext() et next().
Interface (Aggregate ou Collection) → déclare une méthode pour créer un itérateur.
Classe concrète (ConcreteAggregate) → implémente Aggregate et crée un Iterator.
Classe concrète (ConcreteIterator) → implémente Iterator et parcourt les éléments.
 */