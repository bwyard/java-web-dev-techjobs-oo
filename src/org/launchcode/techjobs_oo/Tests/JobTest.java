package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_JobOne;
    Job test_JobTwo;
    Job jobTest;
    Job jobTestTwo;

    @Before
    public void createTwoJobObject(){
        test_JobOne = new Job();
        test_JobTwo = new Job();
        jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobTestTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId(){

        assertEquals(test_JobOne.getId(),test_JobTwo.getId()-test_JobOne.getId(),0);

    }
    @Test
    public void testJobConstructorSetsAllFields(){


        assertEquals( "Product tester",jobTest.getName());
        assertEquals( "ACME",jobTest.getEmployer().getValue());
        assertEquals("Desert",jobTest.getLocation().getValue());
        assertEquals( "Quality control",jobTest.getPositionType().getValue());
        assertEquals( "Persistence",jobTest.getCoreCompetency().getValue());
        assertTrue(jobTest instanceof Job);
    }
    @Test
    public void testJobsForEquality(){
        assertFalse(jobTest.equals(jobTestTwo));

    }
    @Test
    public void testBlankLineBeforeAndAfterToString(){
        assertTrue(jobTest.toString().startsWith("\n"));
        assertTrue(jobTest.toString().endsWith("\n"));
    }

}
