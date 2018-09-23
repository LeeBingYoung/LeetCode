package primary.array;

public class RotateImage {
    public static void main(String[] args){
        int[][] matrix = {
                {1,2,3},{4,5,6},{7,8,9}
        };
        rotate(matrix);
        for(int i =0; i<matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+", ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] matrix) {
        //转置+颠倒
        int n = matrix.length;
        for(int i =0 ; i<matrix.length; i++){
            for(int j = i; j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0; i<n; i++){
            reverse(matrix[i],0, n-1);
        }

    }
    public static  void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
