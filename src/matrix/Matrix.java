package matrix;

import java.util.Random;
import java.util.TreeMap;

public class Matrix {

    private int size;

    public static int[][] getNewRandomMatrix(int size, int min, int max) {
        int[][] matrix = getNewEmptyMatrix(size);
        int n = max - min + 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Random rn = new Random();
                matrix[i][j] = min + rn.nextInt() % n;
            }
        }
        return matrix;
    }

    private static int[][] getNewEmptyMatrix(int size) {
        return new int[size][size];
    }

    public static boolean isSquare(int[][] matrix) {
        return matrix.length == matrix[0].length;
    }

    public static int getSize(int[][] matrix) {
        if (isSquare(matrix)) {
            return matrix.length;
        }
        else {
            System.out.println("Matrix is not square!");
            return 0;
        }
    }

    public static int getDeterminant(int[][] matrix) {
        int size = getSize(matrix);
        int determinant = 0;
        for (int i = 0; i < size; i++) {
            determinant = determinant + matrix[i][i];
        }
        return determinant;
    }

    public static int[][] sumMatrix(int[][] first, int[][] second) {
        if (isSquare(first) && (isSquare(second))) {
            int[][] resultMatrix = getNewEmptyMatrix(getSize(first));
            if (getSize(first) == getSize(second)) {
                for (int i = 0; i < getSize(first); i++) {
                    for (int j = 0; j < getSize(first); j++) {
                        resultMatrix[i][j] = first[i][j] + second[i][j];
                    }
                }
                return resultMatrix;
            }
            else {
                System.out.println("Sizes not equals");
            }
        }
        System.out.println("Some of matrix is not square...");
        return getNewEmptyMatrix(3);
    }
}
