public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] newarr = new int[arr.length];
        int a = 0;
        for (int i = arr.length -1; i >= 0; i--) {
            newarr[a] = arr[i];
            a++;
        }
        return newarr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        int second = arr[0];
        if (second == max){
            second = arr[1];
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != max && arr[i] > second){
                second = arr[i];
            }
        }
        return second;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double x = (double) arr[1] / arr[0];
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] * x != arr[i+1]){
                return false;
            }
        }
        return true;   
    }


    public static void main(String[] args) {
        
    }
}
