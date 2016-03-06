package com.billzhonggz;

/**
 * Created by zhong on 16/3/2.
 */
public class Exercise4
    {
        public static void main(String[] args)
            {
                /* Initialize the blank string array.*/
                String str[] = {"", "", "", "", "", ""};
                /* Assign each elements of the string.*/
                str[0] = "Mary Kate (F)";
                str[1] = "David Smith (M)";
                str[2] = "Evan Zhang (M)";
                str[3] = "Philip Lam (F)";
                str[4] = "Alan Lin (M)";
                str[5] = "Anthony Doe (M)";
                 /* Initialize two counters to count quantities of male and female students.*/
                int maleCount = 0;
                int femaleCount = 0;
                 /* Use for loop to count each strings.*/
                for (int i = 0; i <= 5; i++)
                    {
                         /* Count male / female when the index value is "M" / "F". */
                        if (str[i].indexOf("(M)") != -1)
                            maleCount++;
                        else if (str[i].indexOf("(F)") != -1)
                            femaleCount++;
                    }
                /* Print out the result. */
                System.out.println("Number of male is " + maleCount + ". Number of female is " + femaleCount + ".");
            }
    }

