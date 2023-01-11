package SolidPrinciple.SingleResponsibility;

public class Marker {
    String name;
    String color;
    int year;
    int price;

    Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    void printDetails() {
        System.out.println("Marker name "+ this.name + ", color :: "+ this.color+" year:: "+this.year+" price :: "+this.price);
    }
}
