package Behavioral.Visitor.models;

import Behavioral.Visitor.Visitor;
public class Resident extends Client {

    private final String insuranceClass;

    public Resident(String name, String address, String number, String insuranceClass) {
        super(name, address, number);
        this.insuranceClass = insuranceClass;
    }

    public String getName(){
        return "Bank name: " + super.getName();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
