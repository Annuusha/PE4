package com.stackroute.pe4;
import java.lang.String;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    Sort obj;

    @Before
    public void setUp() throws Exception {
        obj=new Sort();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortFuncSuccess() {

        assertEquals(new String[]{"anusha","is", "my", "name" },obj.SortFunc("my name is anusha"));
        assertEquals(new String[]{"are","how", "you" },obj.SortFunc("how are you"));
    }
    @Test
    public void sortFuncFailure() {

        assertNotEquals(new String[]{"anusha", "my", "name" },obj.SortFunc("my name is anusha"));
        assertNotEquals(new String[]{"are","how", "yo" },obj.SortFunc("how are you"));
    }
}