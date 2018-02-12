package com.bullhead.rank.algos.two;

import java.util.Scanner;

public class Solution {

    static int designerPdfViewer(int[] h, String word) {
        // Complete this function
        int maxWidth=h[getCharPosInEnglish(word.charAt(0))];
        for (char letter: word.toCharArray()) {
            int width=h[getCharPosInEnglish(letter)];
            if (maxWidth<width){
                maxWidth=width;
            }
        }
        return maxWidth*word.length();
    }
    private static int getCharPosInEnglish(char letter){
        return letter-97;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for (int h_i = 0; h_i < 26; h_i++) {
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int result = designerPdfViewer(h, word);
        System.out.println(result);
        in.close();
    }
}