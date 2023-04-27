/*
Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than 
its just left and just right neighbor.


Input 1: arr[] = {1,3,2,6,5}
Output 1: 6

Input 2:  arr[] = {1 4,7,3,2,6,5}
Output 1: 7
 */

 import java.util.*;
public class Q5 {

    public static int peakEle(int arr[]){

        int result = 0;
        for(int i = 1; i<arr.length-1; i++){
            if(arr[i] > arr[i+1] && arr[i] > arr[i-1]){
                result = arr[i];
            }
        }
       return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = s.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array elements ");
        for(int i = 0; i<size; i++){
            arr[i] = s.nextInt();
        }

      int result = peakEle(arr);
       System.out.println(result);
    } 
    
}
