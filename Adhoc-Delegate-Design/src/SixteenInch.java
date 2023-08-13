public class SixteenInch implements ComputerDelegate {
    String name;
    public SixteenInch(String name, ComputerUser handler) {
        this.name = name;
        handler.delegate = this;
    }

    @Override
    public void useComputer() {
        System.out.printf("I %s use this computer to build web applications and to also learn on the couch and bed", name);
    }
}
