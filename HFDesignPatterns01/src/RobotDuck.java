public class RobotDuck extends Duck {

    public RobotDuck() {
        quackBehavior = new MechaDuckSound();
        flyBehavior = new FlyRocketPowered();
    }

    @Override
    public void display() {
        System.out.println("This duce is super cool");
    }
}
