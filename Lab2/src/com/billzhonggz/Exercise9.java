package com.billzhonggz;

/**
 * Created by ZHONG on 2016/3/5.
 */
public class Exercise9
{
    public static void main (String[] args)
    {
        /* Initialize three arrays. Two original arrays, one connected array. */
        int[] arr1 = {4,3,8,19,5,20,6};
        int[] arr2 = {2,7,28};
        int[] arr3 = new int[arr1.length + arr2.length];
        /* Connect two arrays to arr3. */
        for (int i = 0 ; i < arr3.length ; i++)
        {
            if (i < arr1.length)
                arr3[i] = arr1[i];
            else
                arr3[i] = arr2[i - arr1.length];
        }
        /* Use insertion algorithm to sort the array.*/
        int key;
        int current;
        int next;
        /* Foreach arr3. */
        for (next = 1 ; next < arr3.length ; next++)
        {
            key = arr3[next];
            current = next - 1;
            /* Insert next value before the current value. */
            while (current >= 0 && arr3[current] > key)
            {
                arr3[current+1] = arr3[current];
                current--;
            }
            arr3[current+1]=key;
        }
        /* Print out the sorted array. */
        for (int j = 0 ; j < arr3.length ; j++)
            System.out.print(arr3[j] + " ");
    }
}
