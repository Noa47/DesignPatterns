package Behavioral.ChainOfResponsibility;

import Behavioral.ChainOfResponsibility.handlers.*;
public class MainApp {

    public static void main(String[] args) {

        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);

        System.out.println("==========================================");

        System.out.println(service.logIn("username", "password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("user_username", "user_password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("admin_username", "admin_password"));

        System.out.println("==========================================");

    }

}
/* Le Chain of Responsibility est un modèle comportemental
qui permet de transmettre une requête le long d'une chaîne
d'objets jusqu'à ce qu'un d'eux la prenne en charge.
Chaque objet décide s'il peut traiter la requête ou 
s'il doit la transmettre au suivant. Ce modèle découple l'émetteur 
de la requête de ses récepteurs, permettant ainsi une flexibilité
accrue dans le traitement des demandes. 

Interface ou classe abstraite (Handler) → déclare une méthode pour traiter la requête et référence au prochain objet.
Classe concrète (ConcreteHandler) → traite la requête ou la passe au suivant.
​ */