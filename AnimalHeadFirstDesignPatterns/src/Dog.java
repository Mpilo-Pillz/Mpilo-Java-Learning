public class Dog implements Animal{

    @Override
    public void makeSound() {
        bark();
    }
    public void bark() {
        System.out.println("Woof Woof");
    }
}
