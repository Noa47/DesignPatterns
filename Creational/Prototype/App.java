package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle(); // Création d'un objet Circle
        circle.x = 10;
        circle.y = 10;
        circle.radius = 20;
        shapes.add(circle);
        Circle circle2 = (Circle) circle.clone(); // Clonage de l'objet circle
        shapes.add(circle2);

        Rectangle rectangle = new Rectangle(); // Création d'un objet Rectangle
        rectangle.width = 30;
        rectangle.height = 40;
        shapes.add(rectangle);

    // Affichage des informations sur les formes
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape + ", x: " + shape.x + ", y: " + shape.y + ", color: " + shape.color);
            if (shape instanceof Circle) {
                System.out.println("Circle radius: " + ((Circle) shape).radius);
            } else if (shape instanceof Rectangle) {
                System.out.println("Rectangle width: " + ((Rectangle) shape).width + ", height: " + ((Rectangle) shape).height);
                }
            }
        }
}
/*Le Prototype Pattern est un modèle qui permet de créer de nouveaux 
objets en copiant des objets existants (clonage). Cela permet de créer 
des objets sans avoir à les construire de zéro, en utilisant une instance
déjà existante comme modèle. En Java, il est utile quand la création
d'objets est coûteuse et qu'on veut éviter de recréer les mêmes objets
plusieurs fois. 

Interface (Prototype) → déclare une méthode clone().
Classe concrète (ConcretePrototype) → implémente clone() pour copier l'objet.
*/