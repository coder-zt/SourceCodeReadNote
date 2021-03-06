package com.coder.zt.sourcecodereadnote;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.coder.zt.sourcecodereadnote", appContext.getPackageName());
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