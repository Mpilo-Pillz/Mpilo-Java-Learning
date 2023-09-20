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
    }
}
