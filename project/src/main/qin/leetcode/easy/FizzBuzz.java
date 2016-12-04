package qin.leetcode.easy;

import org.junit.Test;
import qin.leetcode.core.LeetCodeTools;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz extends LeetCodeTools
{
    @Test
    public void printNumber()
    {
        int num = 20;

        List<Object> list = new ArrayList<>();

        for (int i = 1; i <= num; i++)
        {
            if (i % 15 == 0)
            {
                list.add("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                list.add("Fizz");
            }
            else if (i % 5 == 0)
            {
                list.add("Buzz");
            }
            else
            {
                list.add(i);
            }
        }

        info(list);

    }
}