package com.learning.pizza;

public class ChicagoStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            new ChicagoStylePepperoniPizza();
        } else if (item.equals("clam")) {
            new NYStyleClamPizza();
        }else if (item.equals("veggie")) {
            new NYStyleVeggiePizza();
        } else return null;
        return null;
    }
}
