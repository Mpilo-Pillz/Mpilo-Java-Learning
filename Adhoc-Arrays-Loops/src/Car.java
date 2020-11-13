public class Car {
    String color;
    String name;
    String gearbox;
    int numberOfDoors;

    public int petrol;

//    private boolean arrivedAtDestination;


    String[] carsProperies = {"black", "Tesla", "self driving", "too hot", "a convertible", "super fast"};

    public void move(String direction) {
        System.out.println("Car is heading to " + direction);
    }

    public void createSalesPitch() {
        for (int i = 0; i < carsProperies.length; i++) {
            System.out.println("The car is " + carsProperies[i]);
        }
    }

    public void  whileCreateSalesPitch() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
//        int i = 0;
//        while (i < carsProperies.length) {
//            System.out.println("The car is " + carsProperies[i]);
//            i++;
//        }
    }

    public void drive() {
       while (petrol > 0) {
           System.out.println("Car has moved, " + petrol + "km left");
           petrol--;
       }
    }

    public void arrivedAtDestition(String didWeArrive) {
        if (petrol > 0) {
            while (didWeArrive == "no") {
                System.out.println("Keep driving");
                petrol--;
            }
        }

    }
}
