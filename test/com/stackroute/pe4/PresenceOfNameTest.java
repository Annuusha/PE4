package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PresenceOfNameTest {
    PresenceOfName obj;

    @Before
    public void setUp() throws Exception {
        obj=new PresenceOfName();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void presenceOfNameFuncSuccess() {
        assertEquals("Is Harry here ? true",obj.PresenceOfNameFunc("This is Harry "));
    }
    @Test
    public void presenceOfNameFuncFailure() {
        assertNotEquals("Is Harry here ? false",obj.PresenceOfNameFunc("This is Harry "));
    }
}