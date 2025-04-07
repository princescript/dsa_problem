package exercise.kk;

public class SearchInArray {
    public static void main(String[] args) {
        int target = 5;
        int[][] arr = {
                {14, 28, 73},
                {46, 45, 61},
                {47, 84, 59}
        };

       // boolean num = search2DArray(arr,target);
        int num = min2DArray(arr);
        System.out.println(num);

        int res = max2DArray(arr);
        System.out.println(res);
    }
    public static boolean search2DArray(int[][] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for (int[] val : arr) {
            for (int c = 0; c < val.length; c++) {
                if (val[c] == target) {
                    return true;
                }
            }
        }
        return  false;
    }

    public static int min2DArray(int[][] arr){
        if(arr.length == 0){
            return -1;
        }
        int min = arr[0][0];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if(arr[r][c] <= min){
                    min = arr[r][c];
                }
            }
        }
        return  min;
    }

    public static int max2DArray(int[][] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0][0];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if(arr[r][c] > max){
                    max = arr[r][c];
                }
            }
        }
        return  max;
    }
}

