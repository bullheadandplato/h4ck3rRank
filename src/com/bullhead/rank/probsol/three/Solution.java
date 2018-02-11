package com.bullhead.rank.probsol.three;

import java.util.Scanner;

public class Solution {

    static void miniMaxSum(int[] arr) {
        long min=-1;
        long max=0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr.length; j++) {
                if (j==i){
                    continue;
                }else {
                    sum+=arr[j];
                }
            }
            if(i==0){
                min=sum;
                max=sum;
                continue;
            }
           if (min>sum){
                min=sum;
            }
            if (max<sum){
                max=sum;
            }
        }
        System.out.println(min+ " "+max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
