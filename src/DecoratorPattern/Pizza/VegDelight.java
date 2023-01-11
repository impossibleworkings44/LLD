package DecoratorPattern.Pizza;

import DecoratorPattern.Pizza.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}
