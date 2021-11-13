package com.junit.jacoco.mockito.calculatorservice;


/**
 * @author Kunwar V.
 */
public class Calculator {
   private ICalculatorService calcService;

   public void setCalculatorService(ICalculatorService calcService){
      this.calcService = calcService;
   }
   
   public double add(double input1, double input2){
      return calcService.add(input1, input2);
   }
   
   public double subtract(double input1, double input2){
      return calcService.subtract(input1, input2);
   }
   
   public double multiply(double input1, double input2){
      return calcService.multiply(input1, input2);
   }
   
   public double divide(double input1, double input2){
      return calcService.divide(input1, input2);
   }
}