package Behavioral.Visitor.models;

import Behavioral.Visitor.Visitor;
public class Company extends Client {

    private final int nbrOfEmployees;

    public Company(String name, String address, String number, int nbrOfEmployees) {
        super(name, address, number);
        this.nbrOfEmployees = nbrOfEmployees;
    }

    public String getName(){
        return "Bank name: " + super.getName();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}