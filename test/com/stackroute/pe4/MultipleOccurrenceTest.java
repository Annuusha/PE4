package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurrenceTest {
    MultipleOccurrence obj;

    @Before
    public void setUp() throws Exception {
        obj=new MultipleOccurrence();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void multipleOccurrenceFuncSuccess() {
        assertEquals("Found at:4-6 Found at:10-12 Found at:27-29",obj.MultipleOccurrenceFunc("She sells seashells by the seashore","se"));
    }
    @Test
    public void multipleOccurrenceFuncFailure() {
        assertNotEquals("Found at:4-6 Found at:11-12 Found at:20-29",obj.MultipleOccurrenceFunc("She sells seashells by the seashore","se"));
        assertNotEquals(" ",obj.MultipleOccurrenceFunc("cat cat act","se"));
    }
}