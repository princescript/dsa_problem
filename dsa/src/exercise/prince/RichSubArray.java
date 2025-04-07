package exercise.prince;

public class RichSubArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10,5},
                {-4,514},
                {4,7}
        };
        System.out.println(richSubArray(arr));
    }
    public static int richSubArray(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int r = 0; r < arr.length; r++) {
            int rowSum = 0;
            for (int c = 0; c < arr[r].length; c++) {
                rowSum = rowSum + arr[r][c];
            }
            if(rowSum > maxSum)
                maxSum = rowSum;
        }
        return maxSum;
    }
}
