package com.bullhead.rank.contest.first.problems.one;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int noOfElements=scanner.nextInt();
        int quries=scanner.nextInt();
        int index=scanner.nextInt();

        int[] arr=new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            arr[i]=scanner.nextInt();
        }
    }

}
