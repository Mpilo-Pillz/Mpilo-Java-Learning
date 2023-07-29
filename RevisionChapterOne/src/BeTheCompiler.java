public class BeTheCompiler {
    public static void main(String [] args) {
        firstExercise();
        System.out.println("--------------------Exercise B ended--------------------");
        execiseA();
        System.out.println("--------------------Exercise A ended--------------------");
        exerciseC();
        System.out.println("--------------------Exercise C ended--------------------");
        execiseASolution();
        System.out.println("--------------------Exercise A Solution ended--------------------");
    }

    public static void firstExercise() {
        int x = 5;
        while( x > 1 ) {
            x = x - 1;
            if( x < 3 ){
                System.out.println("small x");
            }
        }
    }

    public static void execiseA() {
        int x = 1;
        while(x < 10) {
            x = x + 1; // this one never printed anything but loops forever as x never increased
            if( x > 3 ){
                System.out.println("big x");
            }

        }
    }

    public static void exerciseC() {
        int x = 5;
        while( x > 1 ){
            x = x - 1;
            if( x < 3 ){
                System.out.println("Small x");
            }
        }
    }

    public static void execiseASolution() {
        int x = 1;
        while(x < 10) {
            if( x > 3 ){
                System.out.println("big x");
            }
            x = x + 1; // this one never printed anything as x never increased
        }
    }
}
