package Creational.Prototype;

public class Circle extends Shape{

    int radius;

    public Circle() {
        super(); // Appel du constructeur de la classe parente
    }

    public Circle(Circle circle) {
        super(circle); // Appel du constructeur de la classe parente
        this.radius = circle.radius;
    }


    @Override
    public Shape clone() {
        return new Circle(this); // Appel du constructeur de copie
    }
    
}