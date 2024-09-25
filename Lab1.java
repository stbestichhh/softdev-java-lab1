import java.util.Arrays;

public class Lab1 {

  public static void main(String[] args) {
    final long CONSTANT = 3L; // a
    long[][] matrix = { // B
      {1L, 5L, 3L},
      {4L, 2L, 8L},
      {7L, 6L, 9L}
    };

    try {
      // action 1
      long[][] multipliedMatrix = new long[matrix.length][matrix[0].length]; // C
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          multipliedMatrix[i][j] = matrix[i][j] * CONSTANT;
        }
      }

      System.out.println("Matrix after first action (C = a * B):");
      for (long[] row : multipliedMatrix) {
        for (long element : row) {
          System.out.print(element + " ");
        }
        System.out.println();
      }

      // action 2
      long sumOfMaxElements = 0;
      for (long[] row : multipliedMatrix) {
        long maxInRow = Arrays.stream(row).max().getAsLong();
        sumOfMaxElements += maxInRow;
      }

      System.out.println("Sum of the highest values of each row from multiplied matrix is " + sumOfMaxElements);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
