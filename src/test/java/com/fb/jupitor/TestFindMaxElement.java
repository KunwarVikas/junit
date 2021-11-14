package com.fb.jupitor;

import static org.junit.Assert.*;

import com.fb.jupitor.FindMaxElement;
import org.junit.Test;

/**
 * @author Kunwar V.
 */
public class TestFindMaxElement {
  
    @Test  
    public void testFindMax(){  
        assertEquals(4, FindMaxElement.findMax(new int[]{1,3,4,2}));
        assertEquals(54, FindMaxElement.findMax(new int[]{2,4,24,32,54,5,3,1}));
    }  
}  