public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        Duck robotDuck = new RobotDuck();
        robotDuck.performFly();
        robotDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly(); // prints does not fly
        modelDuck.setFlyBehavior(new FlyRocketPowered()); // attaching a rocket, overwriting its no fly behavior
        modelDuck.performFly(); // now it flies
    }
}
