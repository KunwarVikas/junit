package com.junit.jacoco.mockito.calculatorservice;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @author Kunwar V.
 */
// @RunWith attaches a runner with the test class to initialize the test data.
// gives you automatic validation of framework usage, as well as an automatic initMocks()
@RunWith(MockitoJUnitRunner.class)
public class TestCalculator {
	
   //@InjectMocks annotation is used to create and inject the mock object
   @InjectMocks
   Calculator calculator = new Calculator();

   //@Mock annotation is used to create the mock object to be injected
   @Mock
   ICalculatorService iCalculatorService;

   @Test
   public void testAdd(){
      //add the behavior of calc service to add two numbers
      when(iCalculatorService.add(10.0,20.0)).thenReturn(30.00);
		
      //test the add functionality
      Assert.assertEquals(calculator.add(10.0, 20.0),30.0,0);
   }

   @Test
   public void testSubtract(){
      //add the behavior of calc service to add two numbers
      when(iCalculatorService.subtract(12.0,2.0)).thenReturn(10.00);

      //test the add functionality
      Assert.assertEquals(calculator.subtract(12.0,2.0),10.0,0);
   }

   @Test
   public void testMultiplication(){
      //add the behavior of calc service to add two numbers
      when(iCalculatorService.multiply(10.0,20.0)).thenReturn(200.00);

      //test the add functionality
      Assert.assertEquals(calculator.multiply(10.0, 20.0),200.0,0);
   }

   @Test
   public void testDivision(){
      //add the behavior of calc service to add two numbers
      when(iCalculatorService.divide(10.0,5.0)).thenReturn(2.00);

      //test the add functionality
      Assert.assertEquals(calculator.divide(10.0, 5.0),2.00,0);
   }
}