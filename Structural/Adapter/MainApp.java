package Structural.Adapter;

public class MainApp {
    public static void main(String[] args) {

        XmlData myData = new XmlData();

        // Old UI
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenus(myData);
        multiRestoApp.displayRecommendations(myData);

        System.out.println("==========================================");

        // New UI
        IMultiRestoApp adapter = new FancyUIServiceAdapter();
        adapter.displayMenus(myData);
        adapter.displayRecommendations(myData);

    }

}
/*Le Adapter Pattern est un modèle structurel qui permet de faire fonctionner ensemble deux interfaces incompatibles.
En Java, on l’utilise pour adapter un objet existant à une nouvelle interface attendue, sans changer le code de l'objet existant.

Interface cible (Target) → l'interface attendue par le client.
Classe existante (Adaptee) → l'objet qu'on veut adapter (mais qu'on ne peut pas modifier).
Classe (Adapter) → adapte l'Adaptee pour qu’il corresponde à l'Target.
Client → utilise l'interface Target sans se soucier de l'Adaptee.
*/