package com.tutorial.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void whenEmptyString_thenAccept() {
	    App palindromeTester = new App();
	    assertTrue(palindromeTester.isPalindrome(""));
    }
}
