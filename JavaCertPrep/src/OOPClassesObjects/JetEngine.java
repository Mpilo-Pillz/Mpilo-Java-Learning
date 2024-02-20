// Have State and Behaviour
// State is modeled byFeilds
// Behaviour modlled by Methods
// Objects remain in control of how th outside world uses them
// They should hide away as much implementation details as possible exposing only appropriate behaviours


// Advantages
// Modularity
// code Reuse
// Hide away implementation details increasing robustness of code

// Classes are prototypes or blueprint for instantiating an object

// access modifier, class keyword, Class name, superclass and or interfaces fields and methods

package OOPClassesObjects;

public class JetEngine {
    String model;
    int maxFanSpeed;

    // Overloased Contructoer just like Overloaded Methods differentiated by the number  of arguments
    JetEngine() {
        System.out.println("no arg");
    }
    private JetEngine(String model) {
        this();
        this.model = model;
    }


    JetEngine(String model, int maxFanSpeed) {
        this(model); // calling the first constructor
        this.maxFanSpeed = maxFanSpeed;
        System.out.println("Model, maxFanSpeed");
    }
}
