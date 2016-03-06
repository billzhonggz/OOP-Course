package com.billzhonggz;

/**
 * Created by zhong on 16/3/2.
 */
public class Exercise3 {
    public static void main(String[] args) {
        /* Initialize an integer variable to count quantity. */
        int count = 0;
        /* Create A loop for number from 1 to 10000.*/
        for (int i = 1; i <= 10000 ; i++)
        {
            /* Count remainders for every number from 1 to 10000. */
            if (i % 3 == 0)
                /* Increase variable "count" by 1 when remainder equals to zero. */
                count++;
        }
        /* Print out the result. */
        System.out.println("There is " + count + " numbers can be divided by 3 from 1 to 10000.");
    }
}
