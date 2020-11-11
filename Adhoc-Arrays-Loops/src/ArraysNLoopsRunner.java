public class ArraysNLoopsRunner {
    public static void main (String [] args) {
        ArraysNLoops arraysNLoops = new ArraysNLoops();

//        arraysNLoops.printArray();
//        arraysNLoops.numberOfItemsInArray;

         Car car = new Car();
         car.numberOfDoors = 4;
         car.gearbox = "Automatic";
         car.name = "Volvo";
        car.color = "Black";

        System.out.println("The " + car.name + " is " + car.color + " has " + car.gearbox + " transmission" + " and is a " + car.numberOfDoors + " doors ");
        car.move("Simmonds");

        Car carTwo = new Car();
        carTwo.numberOfDoors = 2;
        carTwo.gearbox = "Manual";
        carTwo.name = "Lexus";
        carTwo.color = "White";

        System.out.println("The " + carTwo.name + " is " + carTwo.color + " has " + carTwo.gearbox + " transmission" + " and is a " + carTwo.numberOfDoors + " doors ");
        carTwo.move("Grayston");

        car.createSalesPitch();
    }
}
