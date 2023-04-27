/*
 * Q2: Write a program to traverse over the elements of the array using for each loop and print all even 
elements.

Input 1: arr[] = {34,21,54,65,43}
Output 1: 34 54 

Input 1: arr[] = {4,3,6,7,1}
Output 1: 4 6
 */

import java.util.*;
public class Q2 {

    public static void findEvenNum(int arr[]){

        for(int even : arr){
            if(even % 2 == 0){
                System.out.print(even + " ");
            }
        }
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

        findEvenNum(arr);
    }
}
