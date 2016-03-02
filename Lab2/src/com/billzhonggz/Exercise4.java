package com.billzhonggz;

/**
 * Created by zhong on 16/3/2.
 */
public class Exercise4 {
    public static void main (String[] args){
        String str[] = {"","","","","",""};
        str[0] = "Mary Kate (F)";
        str[1] = "David Smith (M)";
        str[2] = "Evan Zhang (M)";
        str[3] = "Philip Lam (F)";
        str[4] = "Alan Lin (M)";
        str[5] = "Anthony Doe (M)";
        /*for (int i=0; i<=5; i++) {
            System.out.println(str[i]);
        }*/
        int maleCount = 0;
        int femaleCount = 0;
        for (int i = 0; i <= 5; i++) {
            if (str[i].indexOf("(M)") != -1)
                maleCount++;
            else if (str[i].indexOf("(F)") != -1)
                femaleCount++;
        }
        System.out.println("Number of male is " + maleCount + ". Number of female is " + femaleCount + ".");
        }
    }

