package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose obj;


    @Before
    public void setUp() throws Exception {
        obj=new Transpose();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void transposeFuncSuccess() {
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",obj.TransposeFunc("a quick brown fox jumps over the lazy dog"));
    }
    @Test
    public void transposeFuncFailure() {
        assertNotEquals("a kciuq nworb spmuj revo eht yzal god",obj.TransposeFunc("a quick brown fox jumps over the lazy dog"));
    }
}