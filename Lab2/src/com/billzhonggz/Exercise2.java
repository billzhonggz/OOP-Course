package com.billzhonggz;

/**
 * Created by zhong on 16/3/2.
 */
public class Exercise2
    {
        public static void main(String[] args)
            {
                /* Adjust order of a string. */
                /* Initialize main string. */
                String str = "ABCDEFGHIJ";
                /* Initial two sub-strings. */
                String subStr1 = "";
                String subStr2 = "";
                /* Indexing two sub-strings from the main string. */
                subStr1 = str.substring(3, 10);
                subStr2 = str.substring(0, 3);
                /* Print out the result. */
                System.out.println(subStr1 + subStr2);
            }
    }
