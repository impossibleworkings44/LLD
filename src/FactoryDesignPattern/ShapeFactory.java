package FactoryDesignPattern;

public class ShapeFactory {
    public Shape getShape(String input) {
        switch(input) {
            case "CIRCLE" : return new Circle();
            case "REACTANGLE" : return  new Reactangle();
            case "SQUARE" : return new Square();
            default : return null;
        }
    }
}
