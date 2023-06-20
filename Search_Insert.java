package com.Search;

import java.util.Scanner;

public class Search_Insert {
    boolean isFound = false;
    public int searchInsert(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        while (low <= high){

            int mid = (low + high)/2;
            if (arr[mid] == key){
                isFound = true;
                return mid;
            }
            if (key < arr[mid]){
                high = mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Search_Insert si = new Search_Insert();
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,6,8,7,9,10};
        System.out.print("Enter the value you want to search: ");
        int x = sc.nextInt();
        si.searchInsert(arr,x);
        if (!si.isFound){
            System.out.println("The given should be at " + si.searchInsert(arr , x) +
                    " index in the sorted array.");
        }
        else {
            System.out.println("The given element is at " + si.searchInsert(arr, x) +
                    " index in the sorted array.");
        }
    }
}