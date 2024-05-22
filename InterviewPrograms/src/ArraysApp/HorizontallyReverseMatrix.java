package ArraysApp;

public class HorizontallyReverseMatrix {
    public static void main(String[] args) {

            int[][] matrix = {
                    {1, 0, 1},
                    {0, 0, 1},
                    {0, 1, 1}
            };

            horizontalMatrix(matrix);

        System.out.println("Reverse Matrix is : ");
        printMatrix(matrix);
    }
    public static void horizontalMatrix(int[][] matrix){
        for(int[] row : matrix){
            reverseRow(row);
        }
    }
    private static void reverseRow(int[] row){
        int left = 0;
        int right = row.length-1;

        while(left<right){
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;

            left++;
            right--;
        }
    }
    public static void printMatrix(int[][] matrix){
        for(int column[] : matrix){
            for (int elem : column){
                System.out.print(elem+" ");
            }
            System.out.println();
        }

    }
}
