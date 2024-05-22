package ArrayPrograms;

public class JaggedArray {
    public static void main(String[] args) {
        String [][]jaggedArray = {{"This","is"},{"jagged","Array","Example"}};

        System.out.println("Display String Array : ");
        for(int i=0;i<jaggedArray.length;i++){
            for (int j=0;j<jaggedArray[i].length;j++){
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
