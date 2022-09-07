package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int [] IN = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int [] OUT = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        REMOVE(IN, 2, OUT);
        for(int el: OUT)
        {
            System.out.println(el);
        }
    }

    static void REMOVE(int[] IN, int X, int[] OUT)
    {
        int counter = 0;
        for (int i = 0; i < IN.length; i++)
        {
            if (i+counter<IN.length&&IN[i+counter] == X)
                counter++;
            if (i+counter>=IN.length)
            {
                for(int k = 1; k<=counter;k++)
                {
                    OUT[IN.length-k]= 0;
                }
                break;
            }
            if(IN[i+counter]!=X)
            {
                OUT[i] = IN[i + counter];
            }
        }
    }
}
