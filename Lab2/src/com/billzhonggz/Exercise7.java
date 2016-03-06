package com.billzhonggz;

/**
 * Created by ZHONG on 2016/3/5.
 */
public class Exercise7
{
    public static void main(String[] args)
    {
        /* input points. */
        double point = 70;
        String grade = "";
        /* A series of judgement statements to judge the points and grades..*/
        if (point >= 0 && point <= 49.5)
            grade = "F";
        if (point >= 50 && point <= 59.5)
            grade = "D";
        if (point >= 60 && point <= 64.5)
            grade = "C";
        if (point >= 65 && point <= 69.5)
            grade = "C+";
        if (point >= 70 && point <= 74.5)
            grade = "B-";
        if (point >= 75 && point <= 79.5)
            grade = "B";
        if (point >= 80 && point <= 84.5)
            grade = "B+";
        if (point >= 85 && point <= 92.5)
            grade = "A-";
        if (point >= 93 && point <= 100)
            grade = "A";
        /* Print out the result.*/
        System.out.println("The grade of " + point + " is " + grade + ".");
    }
}
