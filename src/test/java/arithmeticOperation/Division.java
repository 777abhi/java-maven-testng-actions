package test.java.arithmeticOperation;

import org.testng.annotations.Test;

public class Division {
    
    @Test(dependsOnMethods={"testAdd", "testDivide"})
        public void sampleTest(){
        System.out.println("Test - Division Passed");

    }

    @Test
    public void testAdd(){
    System.out.println("Test - Division Passed -testAdd");

}
@Test
public void testDivide(){
System.out.println("Test - Division Passed-testDivide");

}
} 
 