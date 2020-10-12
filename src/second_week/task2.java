package second_week;

public class task2 {

    public static void main(String[] args) {
        byte size = 5; //just change this variable to see task result

        int [][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if(j == 0 && i == 0) {
                    matrix[i][j] = 1;
                } else if(j == 0) {
                    matrix[i][j] = matrix[i-1][matrix.length-1] + 1;
                } else {
                    matrix[i][j] = matrix[i][j-1] + 1;
                }
            }
        }

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                if(i - j == 0 || j + i == size-1) {
                    System.out.printf("%2c ", '*');
                } else {
                    System.out.printf("%2d ", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}

// 11 22 33 44 55
// 15 24 33 42 51