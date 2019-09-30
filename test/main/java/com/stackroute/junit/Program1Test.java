package main.java.com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Program1Test {

    private Program1 program1;

    @Before
    public void setUp()
    {
        program1 = new Program1();

    }
    @After
    public void tearDown(){
        program1 = null;

    }
    @Test
    public void checkPalindromeAndSum(){

        assertEquals("22 is palindrome and the sum of even numbers is less than 25",program1.isPalindrome(22));
        assertEquals("2468642 is palindrome and the sum of even numbers is greater than 25",program1.isPalindrome(2468642));
        assertEquals("221 is not palindrome",program1.isPalindrome(221));
        assertEquals("-121 is not palindrome",program1.isPalindrome(-121));
    }

   /* @Test
    public void edgeCases(){

        assertEquals("Not a Number",program1.isPalindrome();
    }*/


}