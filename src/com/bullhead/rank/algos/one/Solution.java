package com.bullhead.rank.algos.one;

import java.util.Scanner;

public class Solution {
    static int hurdleRace(int k, int[] height) {
        int max=max(height);
        if (max>k){
            return max-k;
        }else{
            return 0;
        }
    }
    private static int max(int[] arr){
        int max=arr[0];
        for (int number:arr) {
            if (number>max){
                max=number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int result = hurdleRace(k, height);
        System.out.println(result);
        in.close();
    }
}
