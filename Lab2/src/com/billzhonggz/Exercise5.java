package com.billzhonggz;

/**
 * Created by zhong on 16/3/2.
 */
public class Exercise5 
{
    public static void main (String[] args)
    {
        /* Initialize the string.*/
        String str = "5/6/7/8/9";
        /* Replace slash by empty string. */
        str = str.replace("/","");
        /*Initialize a integer variable. */
        int result = 0;
        /* Assign transferred value to variable "result" and [rint out. */
        result = Integer.parseInt(str);
        System.out.println(result);
    }
}
