package com.bullhead.rank.probsol.one;

import java.util.Scanner;

public class Solution {

    static int diagonalDifference(int[][] a) {
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < a.length; i++) {
            diag1 += a[i][i];
            diag2 += a[i][a.length - i - 1];
        }
        return Math.abs(diag1 - diag2);


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}