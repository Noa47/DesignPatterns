package Behavioral.State;

public class MainApp {

    public static void main(String[] args) {

        Phone phone = new Phone();
        simulatePhoneClicks(phone);

    }

    private static void simulatePhoneClicks(Phone phone) {
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
    }

}
/*
Le State Pattern est un modèle comportemental qui permet à un objet 
de changer son comportement quand son état interne change. C'est comme 
si l'objet devenait un autre objet en fonction de son état.
En Java, on l’utilise pour éviter de gros if ou switch en 
déléguant le comportement à des classes différentes.


Interface ouclasse abstraite (State) → définit les méthodes que chaque état doit implémenter.
Classe(s) concrète(s) (ConcreteState) → implémente le comportement spécifique pour chaque état.
Classe (Context) → contient une référence vers un état courant (State) et délègue les actions à l'état courant.
 */