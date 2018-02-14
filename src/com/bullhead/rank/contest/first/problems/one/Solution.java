package com.bullhead.rank.contest.first.problems.one;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();

        int quries = scanner.nextInt();
        int index = scanner.nextInt();

        List<Q> qs = new ArrayList<>();

        int[] arr = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < quries; i++) {
            Q q = new Q();
            q.l = scanner.nextInt();
            q.r = scanner.nextInt();
            int result = Collections.binarySearch(qs, q, (q1, t1) -> {
                if (q1 == null) {
                    return 1;
                }
                if (q1.l <= t1.l && q1.r >= t1.r) {
                    return 0;
                } else {
                    return 1;
                }
            });

            if (result == 0) {
                continue;
            }
            qs.add(q);
        }
        for (Q q :
                qs) {
            arr = sort(q, arr);
            //  System.out.println(q);
        }

        System.out.println(arr[index]);

    }

    private static int[] sort(Q q, int[] arr) {
        int[] temp = Arrays.copyOfRange(arr, q.l, q.r + 1);

        Arrays.sort(temp);

        int index = 0;
        for (int i = q.l; i <= q.r; i++) {
            arr[i] = temp[index++];
        }

        return arr;
    }

    private static class Q {
        int l;
        int r;
    }

}
