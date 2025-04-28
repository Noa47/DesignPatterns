package Creational.Singleton;

public class HautParleur {
    private static HautParleur instance = null;

    private HautParleur() {
        System.out.println("Haut-parleur créé !");
    }

    public static HautParleur getInstance() {
        if (instance == null) {
            instance = new HautParleur();
        }
        return instance;
    }
}
