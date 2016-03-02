package com.billzhonggz;

/**
 * Created by zhong on 16/3/2.
 */
public class Exercise3 {
    public static void main(String[] args) {
        int count = 0;
        //A loop for number from 1 to 10000.
        for (int i = 1; i <= 10000 ; i++)
        {
            if (i % 3 == 0)
                count++;
        }
        System.out.println("There is " + count + " numbers can be divided by 3 from 1 to 10000.");
    }
}
