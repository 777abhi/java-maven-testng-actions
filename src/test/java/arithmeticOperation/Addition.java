package test.java.arithmeticOperation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Addition {

    @Test(groups = { "checkintest" })
    public void sampleTest(){

        System.out.println("Test - Addition Passed");
        Assert.assertEquals(1, 1);

    }

    @Test(groups = { "checkintest" })
    public void sampleTest1(){

        System.out.println("Test - Addition Passed -sampleTest1");

    }
} 
 