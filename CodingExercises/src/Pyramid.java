public class Pyramid {
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.printPyramid(8);
    }

    public void printPyramid(int num) {
        int middlePoint = (int) Math.floor((2 * num - 1) / 2);
        for(int row = 0; row < num; row++) {
            String level = "";
            for(int col = 0; col < 2 * num - 1; col++){
                if(middlePoint - row <= col && middlePoint + row >= col) {
                    level += "#";
                } else {
                    level += " ";
                }
            }
            System.out.println(level);
        }
    }
}
