package Behavioral.Strategy;

import Behavioral.Strategy.strategy.PaymentByCreditCard;
import Behavioral.Strategy.strategy.PaymentByPaypal;
public class MainApp {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        // The strategy can now be easily picked at runtime

        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);

        System.out.println("==========================================");

        paymentService.setStrategy(new PaymentByPaypal());
        paymentService.processOrder(100);

    }

}
/*
Le Strategy Pattern est un modèle comportemental qui permet de définir différentes 
façons d’accomplir une action, et de choisir dynamiquement laquelle utiliser.
En Java, on l’utilise pour changer facilement d’algorithme sans modifier le code principal.
à utiliser lorsque vous avez plusieurs algorithmes pour effectuer une tâche.

Interface ou classe abstraite (Strategy) → définit la méthode commune à toutes les stratégies.
Classe(s) concrète(s) (ConcreteStrategy) → implémentent une version spécifique de la méthode.
Classe (Context) → utilise une stratégie et délègue l’exécution à l'objet Strategy.
 */
