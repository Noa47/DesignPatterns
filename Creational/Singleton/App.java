package Creational.Singleton;

public class App{

    public static void main(String[] args) {
        HautParleur hp = HautParleur.getInstance();
        HautParleur hp2 = HautParleur.getInstance();
        System.out.println(hp);
        System.out.println(hp2);
        System.out.println("Est-ce que hp1 et hp2 sont la même instance ? :");
        System.out.println(hp == hp2);
    }

}


/*
Le Singleton permet d'assurer qu'une classe n'a qu'une seule instance et fournit un point d'accès global à cette instance.
*/