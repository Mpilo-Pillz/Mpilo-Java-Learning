public class RubberDuck extends Duck{

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I am a toy but I am still a duck");
    }
}
