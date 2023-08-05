public class Main {


    public static void main(String[] args) {


        EncapsulationLearning roadSpeedLimit = new EncapsulationLearning();
        roadSpeedLimit.setSpeedLimit(120);

        System.out.println(roadSpeedLimit.getSpeedLimit());

    }


}

class EncapsulationLearning {
    private int speedLimit;
    int setSpeedLimit(int speedLimit) {
        return this.speedLimit = speedLimit;
    }

    int getSpeedLimit() {
        return this.speedLimit;
    }
}