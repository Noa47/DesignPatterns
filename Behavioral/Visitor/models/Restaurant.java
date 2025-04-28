package Behavioral.Visitor.models;

import Behavioral.Visitor.Visitor;
public class Restaurant extends Client {

    public final boolean availableAbroad;

    public Restaurant(String name, String address, String number, boolean availableAbroad) {
        super(name, address, number);
        this.availableAbroad = availableAbroad;
    }

    public String getName(){
        return "Bank name: " + super.getName();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

