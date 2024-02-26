package com.learning.pizza;

public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("pepperoni")) {
             new NYStylePepperoniPizza();
        } else if (item.equals("clam")) {
             new NYStyleClamPizza();
        }else if (item.equals("veggie")) {
             new NYStyleVeggiePizza();
        } else return null;
        return null;
    }
}
