package com.nuilewis.material3lib;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


public class addNumbersTest {

   private AddNumbers addTwoNumbers;

    @Before
    public void setUp(){
        addTwoNumbers = new AddNumbers();
    }

    @Test

    public  void testAddNumbers(){
        int result  = addTwoNumbers.addTwoIntergers(5,5);
        //Assert
        Assert.assertEquals(10, result);


    }



}
