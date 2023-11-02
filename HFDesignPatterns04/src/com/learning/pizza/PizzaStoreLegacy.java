package com.learning.pizza;

public class PizzaStoreLegacy {
    SimplePizzaFactory factory;

    public PizzaStoreLegacy(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public PizzaLegacy orderPizza(String type) {
        PizzaLegacy pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
