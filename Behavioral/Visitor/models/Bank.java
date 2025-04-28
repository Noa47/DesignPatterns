package Behavioral.Visitor.models;

import Behavioral.Visitor.Visitor;
public class Bank extends Client {

    private final int branchesInsured;

    public Bank(String name, String address, String number, int branchesInsured) {
        super(name, address, number);
        this.branchesInsured = branchesInsured;
    }

    public String getName(){
        return "Bank name: " + super.getName();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
