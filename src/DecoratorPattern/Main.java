package DecoratorPattern;

import DecoratorPattern.Pizza.BasePizza;
import DecoratorPattern.Pizza.VegDelight;
import DecoratorPattern.Toppings.ExtraChesse;
import DecoratorPattern.Toppings.ExtraOnion;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new VegDelight();
        System.out.println("cost of vegDelight Pizza :: $"+ pizza.cost());
        ExtraChesse ec = new ExtraChesse(pizza);
        System.out.println("cost of vegDelight Chesse Pizza :: $"+ ec.cost());
        ExtraOnion onion = new ExtraOnion(ec);
        System.out.println("cost of vegDelight+Cheese+Onion Pizza :: $"+onion.cost());
    }
}
