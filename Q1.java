import java.util.Scanner;

/* Q1: Write a program to print the sum of all the elements present on even indices in the given array.

Input 1: arr[] = {3,20,4,6,9}
Output 1: 16

Input 1: arr[] = {4,3,6,7,1}
Output 1: 11 */

class Q1{

    public static int sum(int arr[]){

        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            if(i % 2 == 0){
                sum += arr[i];
            }
        }
        return sum;
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

        int result = sum(arr);
        System.out.println(result);
    }
}