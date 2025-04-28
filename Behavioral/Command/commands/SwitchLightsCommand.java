package Behavioral.Command.commands;
import Behavioral.Command.components.LightButton;

public class SwitchLightsCommand implements Command {
    private final LightButton light;

    public SwitchLightsCommand(LightButton light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchLights();
    }

}