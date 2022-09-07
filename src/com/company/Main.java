package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] IN = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        int[] OUT = {6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        REMOVE(IN, 4, OUT);
        for (int el : OUT)
        {
            System.out.println(el);
        }
    }

    static void REMOVE(int[] IN, int X, int[] OUT)
    {
        int counter = 0;
        for (int i = 0, k = 0; i < 10; i++)
        {
            if (IN[i] == X)
            {
                counter++;
                continue;
            }
            OUT[k++] = IN[i];
        }

        for (int i = 1; i <= counter; i++)
        {
            OUT[10 - i] = 0;
        }
    }
}
