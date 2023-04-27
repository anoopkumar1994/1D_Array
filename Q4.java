/*
 * Q4: Write a program to find out the second largest element in a given array. 

Input 1: arr[] = {34,21,54,65,43}
Output 1: 54

Input 1: arr[] = {4,3,6,7,1}
Output 1: 6
 */

import java.util.*;
public class Q4 {

    public static int secLarge(int arr[]){
        int maxValue = arr[0];
        int secondMaxVal = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i] > maxValue){
                secondMaxVal = maxValue;
                maxValue = arr[i];
            }else if(arr[i] > secondMaxVal && arr[i] != maxValue ){
                secondMaxVal = arr[i];
            }
        }
        return secondMaxVal;
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

        int result = secLarge(arr);
        System.out.println(result);
    } 
}
