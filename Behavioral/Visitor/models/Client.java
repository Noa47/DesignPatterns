package Behavioral.Visitor.models;

import Behavioral.Visitor.Visitor;

public abstract class Client {

    private final String name;
    private final String address;
    private final String number;

    public Client(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public abstract void accept(Visitor visitor);
    public String getName() {
        return name;
    }

}
