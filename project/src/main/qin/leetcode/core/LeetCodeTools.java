package qin.leetcode.core;

import org.apache.log4j.Logger;

import java.util.Collection;
import java.util.Iterator;

/**
 * 核心类
 */
@SuppressWarnings("all")
public class LeetCodeTools
{
    private final String log4jLocation =
            "D:\\leetcode\\project\\src\\resources\\log4j.properties";

    public Logger getLogger()
    {
        return Logger.getLogger(LeetCodeTools.class);
    }

    public void info(Object... messages)
    {
        for (int i = 0; i < messages.length; i++)
        {
            getLogger().info(messages[i] + "=====================");
        }
    }

    public void info(Collection tCollection)
    {
        for (Iterator it = tCollection.iterator(); it.hasNext(); )
        {
            getLogger().info(it.next());
        }
    }
}