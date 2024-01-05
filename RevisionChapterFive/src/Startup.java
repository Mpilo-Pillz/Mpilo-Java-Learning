import java.util.ArrayList;
public class Startup {

    public static void main(String[] args) {

        int numberOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleStartup theStartup = new SimpleStartup();

        int randomNumber = (int) (Math.random() * 5);

        int[] locations = {randomNumber, randomNumber + 1, randomNumber + 2};

        theStartup.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {
        int guess = helper.getUserInput("enter a number");
        String result = theStartup.checkYourself(guess);
        numberOfGuesses++;

        if (result.equals("kill")) {
            isAlive = false;
            System.out.println("You took " + numberOfGuesses + " guesses");
        }
        }
    }
}



 class StartupCopylater {
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}
