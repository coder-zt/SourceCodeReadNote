package com.coder.zt.sourcecodereadnote;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testMpaPutReturn(){
        Map<String, String> map = new HashMap<>();
        String resultFirst = map.put("test", "first");
        System.out.println("resultFirst ==> " + resultFirst);
        String resultSecond = map.put("test", "second");
        System.out.println("resultFirst ==> " + resultSecond);
    }
}