package com.junit.jacoco.without.mock.findmax;

/**
 * @author Kunwar V.
 */
public class FindMaxElement {
    public static int findMax(int arr[]){  
        int max=0;  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
}  