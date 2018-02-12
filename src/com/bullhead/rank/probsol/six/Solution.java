package com.bullhead.rank.probsol.six;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        for (int i = 0; i < grades.length; i++) {
            int num=grades[i];
            if (num>=38){
                int difference=num%5;
                if (difference==3){
                    num=num+2;
                }else if (difference==4){
                    num=num+1;
                }
            }
            grades[i]=num;
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}