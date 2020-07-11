package com.bullhead.rank.algos.freq;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) {
        Scanner     scan = new Scanner(System.in);
        List<Query> li   = new ArrayList<>();
        int         test = scan.nextInt();
        for (int i = 0; i < test; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            li.add(new Query(x, y));
        }
        countFrequency(li.subList(0, Math.min(li.size(), 100000)));

    }

    public static void countFrequency(List<Query> queries) {
        HashMap<Integer, Integer> opResult = new HashMap<>();
        StringBuilder             answer   = new StringBuilder();

        for (Query query : queries) {
            if (query.value < 1) {
                continue;
            }
            switch (query.operation) {
                case 1:
                    int count = opResult.getOrDefault(query.value, 0);
                    opResult.put(query.value, ++count);
                    break;
                case 2:
                    int count1 = opResult.getOrDefault(query.value, 0);
                    if (count1 > 0) {
                        opResult.put(query.value, --count1);
                    }
                    break;
                case 3:
                    answer.append(query.value < 100001 && opResult.containsValue(query.value) ? 1 : 0);
                    answer.append("\n");
                    break;
            }
        }
        System.out.println(answer);
    }

    private static class Query {
        private final int operation;
        private final int value;

        private Query(int operation, int value) {
            this.operation = operation;
            this.value     = value;
        }
    }

}