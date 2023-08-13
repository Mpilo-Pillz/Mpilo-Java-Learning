public class SixteenInch implements ComputerDelegate {
    public SixteenInch(ComputerUser handler) {
        handler.delegate = this;
    }

    @Override
    public void useComputer() {
        System.out.println("I use this computer to build web applications and to also learn on the couch and bed");
    }
}
