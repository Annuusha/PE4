package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrenceTest {
    occur obj;

    @Before
    public void setUp() throws Exception {
        obj=new occur();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void occurrenceFuncSuccess() {
        String str="Java is java again java again count number of occurrence of a in the given string";
        String str2="anu anusha";
        assertEquals(11,obj.OccurrenceFunc(str,"a"));
        assertEquals(2,obj.OccurrenceFunc(str2,"n"));
    }
    @Test
    public void occurrenceFuncFailure() {
        String str="Java is java again java again count number of occurrence of a in the given string";
        String str2="anu anusha";
        assertNotEquals(10,obj.OccurrenceFunc(str,"a"));
        assertNotEquals(1,obj.OccurrenceFunc(str2,"n"));
    }
}