package com.junit.jacoco.without.mock.features;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 * @author Kunwar V.
 * Order
 *  oneTimeSetUp()
 *  setUp()
 *  testEmptyCollection()
 *  tearDown()
 *  setUp()
 *  testOneItemCollection()
 *  tearDown()
 *  oneTimeTearDown()
 */

public class JunitFeatures2 {
 
    private Collection collection;

    /**
     * Run once before any of the test methods in the class.
     */
    @BeforeClass
    public static void oneTimeSetUp() {
        System.out.println("Before class");
    }

    /**
     * If you allocate expensive external resources in a BeforeClass method you need
     * to release them after all the tests in the class have run.
     * Annotating a public static void method with @AfterClass causes
     * that method to be run after all the tests in the class have been run.
     */
    @AfterClass
    public static void oneTimeTearDown() {
        System.out.println("After class");
    }

    /**
     * Sets up the test fixture.
     * Called before every test case method
     */
    @Before
    public void setUp() {
        collection = new ArrayList();
    }

    /**
     * Tears down the test fixture.
     * Called after every test case method
     */
    @After
    public void tearDown() {
        collection.clear();
    }
 
    @Test
    public void testEmptyCollection() {
        assertTrue(collection.isEmpty());
    }
    
    @Test
    public void testOneItemCollection() {
        collection.add("itemA");
        assertEquals(1, collection.size());
    }
}