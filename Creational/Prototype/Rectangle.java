package Creational.Prototype;

public class Rectangle extends Shape{

    int width;
    int height;

    public Rectangle() {
        super(); // Appel du constructeur de la classe parente
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle); // Appel du constructeur de la classe parente
        this.width = rectangle.width;
        this.height = rectangle.height;
    }


    @Override
    public Shape clone() {
        return new Rectangle(this); // Appel du constructeur de copie
    }
    
}


    
