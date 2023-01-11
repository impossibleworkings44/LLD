package DecoratorPattern.Toppings;

import DecoratorPattern.Pizza.BasePizza;
import DecoratorPattern.Toppings.ToppingsDecorator;

public class ExtraOnion extends ToppingsDecorator {
    BasePizza basepizza;
    public ExtraOnion(BasePizza pizza) {
        this.basepizza = pizza;
    }

    @Override
    public int cost() {
        return this.basepizza.cost() + 20;
    }
}
