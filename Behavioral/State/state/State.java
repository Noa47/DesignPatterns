package Behavioral.State.state;
import Behavioral.State.Phone;
public abstract class State {

    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract String onHome();

    public abstract String onOffOn();

}
