import encapsulationAndInheritance.demo.accessModifiersDemo.GearBox;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CarEngine carEngine = new CarEngine(); // not in the same package so not accessible here
        GearBox gearBox = new GearBox(); // this is public accissible eevrywhere
    }
}