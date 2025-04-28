package Behavioral.Mediator;

public class MainApp {

    public static void main(String[] args) {

        Dialog dialog = new Dialog();
        dialog.enterUsername("Geekific");
        dialog.enterPassword("LikeAndSubscribe");

        dialog.simulateLoginClicked();

        dialog.simulateForgotPassClicked();

    }

}
/*Le Mediator Pattern est un modèle comportemental qui permet
de centraliser la communication entre plusieurs objets via
un médiateur. Cela permet d'éviter que les objets se communiquent
directement entre eux, ce qui rend le système plus flexible
et réduit les dépendances. En Java, il est utile lorsque
plusieurs objets doivent interagir de manière complexe,
mais sans se connaître directement.

Interface (Mediator) → déclare les méthodes pour la communication.
Classe concrète (ConcreteMediator) → coordonne la communication entre objets.
Classe(s) (Colleague) → les objets qui communiquent via le médiateur.
*/