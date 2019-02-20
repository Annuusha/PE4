package com.stackroute.pe4;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceProgramTest {
    ReplaceProgram obj;

    @Before
    public void setUp() throws Exception {
        obj=new ReplaceProgram();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void replaceFuncSuccess() {
        assertEquals("faity fry",obj.ReplaceFunc("daily dry","d","l"));

    }
    @Test
    public void replaceFuncFailure() {
        assertNotEquals("faity fry",obj.ReplaceFunc("daily dry","h","l"));

    }
}