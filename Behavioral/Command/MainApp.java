package Behavioral.Command;

import Behavioral.Command.components.Room;
import Behavioral.Command.commands.SwitchLightsCommand;

public class MainApp {
    public static void main(String[] args) {

        Room room = new Room();
        room.setCommand(new SwitchLightsCommand(room.getLight()));
        room.executeCommand();
        System.out.println(room.isLightOn());

    }

}

/* Le Command Pattern est un modèle comportemental qui permet 
de convertir une demande en un objet indépendant, appelé commande. 
Cela permet de paramétrer des objets avec des actions spécifiques, 
de les mettre en file d'attente, de les exécuter, et même d'annuler
 des actions. En Java, il est utile pour décentraliser les demandes 
 et rendre l’exécution plus flexible.
 
Interface (Command) → déclare la méthode execute().
Classe concrète (ConcreteCommand) → implémente execute() avec une action précise.
Classe (Invoker) → stocke et exécute la commande.
Classe (Receiver) → celui qui réalise réellement l'action.
*/