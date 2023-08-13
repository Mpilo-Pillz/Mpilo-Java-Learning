public class ComputerUser {
    String name;
    ComputerDelegate delegate;
    public ComputerUser(String name) {
        this.name = name;
    }

    public void useLaptop() {
        delegate.useComputer();
    }
}

class ComputerUserTester {
    public static void main(String[] args) {
        ComputerUser computerUser = new ComputerUser("Nikita");
        SixteenInch myDreamBook = new SixteenInch(computerUser);
//        myDreamBook.useComputer(); not delegate tricked me there
        computerUser.useLaptop();
    }
}
