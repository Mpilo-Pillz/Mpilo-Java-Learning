public class ArraysNLoopsRunner {
    public static void main (String [] args) {
        ArraysNLoops arraysNLoops = new ArraysNLoops();



//         Car car = new Car();
//         car.numberOfDoors = 4;
//         car.gearbox = "Automatic";
//         car.name = "Volvo";
//        car.color = "Black";
//
//        System.out.println("The " + car.name + " is " + car.color + " has " + car.gearbox + " transmission" + " and is a " + car.numberOfDoors + " doors ");
//        car.move("Simmonds");
//
//        Car carTwo = new Car();
//        carTwo.numberOfDoors = 2;
//        carTwo.gearbox = "Manual";
//        carTwo.name = "Lexus";
//        carTwo.color = "White";
//
//        System.out.println("The " + carTwo.name + " is " + carTwo.color + " has " + carTwo.gearbox + " transmission" + " and is a " + carTwo.numberOfDoors + " doors ");
//        carTwo.move("Grayston");
//
//
//        car.petrol = 16;
//        car.arrivedAtDestition("no");

        House house = new House("6 Bedroom", "Double Storey", "3 Bathrooms", 400.50, 4);
        System.out.println(String.format("This is a %s %s house that has a size of %sm2 big enough to park %s cars and it has %s",house.numberOfBedrooms, house.houseType, house.squareMeters, house.garages, house.numberOfBathrooms) );

    }
}
