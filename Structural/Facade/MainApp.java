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
