package main.java.com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProgramdefaultTest {

    private Programdefault programdefault;

    @Before
    public void setUp(){

        programdefault=new Programdefault();
        //System.out.println("Inside Before");

        //Arrange
        Programdefault programdefault = new Programdefault();

    }
    @After
    public void tearDown(){

        programdefault=null;
        System.out.println("Inside After");
    }

    @Test
    public void uppercaseReturn(){
            String result = programdefault.concatAndToUpperCase("hello","world");

            assertEquals("HELLOWORLD",result);

    }

}