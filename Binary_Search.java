package com.Search;

import java.util.Scanner;

public class Binary_Search {

    public int search(int[] arr , int x){
        int low = 0;
        int high = arr.length-1;
        while (low <= high){

        int mid = (low + high)/2;
        if (arr[mid] == x){
            return mid;
        }
        if (x < arr[mid]){
            high = mid-1;
        }
        else {
            low = mid + 1;
        }
        }
        return -1;
    }

    public static void main(String[] args) {
        Binary_Search bs = new Binary_Search();
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,6,8,7,9,10};
        System.out.println("Enter the value you want to search");
        int x = sc.nextInt();
        if (bs.search(arr , x) == -1){
            System.out.println("The given is not found in the array.");
        }
        else{
            System.out.println("The element is found at " + bs.search(arr , x) +
                    " index.");
        }
    }
}
