package steps;


public class Steps {
    public static void main(String[] args) {
        Steps steps = new Steps();
        steps.printSteps(5);
        steps.upsideDownSteps(6);
        steps.logSteps(7);
    }

    public void printSteps(int num) {
        for(int row = 0; row < num; row++) {
            String step = "";
            for(int col = 0; col < num; col++) {
                if (col <= row) {
                    step += "#";
                } else {
                    step += " ";
                }
            }
            System.out.println(step);
        }
    }

    public void upsideDownSteps(int num) {
        for(int row = 0; row < num; row++) {
            String step = "";
            for(int col = 0; col < num; col++) {
                if (row <= col) {
                    step += "#";
                } else {
                    step += " ";
                }
            }
            System.out.println(step);
        }
    }

    public void logSteps(int num) {
        for(int row = 0; row < num; row++) {
            String step = "";
            for(int col = 0; col < num; col++) {
                if (row <= col) {
                    step += " ";
                } else {
                    step += "#";
                }
            }
            System.out.println(step);
        }
    }
}
