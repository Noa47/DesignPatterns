package Behavioral.Command.components;

public class Room extends Component {

    private final LightButton light;

    public Room() {
        this.light = new LightButton();
    }

    public LightButton getLight() {
        return light;
    }

    public boolean isLightOn() {
        return light.isSwitchedOn();
    }

}