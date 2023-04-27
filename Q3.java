/*
 * Q3: Write a program to calculate the maximum element in the array.

Input 1: arr[] = {34,21,54,65,43}
Output 1: 65

Input 1: arr[] = {4,3,6,7,1}
Output 1: 7
 */

import java.util.*;

public class Q3 {

    public static int maxEle(int arr[]){

        int store = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > arr[0]){
                store = arr[i];
            }
        }
        return store;
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

        int result = maxEle(arr);
        System.out.println(result);
    } 
}
