package com.bullhead.rank.probsol.five;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        try{
            String format=s.substring(s.length()-2);
            s=s.replace(format,"");
            String hourString=s.substring(0,2);
            int hour=Integer.parseInt(hourString);
            if (hour==12){
                if (format.equalsIgnoreCase("am")){
                    hour=0;
                }else if (format.equalsIgnoreCase("pm")){
                    hour=12;
                }
            }
            else if (format.equalsIgnoreCase("pm")){
                hour+=12;
            }
            return String.format("%02d",hour)+s.replace(hourString,"");
        }catch (NumberFormatException ex){
            //ignore
            return "00:00:00";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}