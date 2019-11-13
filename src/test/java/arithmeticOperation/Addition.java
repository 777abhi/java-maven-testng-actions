package test.java.arithmeticOperation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Addition {

    @Parameters({ "suite-param", "test-three-param" })
    @Test
    public void sampleTest(String param,String paramTwo ){

        System.out.println("Test - Addition Passed"+param+" 2 value--> "+paramTwo);
        Assert.assertEquals(1, 1);

    }

    @Test(groups = { "checkintest" })
    public void sampleTest1(){

        System.out.println("Test - Addition Passed -sampleTest1");

    }
} 
 