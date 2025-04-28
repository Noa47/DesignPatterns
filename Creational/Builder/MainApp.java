package Creational.Builder;

public class MainApp {

    /*
     * Dissocie la construction d'un objet complexe de sa representation
     * de sorte que le même processus de construction peut créer différentes représentations
     */
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        builder.model("Chiron");
        System.out.println(builder.build());

        CarSchemaBuilder schemaBuilder = new CarSchemaBuilder();
        director.buildLambo(schemaBuilder);
        schemaBuilder.engine("90").nbrOfDoors(3);
        System.out.println(schemaBuilder.build());

    }

}
/*Le Builder Pattern est un modèle de conception qui permet de créer 
des objets complexes étape par étape. Il sépare la construction d'un 
objet de sa représentation, ce qui permet de créer 
différentes versions d'un objet avec le même processus de construction. 

Interface ou classe abstraite (Builder) → définit les étapes de construction.
Classe concrète (ConcreteBuilder) → implémente les étapes pour construire un produit spécifique.
Classe (Director) → dirige le processus de construction avec un ordre spécifique.
Classe (Product) → l'objet final construit.
*/