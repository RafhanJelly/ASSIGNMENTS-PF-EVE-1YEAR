public class Practice {
    public static void main(String[] args) {

        int[][] A = { {1,2,3}, {5, 6 , 7}  };
        int[][] B = {{9, 7, 4}, {7, 1, 2}};

        for (int r = 0; r < 2; r++) {
            for (int j = 0; j < 3; j++)
                System.out.print("    " + (A[r][j] + B[r][j]));
            System.out.println();
        }
    }
}