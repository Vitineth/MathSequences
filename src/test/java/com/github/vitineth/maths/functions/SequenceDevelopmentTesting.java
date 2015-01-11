package com.github.vitineth.maths.functions;

/**
 * Created by ryan on 10/01/15.
 */
public class SequenceDevelopmentTesting {

    public static void main(String args[]){
        String s = "13112221";
        String output = "";
        char current = s.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != current || i == s.length() - 1){
                if(s.charAt(i) == current)count++;
                output += count + "";
                output += current + "";
                current = s.charAt(i);
                count = 1;
            }else{
                count++;
            }
        }
        if(s.length() > 1 && s.charAt(s.length() - 1) != s.charAt(s.length() - 2)){
            output += count + "";
            output += current + "";
        }
        System.out.println(output);
    }

}
