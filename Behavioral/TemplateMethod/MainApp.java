package Behavioral.TemplateMethod;

public class MainApp {

    /*
     * Video Reference: https://youtu.be/cGoVDzHvD4A
     */
    public static void main(String[] args) {

        BaseGameLoader wowLoader = new WorldOfWarcraftLoader();
        wowLoader.load();

        System.out.println("==========================================");

        BaseGameLoader diabloLoader = new DiabloLoader();
        diabloLoader.load();

    }

}

/* Le Template Method est un modèle où une classe décrit les étapes d'une action,
 mais laisse certaines étapes à compléter par ses enfants. Ça sert à éviter de répéter
  du code commun. En Java, on l'utilise pour faire des bases solides et personnalisables. 
  
Classe abstraite (Template) → définit l’algorithme général et les étapes à personnaliser.
Classes concrètes (ConcreteTemplate) → redéfinissent certaines étapes spécifiques.
*/
