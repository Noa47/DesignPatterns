package Structural.Facade;
import Structural.Facade.SystemAudio.*;

public class SystemAudioFacade {
    private Amplifier amp;
    private DVDPlayer dvd;
    private Projector projector;

    public SystemAudioFacade(Amplifier amp, DVDPlayer dvd, Projector projector) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        amp.on();
        projector.on();
        dvd.play(movie);
    }
}
