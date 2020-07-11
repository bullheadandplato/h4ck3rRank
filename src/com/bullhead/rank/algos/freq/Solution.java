package com.bullhead.rank.algos.freq;

import java.util.*;

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
        countFrequency(li);

    }

    public static void countFrequency(List<Query> queries) {
        HashMap<Integer, Integer> opResult = new HashMap<>();
        StringBuilder             answer   = new StringBuilder();
        for (Query query : queries) {
            int count = opResult.getOrDefault(query.value, 0);
            switch (query.operation) {
                case 1:
                    opResult.put(query.value, ++count);
                    break;
                case 2:
                    if (count > 0) {
                        opResult.put(query.value, --count);
                    }
                    break;
                case 3:
                    answer.append(opResult.containsValue(query.value) ? 1 : 0);
                    answer.append("\n");
                    break;

            }
        }
        answer.deleteCharAt(answer.length() - 1);
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