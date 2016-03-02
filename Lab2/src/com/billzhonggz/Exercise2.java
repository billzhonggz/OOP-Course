package com.billzhonggz;

/**
 * Created by zhong on 16/3/2.
 */
public class Exercise2 {
    public static void main(String[] args) {
        //Adjust order of a string.
        String str = "ABCDEFGHIJ";
        String subStr1 = "";
        String subStr2 = "";
        subStr1 = str.substring(3,10);
        subStr2 = str.substring(0,3);
        System.out.println(subStr1 + subStr2);
    }
}
