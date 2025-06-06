package Structural.Facade;
import Structural.Facade.SystemAudio.*;
public class MainApp {
    public static void main(String[] args){
        /* Sans facade :
            Amplifier amp = new Amplifier();
            DVDPlayer dvd = new DVDPlayer();
            Projector projector = new Projector();

            amp.on();
            projector.on();
            dvd.play("Inception");
         */

        SystemAudioFacade homeTheater = new SystemAudioFacade(new Amplifier(), new DVDPlayer(), new Projector());
        homeTheater.watchMovie("Inception");
    }
}

/*
Le pattern Facade (ou façade en français) est un design pattern structurel qui fournit une interface simplifiée
 à un ensemble complexe de classes, bibliothèques ou sous-systèmes.
En résumé :
    Le pattern Facade sert à cacher la complexité d’un système derrière une interface simple et conviviale.
*/
