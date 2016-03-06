package com.billzhonggz;

/**
 * Created by ZHONG on 2016/3/5.
 */
public class Exercise8
{
    public static void main (String[] args)
    {
        /*Define a city is "big city" or not. */
        /* Initialize three variables by Zhuhai's information. */
        String name = "Zhuhai";
        boolean isCapital = false;
        int population = 1500000;
        int taxPerCitizen = 8000;
        long tax = population * taxPerCitizen;
        /* Initialize an error counting variable. */
        int error = 0;
        /* Judge whether the city is capital city. */
        if (isCapital)
        {
            /* Judge population. */
            if (population < 1000000)
                error++;
        }
        else
        {
            /* Judge population. */
            if (population < 20000)
                error++;
        }
        /* Judge total annual tax payment. */
        if (tax/100 < 150000000)
            error++;
        /* Make final judgement according to value of "error". */
        if (error == 0)
            System.out.println(name + " is a large city.");
        else
            System.out.println(name + " isn't a large city.");
    }
}
