public class Startup {

    public static void main(String[] args) {
        System.out.println("COMMENT back in");
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
