package Creational.Prototype;

public abstract class Shape {
    int x;
    int y;
    String color;

    public Shape() { // Constructeur de la classe Shape
    }

    public Shape(Shape shape) { // Constructeur de copie
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public abstract Shape clone(); // Méthode abstraite pour cloner l'objet
}
