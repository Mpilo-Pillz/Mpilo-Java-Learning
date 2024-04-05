public class Main {
    public static void main(String[] args) {
        Varz varz = new Varz();

        varz.doubleDigit();
        System.out.println(varz.x);
    }
}

class Varz {
    int x = 10;

    public void doubleDigit() {
        this.x = this.x * 2;
    }
}
