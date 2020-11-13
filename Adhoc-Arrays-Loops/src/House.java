public class House {
    public String numberOfBedrooms;
    public String houseType;
    public String numberOfBathrooms;
    public Double squareMeters;
    public int garages;

    public House(String numOfBedrooms, String typeOfHouse, String numOfBathrooms, Double sqMeters, int carPorts) {
    this.numberOfBedrooms = numOfBedrooms;
    this.houseType = typeOfHouse;
    this.numberOfBathrooms = numOfBathrooms;
    this.squareMeters = sqMeters;
    this.garages = carPorts;
    }
}
