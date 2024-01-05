public class Cat implements Animal{

    @Override
    public void makeSound() {
        meow();
    }

    public void meow() {
        System.out.println("Meow Meow");
    }
}
