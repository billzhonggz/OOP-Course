package com.billzhonggz;

/**
 * Created by ZHONG on 2016/3/5.
 */

public class Exercise6
{
    public static void main(String[] args)
    {
        /* A loop for rows. */
        for (int i = 1; i <= 10; i++)
        {
            /* A loop for columns. */
            for (int j = 1; j <= 10; j++)
            {
                /* Print out every results and make columns aligned. */
                System.out.print(i*j + "\t");
            }
            /* Print a line break.*/
            System.out.println("");
        }
    }
}
