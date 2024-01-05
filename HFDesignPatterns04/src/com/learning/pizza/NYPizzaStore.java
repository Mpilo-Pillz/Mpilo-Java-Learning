package com.learning.pizza;

public class NYPizzaStore extends PizzaStore {
    PizzaLegacy createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (item.equals("clam")) {
            pizza = new NYStyleClamPizza();
        }else if (item.equals("veggie")) {
            item = new NYStyleVeggiePizza();
        } else return null;
    }
}
