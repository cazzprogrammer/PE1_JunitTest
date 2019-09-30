package main.java.com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Program2Test {
    private Program2 program2;
    @Before
    public void setUp() {
       program2 = new Program2();
    }

    @After
    public void tearDown(){
        program2 = null;
    }
    @Test
    public void CheckOddEven(){

        assertEquals("Out of range : Number Should be between 20 to 30",program2.checkOddEvenNumber(121));
        assertEquals("Tom",program2.checkOddEvenNumber(22));
        assertEquals("Jerry",program2.checkOddEvenNumber(25));


    }
}