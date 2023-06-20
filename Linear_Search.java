package com.Search;

public class Linear_Search {

    public int search(int[]arr , int x){
        for (int i=0; i<arr.length-1; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Linear_Search ls = new Linear_Search();
        int[] a = {3,7,2,0,9};
        if (ls.search(a , 1) == -1){
            System.out.println("Element not found in the given array.");
        }
        else {
            System.out.println("The element is fount at " +ls.search(a, 2) +
                    " index.");
        }
    }
}
