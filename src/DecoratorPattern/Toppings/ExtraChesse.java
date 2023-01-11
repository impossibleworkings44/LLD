package DecoratorPattern.Toppings;

import DecoratorPattern.Pizza.BasePizza;
import DecoratorPattern.Toppings.ToppingsDecorator;

public class ExtraChesse extends ToppingsDecorator {
    BasePizza basePizza;
    public ExtraChesse(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
