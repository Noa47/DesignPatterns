package Behavioral.Observer;

public class MainApp {
    public static void main(String[] args) {

        Store store = new Store();
        store.getService().subscribe(new EmailMsgListener("geekific@like.com"));
        store.getService().subscribe(new EmailMsgListener("geekific@subs.com"));
        store.getService().subscribe(new MobileAppListener("GeekificLnS"));

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unsubscribe(new EmailMsgListener("geekific@like.com"));
        store.salePromotion();

    }

}
/*Le Observer Pattern est un modèle comportemental où un objet (appelé sujet) garde une liste 
d’observateurs et les notifie automatiquement quand son état change. Cela permet de créer un 
lien dynamique entre objets sans les rendre trop dépendants les uns des autres. En Java, il 
est souvent utilisé pour mettre à jour plusieurs objets en réponse à un même changement (par exemple dans les interfaces graphiques) 

Subject (interface ou classe abstraite) → définit comment attacher, détacher et notifier les observateurs.
ConcreteSubject (classe concrète) → implémente Subject et stocke l'état ; prévient les observateurs quand il change.
Observer (interface) → définit une méthode update() que les observateurs doivent implémenter.
ConcreteObserver (classe concrète) → implémente Observer et réagit aux changements du sujet.
*/