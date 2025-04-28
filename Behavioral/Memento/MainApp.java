package Behavioral.Memento;

public class MainApp {
    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.write("Like and");
        editor.printText();
        editor.write("Like and Subscribe");
        editor.printText();
        editor.write("Like and Subscribe to Geekific!");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();

    }

}
/*Le Memento Pattern est un modèle comportemental qui permet de sauvegarder
 l'état d'un objet pour pouvoir le restaurer plus tard, sans révéler les 
 détails internes de l'objet. Cela permet d'implémenter des fonctionnalités 
 comme "Annuler" (Undo) en Java. On utilise un memento pour capturer l'état, 
 un originator pour créer et restaurer cet état, et un caretaker pour stocker les mementos.
 
Classe (Memento) → stocke l'état interne de l'objet.
Classe (Originator) → crée un memento et peut restaurer son état.
Classe (Caretaker) → conserve et gère les mementos sans les modifier.
 */
