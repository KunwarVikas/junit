package com.fb.jupitor.services.recordservice;


/**
 * This is example DAO class which serves the purpose for external dependency
 * This will not be tested directly in unit testing.
 * Test class will require to use Mockito to test this.
 * @author Kunwar V.
 */
public class DatabaseDAO{
    public void saveFile(String fileName) {
        System.out.println("Saved in database");
    }
}