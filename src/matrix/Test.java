package matrix;

public class Test {
    public static void main(String[] args) {
        int[][] first = Matrix.getNewRandomMatrix(3, 0, 100);
        int[][] second = Matrix.getNewRandomMatrix(3, 0, 100);

        int[][] sum = Matrix.sumMatrix(first, second);

        System.out.println("Stop!");
    }
}
