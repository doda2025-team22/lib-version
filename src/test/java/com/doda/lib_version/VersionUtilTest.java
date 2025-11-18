package com.doda.lib_version;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class VersionUtilTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public VersionUtilTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(VersionUtilTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    public void testGetVersion() {
        assertEquals(VersionUtil.getVersion(), "1.0.1-SNAPSHOT");
    }
}
