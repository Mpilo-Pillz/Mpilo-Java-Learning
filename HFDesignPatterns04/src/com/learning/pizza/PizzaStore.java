package com.learning.pizza;

public abstract class PizzaStore {

    public PizzaLegacy orderPizza(String type) {
        PizzaLegacy pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza
    }
    abstract PizzaLegacy createPizza(String type);
}
