import java.util.Arrays;

public class Main{
    public static void main(String [] args){
        int []arr = {107,5,4,3,21,1};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] Bubble(int arr[]){
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j <arr.length-i-1 ; j++) {
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            } 
           } 
        }
        return arr;
    }
}