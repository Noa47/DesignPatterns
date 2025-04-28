package Behavioral.Visitor;

import java.util.List;

import Behavioral.Visitor.models.*;
public class MainApp {

    /*
     * Video Reference: https://youtu.be/UQP5XqMqtqQ
     */
    public static void main(String[] args) {

        List<Client> clients = List.of(
                new Bank("bank_name", "bank_address", "bank_number", 10),
                new Resident("resident_name", "resident_address", "resident_number", "A"),
                new Company("company_name", "company_address", "company_number", 1000),
                new Restaurant("resto_name", "resto_address", "resto_number", true)
        );

        InsuranceMessagingVisitor visitor = new InsuranceMessagingVisitor();
        visitor.sendInsuranceMails(clients);

    }

}

/*
 Le Visitor Pattern est un modèle comportemental qui permet d'ajouter de nouvelles 
opérations à des objets existants sans modifier leur code. En Java, on l’utilise 
pour séparer les algorithmes de la structure des objets sur lesquels ils opèrent.


Interface (Visitor) → définit une méthode visit() pour chaque type d'objet à visiter.
Classe(s) concrète(s) (ConcreteVisitor) → implémentent les différentes actions à appliquer aux objets.
Interface (Element) → déclare une méthode accept(Visitor visitor).
Classe(s) concrète(s) (ConcreteElement) → implémentent accept en appelant la méthode visit() correspondante.
 */