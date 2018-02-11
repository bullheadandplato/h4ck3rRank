package com.bullhead.rank.probsol.four;

import java.util.Scanner;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int candles=0;
        int tallest=ar[0];
        for (int i = 0; i < n; i++) {
            if (tallest<ar[i]){
                tallest=ar[i];
                candles=1;
            }else if (ar[i]==tallest){
                candles++;
            }
        }
        return candles;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}